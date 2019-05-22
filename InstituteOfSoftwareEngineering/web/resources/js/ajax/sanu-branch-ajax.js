/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
loadBranches();
function loadBranches() {
    $.getJSON("getAllBranch", function (resp) {
        var respon = resp;
        var table = $('#abcd').DataTable();
        table.clear().draw();
        for (var i in respon) {
            var temp = respon[i];
            table.row.add([temp.branchName, temp.branchLocation, temp.contactNum]).draw(false);
        }
    });
}

//setInterval("loadBranches()",1000);

$('#branchreg-btn').click(function () {
    var form = $('.branchadd').serialize();
    $.post("addBranch", form, function (response) {
        swal(response);
        loadBranches();
    });
});
