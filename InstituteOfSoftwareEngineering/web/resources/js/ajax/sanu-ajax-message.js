/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var mesNum;
$("#messageLoad").click(function () {
    $("#mesSe").fadeOut(1000);
});

$("#searchTextw").keydown(function () {
    $("#mesSe").css({"display": "block"});
    var seoform = $("#jhg").serialize();
    $.post("advSerch", seoform, function (response) {
        var arra = response;
        $("#mesSe").empty();
        for (var i in arra) {
            var array = arra[i];
            var d = "<li id='s'><a class='sanu' style='cursor: pointer' id='" + array.id + "'>" + array.firstName + " " + array.lastName + "</a></li>";
            $("#mesSe").append(d);
        }
        //click event  create a message in message que
        $('.sanu').click(function () {
            $.getJSON("searchUser?id=" + this.id + "", function (response) {//uder id
                var res = response;
//                $.getJSON("refresh", function () {});
                var html = "<div class='row sideBar-body'>\n\
                <div class='col-sm-3 col-xs-3 sideBar-avatar'>\n\
                    <div class='avatar-icon'>\n\
                        <img src='resources/profile/" + res.cf + "'>\n\
                    </div>\n\
                </div>\n\
                <div class='col-sm-9 col-xs-9 sideBar-main'>\n\
                    <div class='row'>\n\
                        <div class='col-sm-8 col-xs-8 sideBar-name'>\n\
                            <span class='name-meta'>" + res.firstName + " " + res.lastName + "</span>\n\
                        </div>\n\
                        <div class='col-sm-4 col-xs-4 pull-right sideBar-time'>\n\
                            <span class='time-meta pull-right'>18:18</span>\n\
                        </div>\n\
                    </div>\n\
                    </div>\n\
                </div>";
                $("#messageLoad").append(html);

                $("#mesUser").empty();
                var stm = "<img src='resources/profile/" + res.cf + "'>";
                $("#mesUser").append(stm);
                $("#meName").empty();
                var stm1 = "<a class='heading-name-meta'>" + res.firstName + " " + res.lastName + "</a>";
                $("#meName").append(stm1);
                $("#reId").empty();
                var xxt = "<input type='text' style='display:none' name='id' value='" + res.id + "'/>"
                $("#reId").append(xxt);
//                get the message
                loadMes();
            });
        });
    });
});

function loadMes() {
    lbsmesages();
}

$("#msendbtn").click(function () {
    $("#messageAre").animate({"scrollTop": $('#messageAre')[0].scrollHeight}, "slow");
    $("#messageAre").animate({"scrollTop": $('#messageAre')[0].scrollHeight}, "slow");
    var text = $("#commentf").val();
    var mform = $("#messageF").serialize();
    $.post("sndmes", mform, function (response) {

    });
    var shm = "<div class='col-sm-12 message-main-sender'>\n\
            <div class='sender'>\n\
                <div class='message-text'>\n\
                   " + text + "\n\
                </div>\n\
                <span class='message-time pull-right'>\n\
                    date time\n\
                </span>\n\
            </div>\n\
        </div>";
    $('#messageAre').append(shm);
    $("#commentf").val("");
    refresh();
});


//refresh messages
lbsmesages();
function lbsmesages() {
    $.getJSON("getAllMsg", function (response) {
        var res = response;
        $("#messageLoad").empty();
        for (var i in res) {
            var arraT = res[i];
            var html = "<div class='row sideBar-body sanu2' id='" + arraT.mid + "'>\n\
                    <li style='display:none' class='mani' id='" + arraT.fromUser + "'></li>\n\
                    <li style='display:none' class='vbf' id='" + arraT.toUser + "'>" + arraT.toUser + "</li>\n\
                <div class='col-sm-3 col-xs-3 sideBar-avatar'>\n\
                    <div class='avatar-icon'>\n\
                        <img class='iiimm' src='resources/profile/" + arraT.cf + "'>\n\
                    </div>\n\
                </div>\n\
                <div class='col-sm-9 col-xs-9 sideBar-main'>\n\
                    <div class='row'>\n\
                        <div class='col-sm-8 col-xs-8 sideBar-name'>\n\
                            <span class='name-meta'>" + arraT.ReceiversName + "</span>\n\
                        </div>\n\
                        <div class='col-sm-4 col-xs-4 pull-right sideBar-time'>\n\
                            <span class='time-meta pull-right'>18:18</span>\n\
                        </div>\n\
                    </div>\n\
                </div>\n\
            </div>";
            $("#messageLoad").prepend(html);
        }


        $('.sanu2').click(function () {
            $("#messageAre").animate({"scrollTop": $('#messageAre')[0].scrollHeight}, "slow");
            refresh();
            var ssrc = $(this).find(".iiimm").attr('src');
            var rn = $(this).find(".name-meta").text();
            $("#mesUser").empty();
            var stm = "<img src='" + ssrc + "'>";
            $("#mesUser").append(stm);
            $("#meName").empty();
            var stm1 = "<a class='heading-name-meta'>" + rn + "</a>";
            $("#meName").append(stm1);

            $("#reId").empty();
            var sanubb = $(this).find(".mani").attr('id');
            var xxt = "<input type='text' style='display:none' name='id' value='" + $(this).find(".vbf").text() + "'/>";
            $("#reId").append(xxt);
            $.getJSON("gelAllText?id=" + this.id + "", function (response) {
                var arr = response;
                $('#messageAre').empty();
                for (var i in arr) {
                    var temp = arr[i];
                    if (temp.owner == sanubb) {
                        var tem = "<div class='col-sm-12 message-main-sender'>\n\
                                <div class='sender'>\n\
                                    <div class='message-text'>\n\
                                       " + temp.message + "\n\
                                    </div>\n\
                                    <span class='message-time pull-right'>\n\
                                        " + temp.date_time + "\n\
                                    </span>\n\
                                </div>\n\
                            </div>";
                        $('#messageAre').append(tem);
                    } else {
                        var ans = "<div class='col-sm-12 message-main-receiver'>\n\
                                      <div class='receiver'>\n\
                                          <div class='message-text'>\n\
                                             " + temp.message + "\n\
                                          </div>\n\
                                          <span class='message-time pull-right'>\n\
                                               " + temp.date_time + "\n\
                                          </span>\n\
                                      </div>\n\
                                  </div>";
                        $('#messageAre').append(ans);
                    }


                }
            });
            $("#messageAre").animate({"scrollTop": $('#messageAre')[0].scrollHeight}, "slow");
        });
        refresh();
    });
}
setInterval("lbsmesages()", 20000);

