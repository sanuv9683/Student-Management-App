/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
loadAllFullTimeCourses();
function loadAllFullTimeCourses() {
    $.getJSON("getAFCbatch", function (resp) {
        $("#batch-cmb").empty();
        var tempArray = resp;
        for (var i in tempArray) {
            var temp = tempArray[i];
            $("#batch-cmb").append("<option>" + temp.batchID + "</option>");
        }
    });
}
loadAllFCourses();
function loadAllFCourses() {
    $.getJSON("getAllCourse", function (resp) {
        $("#crs-cmb").empty();
        var tempArray = resp;
        for (var i in tempArray) {
            var temp = tempArray[i];
            $("#crs-cmb").append("<option>" + temp.ccode + "</option>");
        }
    });
}



$("#batch-cmb").change(function () {
    var value = $('select#batch-cmb option:selected').val();
    $('#spid').empty();
    $('#spid').append(value);
    $.getJSON("getACFB?batch=" + value + "", function (resp) {
        var tempArray = resp;
        var table = $('#course-etb').DataTable();
        table.clear().draw();
        for (var i in tempArray) {
            var temp = tempArray[i];
            table.row.add([temp.ccode, temp.courseName, temp.courseFee]).draw(false);
        }
    });

});



$('#bcmerge-btn').click(function (){
  var form=  $('.coursebathform').serialize();
  $.post("bcmerge",form,function (resp){
      swal(resp);
  });
});