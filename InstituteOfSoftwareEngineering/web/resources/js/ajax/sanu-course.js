/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

loadAllCourses();
function loadAllCourses() {

    $.getJSON("getAllCourse", function (respp) {
        var table = $('#course-table').DataTable();
        table.clear().draw();
        var resp = respp;
        for (var i in resp) {
            var temp = resp[i];
            table.row.add([temp.ccode, temp.courseName, temp.courseFee]).draw(false);
        }
    });
}



$("#coursebtn").click(function () {
    var form = $('.courseform').serialize();
    $.post("addCourse", form, function (resp) {
        swal(resp);
        loadAllCourses();
    });
});


