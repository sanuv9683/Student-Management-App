/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

loadAllFullTimeBatches();
function loadAllFullTimeBatches() {
    $.getJSON("getAFCbatch", function (resp) {
        $("#cmb-batch").empty();
        var tempArray = resp;
        for (var i in tempArray) {
            var temp = tempArray[i];
            $("#cmb-batch").append("<option>" + temp.batchID + "</option>");
            loadseco();
        }
    });


}


$("#cmb-batch").change(function () {
    var value = $('select#cmb-batch option:selected').val();
    $.getJSON("getACFB?batch=" + value + "", function (resp) {
        var tempArray = resp;
        $("#cmb-crs").empty();
        for (var i in tempArray) {
            var temp = tempArray[i];
            $("#cmb-crs").append("<option>" + temp.ccode + "</option>");
        }
    });

});



$("#sem-btn").click(function () {
    var form = $('.semform').serialize();
    $.post("addSemester", form, function (resp) {
        swal(resp);
        loadAllC();
    });
});



$('#semname').change(function () {
    var value = $('select#semname option:selected').val();
    if (value == "Semester One") {
        $('#cnumber').val("01");
    } else if (value == "Semester Two") {
        $('#cnumber').val("02");
    } else if (value == "Semester Three") {
        $('#cnumber').val("03");
    } else if (value == "Semester Four") {
        $('#cnumber').val("04");
    } else if (value == "Semester Five") {
        $('#cnumber').val("05");
    } else if (value == "Semester Six") {
        $('#cnumber').val("06");
    } else if (value == "Semester Seven") {
        $('#cnumber').val("07");
    } else if (value == "Semester Eight") {
        $('#cnumber').val("08");
    } else if (value == "Semester Nine") {
        $('#cnumber').val("09");
    } else if (value == "Semester Ten") {
        $('#cnumber').val("10");
    }
});


$('#cmb-batch,#cmb-crs').change(function () {
    var batch = $('select#cmb-batch option:selected').val();
    var cou = $('select#cmb-crs option:selected').val();
    $.getJSON("semforbc?batch=" + batch + "&course=" + cou + "", function (resp) {
        var tempArray = resp;
        var table = $('#sem-table').DataTable();
        table.clear().draw();
        for (var i in tempArray) {
            var tem = tempArray[i];
            table.row.add([tem.semesterNo, tem.semName, tem.id]).draw(false);
        }
    });
});


function loadAllC() {    
    var batch = $('select#cmb-batch option:selected').val();
    var cou = $('select#cmb-crs option:selected').val();
    $.getJSON("semforbc?batch=" + batch + "&course=" + cou + "", function (resp) {
        var tempArray = resp;
        var table = $('#sem-table').DataTable();
        table.clear().draw();
        for (var i in tempArray) {
            var tem = tempArray[i];
            table.row.add([tem.semesterNo, tem.semName, tem.id]).draw(false);
        }
    });
}



function loadseco() {
    var value = $('select#cmb-batch option:selected').val();
    $.getJSON("getACFB?batch=" + value + "", function (resp) {
        var tempArray = resp;
        $("#cmb-crs").empty();
        for (var i in tempArray) {
            var temp = tempArray[i];
            $("#cmb-crs").append("<option>" + temp.ccode + "</option>");
        }
    });  
}