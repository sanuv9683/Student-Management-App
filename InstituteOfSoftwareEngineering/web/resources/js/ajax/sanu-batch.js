/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the tremplate in the editor.
 */





loadBr();
function loadBr() {
    $.getJSON("getAllBranch", function (resp) {
        var respon = resp;
        for (var i in respon) {
            var tem = respon[i];
            var opt = new Option(tem.branchName);
            $("#btype").append(opt);
        }
    });
}

$('#batch-btn').click(function () {
    var form = $('.batchadd').serialize();
    $.post("addBatch", form, function (response) {
        swal(response);
        loadBathes();
    });
});



//load branches//
loadBathes();
function loadBathes() {
    $.getJSON("getAllBatches", function (resp) {
        var respon = resp;
        var table = $('#batch-t').DataTable();
        table.clear().draw();
        for (var i in resp) {
            var temp = resp[i];
            table.row.add([temp.batchID, temp.batchNo, temp.startDate, temp.batchType, temp.gpa, temp.total]).draw(false);
        }

    });
}