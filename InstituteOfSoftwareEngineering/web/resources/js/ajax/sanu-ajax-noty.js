/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
getNoty();
function getNoty() {
    $.get("getMyAlerts", function (response) {
        var array = response;
        $("#nott").empty();
        $("#nottmes").empty();
        $("#nott").empty();
        $("#pnott").empty();
        $("#notti").empty();
        $(".cbz").empty();
        $("#cnum").empty();
        for (var i in array) {
            var temp = array[i];
            var typ = temp.ntype;
            if (typ == "mes") {
                var html = "<li><h5><a href='message' class='mty' id='" + temp.opId + "'><span class='dmrs' id='" + temp.opId2 + "' style='display:none'></span><span class='mtype' id='" + temp.ntype + "' style='display:none'></span><span class='teqornot' id='" + temp.reqornot + "' style='display:none'></span><span class='read' id='" + temp.read + "' style='display:none'></span><span class='nvq' id='" + temp.nid + "' style='display:none'></span><i  class='fa fa-users coral' data-toggle='tab' ></i>" + temp.notMessage + "</a></h5></li>";
                $("#nottmes").append(html);
            } else if (typ == "inter") {
                var html = "<li><h5><a href='#tab_default_3' data-toggle='tab' class='nty' id='" + temp.opId + "'><span class='dmrs' id='" + temp.opId2 + "' style='display:none'></span></span><span class='mtype' id='" + temp.ntype + "' style='display:none'></span><span class='teqornot' id='" + temp.reqornot + "' style='display:none'></span><span class='read' id='" + temp.read + "' style='display:none'></span><span class='nvq' id='" + temp.nid + "' style='display:none'></span><i  class='fa fa-users coral' data-toggle='tab' ></i>" + temp.notMessage + "</a></h5></li>";
                $("#nott").append(html);
            } else if (typ == "pfile") {
                var html = "<li><h5><a href='#tab_default_4' data-toggle='tab' class='pty' id='" + temp.opId + "'><span class='dmrs' id='" + temp.opId2 + "' style='display:none'></span></span><span class='mtype' id='" + temp.ntype + "' style='display:none'></span><span class='teqornot' id='" + temp.reqornot + "' style='display:none'></span><span class='read' id='" + temp.read + "' style='display:none'></span><span class='nvq' id='" + temp.nid + "' style='display:none'></span><i  class='fa fa-users coral' data-toggle='tab' ></i>" + temp.notMessage + "</a></h5></li>";
                $("#pnott").append(html);
            }

            var html = "<li><h5><a href='#tab_default_4' data-toggle='tab' class='rty' id='" + temp.opId + "'><span class='dmrs' id='" + temp.opId2 + "' style='display:none'></span></span><span class='mtype' id='" + temp.ntype + "' style='display:none'></span><span class='teqornot' id='" + temp.reqornot + "' style='display:none'></span><span class='read' id='" + temp.read + "' style='display:none'></span><span class='nvq' id='" + temp.nid + "' style='display:none'></span><i  class='fa fa-users coral' data-toggle='tab' ></i>" + temp.notMessage + "</a></h5></li>";
            $("#notti").append(html);

            var tts = '<div class="notice notice-danger notice-sm ">\n\
            <strong>Notice</strong> ' + temp.notMessage + '\n\
            </div>';
            $(".cbz").append(tts);

            var i = 0;
            if (temp.read == 'false') {
                ++i;
            }
            $("#cnum").append(i);
        }

        $(".nty").click(function () {
            var jid = this.id;
            var uid = $(this).find('.dmrs').attr('id');
            var bgff = $(this).find('.nvq').attr('id');
            var status = $(this).find('.read').attr('id');
            var nntype = $(this).find('.mtype').attr('id');
            var reqno = $(this).find('.teqornot').attr('id');
//            alert(status);
            if (reqno == "yes") {
                if (status == 'false') {
                    $.getJSON("loadInteri?uid=" + uid + "&jid=" + jid + "", function (response) {
                        $('#dirCirr').empty();
                        var html = "<div class='row ' style='padding-top: 10px '>\n\
                                    <div class='col-md-12 '> \n\
                                        <div class='row '> \n\
                                            <div class='panel panel-default ' id='tmt'> \n\
                                                <div class='panel-heading '>  <h4 >User Profile</h4></div> \n\
                                                <div class='panel-body '> \n\
                                                    <div class='col-md-4 col-xs-12 col-sm-6 col-lg-4 '> \n\
                                                        <img alt='User Pic ' src='resources/profile/" + response.cf + "' id='profile-image1 ' class='img-circle img-responsive '>  \n\
                                                    </div> \n\
                                                    <div class='col-md-8 col-xs-12 col-sm-6 col-lg-8 ' > \n\
                                                        <div class='container ' > \n\
                                                            <h2>" + response.firstName + " " + response.lastName + "</h2> \n\
                                                            <p>an   <b> " + response.possition + "</b></p> \n\
                                                        </div> \n\
                                                        <hr> \n\
                                                        <ul class='container details ' > \n\
                                                            <li><p><span class='glyphicon glyphicon-user one ' style='width:50px; '></span>" + response.tp + "</p></li> \n\
                                                            <li><p><span class='glyphicon glyphicon-envelope one ' style='width:50px; '></span>" + response.email + "</p></li> \n\
                                                        </ul> \n\
                                                        <hr> \n\
                                                        <div class='col-sm-5 col-xs-6 tital '>Applied Job: " + response.title + "</div> \n\
                                                    </div> \n\
                                                </div> \n\
                                            </div> \n\
                                        </div> \n\
                                    </div>  \n\
                                </div> \n\
                                <div class='row '> \n\
                                    <div class='col-xs-12 divider text-center '> \n\
                                        <div class='col-xs-12 col-sm-4  '> \n\
                                            <h2><strong>0</strong></h2> \n\
                                            <p><small>Followers</small></p> \n\
                                            <button id='wpool' class='btn btn-success btn-block '><span class='fa fa-plus-circle '></span> View The Job </button> \n\
                                        </div> \n\
                                        <div class='col-xs-12 col-sm-4  '> \n\
                                            <h2><strong>0</strong></h2> \n\
                                            <p><small>Following</small></p> \n\
                                            <button class='btn btn-info btn-block ' id='viewBtnf '><span class='fa fa-user-md fgs' id='" + response.id + "'></span> View Profile </button>\n\
                                            </div>\n\
                                            <div class='col-xs-12 col-sm-4'>\n\
                                            <h2><strong>0</strong></h2>\n\
                                            <p><small>Ratings</small></p>\n\
                                            <div class='btn-group dropup btn-block '>\n\
                                                <button type='button ' id='cancbtn ' class='btn btn-primary btn-block '><span class='fa fa-gear '></span> Reject The Interview</button>\n\
                                            </div>\n\
                                        </div> \n\
                                    </div> \n\
                                </div> \n\
                                <hr>\n\
                                <div class='row '>\n\
                                    <form id='iacct'  method='POST'> \n\
                                        <div class='col-xs-12'>\n\
                                            <div class='row'>\n\
                                                <div class='form-group'>\n\
                                                    <div class='col-sm-5'>  \n\
                                                        <label class='control-label' for='textinput'>Select Interview Date</label>\n\
                                                        <input  name='idate' id='idate' class='form-control' type='date'/>\n\
                                                    </div>\n\
                                                    <div class='col-sm-5'>\n\
                                                        <label class='control-label' for='textinput'>Interview Call ID</label>\n\
                                                        <input  name='intervId' id='intervId' class='form-control' type='text'/>\n\                                                                                                        </div>\n\
                                                </div>\n\
                                            </div>\n\
                                            <div class='row'>\n\
                                                <div class='col-md-5'>\n\
                                                    <label class='control-label' for='textinput'>Interview Time</label>\n\
                                                    <div class='input-group clockpicker'>\n\
                                                        <input type='text' class='form-control' value='09:30' id='itime' name='itime'>\n\
                                                        <span class='input-group-addon'>\n\
                                                            <span class='glyphicon glyphicon-time'></span>\n\
                                                        </span>\n\
                                                   \n\
                                                </div>\n\
                                            </div>\n\
                                        </div>\n\
                                        <div class='col-xs-12 divider text-center'> \n\
                                            <div class='col-sm-12'> \n\
                                                <div class='span4 well' style='padding-bottom:5px;margin-top: 20px '>                                                                                                   \n\
                                                    <input  name='id' value='" + response.id + "' style='display:none'> \n\
                                                            <input  name='nnid' value='" + bgff + "' style='display:none'> \n\
                                                            <input  name='jid' value='" + response.jid + "' style='display:none'> \n\
                                                            <textarea class='form-control' id='new_message' name='new_message' \n\
                                                            placeholder='Type in your message' rows='5'></textarea> \n\
                                                    <h6 class='pull-right'></h6> \n\
                                                    <button class='btn btn-info' id='intbtn' type='button' style='margin-top: 5px'>Accsept the Invitation And Send Message</button>                                                                                               \n\
                                                </div> \n\
                                            </div> \n\
                                        </div> \n\
                                    </form>\n\
                                </div>";
                        $('#dirCirr').append(html);
                        intIdGen();
                        $('#tmt').css({"background": "url('resources/profile/" + response.wp + "')", "background-size": "cover", "background-repeat": "none", "color": "white"});

                        $('.clockpicker').clockpicker();


                        webshims.setOptions('waitReady', false);
                        webshims.setOptions('forms-ext', {types: 'date'});
                        webshims.polyfill('forms forms-ext');

                        $("#itime,#intervId,#idate").on('input', function () {
                            $("#new_message").empty();
                            var tem = "Hello " + response.firstName + " " + response.lastName + " We reviewd your request on our job vacancy : " + response.title + " and consider to accept your invitation. We would thank you for applying our job vacancies. We decide to Interview you On " + $("#idate").val() + "..  at " + $("#itime").val() + "... You are sheduled to interview via MyRatings online interviewing system. Your ID is : " + $("#intervId").val() + " Please use this id on Myratings Sytem and connect with us to the sheduled time. Your Invitation will be canceld if you not faced to the right time. Thank You..!";
                            $("#new_message").append(tem);
                        });
                        $("#itime,#intervId,#idate").click(function () {
                            $("#new_message").empty();
                            var tem = "Hello " + response.firstName + " " + response.lastName + " We reviewd your request on our job vacancy : " + response.title + " and consider to accept your invitation. We would thank you for applying our job vacancies. We decide to Interview you On " + $("#idate").val() + "..  at " + $("#itime").val() + "... You are sheduled to interview via MyRatings online interviewing system. Your ID is : " + $("#intervId").val() + " Please use this id on Myratings Sytem and connect with us to the sheduled time. Your Invitation will be canceld if you not faced to the right time. Thank You..!";
                            $("#new_message").append(tem);
                        });

                        $('#viewBtnf').click(function () {
                            var id = $(this).find(".fgs").attr("id");
                            window.open('search?id=' + id + '', '_blank');

                        });
                        $('#wpool').click(function () {
//                            alert('');
                             alertify.log("This was Aded to Pool..!");
                            
                        });
                        $('#cancbtn').click(function () {
//                            alert('');
//                             alertify.log("You Canceled This");
                        });
                        $('#intbtn').click(function () {
                            var fo = $('#iacct').serialize();
                            $.post("InviteForInterview", fo, function (response) {
                                if (response == 'true') {
                                    alertify.alert("Your invitation was succsesfully sended to the applicent...!");
                                    $('#wpool').attr('disabled', true);
                                    $('#cancbtn').attr('disabled', true);
                                    $('#intbtn').attr('disabled', true);
                                } else {
                                    alertify.alert("There May Be Something Wrong..Please try again..!");
                                }

                            });
                        });
                    });
                } else {
//                    alert('');
                    alertify.log("You Have Allredy Reacted on this Request..!");
                }

            } else {
                $.getJSON("loadInterr?nid=" + bgff + "", function (response) {
                    $('#dirCirr').empty();
                    var dd = '<div class="row">\n\
                            <div class="col-md-12">\n\
                                    <div class="panel panel-default coupon">\n\
                                        <div class="panel-heading" id="head">\n\
                                            <div class="panel-title" id="title">\n\
                                                <!--<img src="resources/profile/mr.PNG">-->\n\
                                                <span class="hidden-xs">Reply For Your Job Request</span>\n\
                                                <span class="visible-xs">Reply For Your Job Request</span>\n\
                                            </div>\n\
                                        </div>\n\
                                        <div class="panel-body">\n\
                                            <img src="resources/profile/wallsuc.png" class="coupon-img img-rounded">\n\
                                            <div class="col-md-9">\n\
                                                <ul class="items">\n\
                                                    <li>Applied Job : ' + response.jid + '-' + response.jobTit + '</li>\n\
                                                    <li>Interview Date : ' + response.interdate + ' </li>\n\
                                                    <li>Interview Time : ' + response.interTime + ' </li>\n\
                                                    <li>Interview ID : ' + response.interID + '</li>\n\
                                                    <li>Interviewer : ' + response.interName + '</li>\n\
                                                </ul>\n\
                                            </div>\n\
                                            <div class="col-md-3">\n\
                                                <div class="offer">\n\
                                                    <span class="usd"><sup></sup></span>\n\
                                                    <span class="number"></span>\n\
                                                    <span class="cents"><sup></sup></span>\n\
                                                </div>\n\
                                            </div>\n\
                                            <div class="col-md-12">\n\
                                                <p class="disclosure" id="inmas">' + response.message + '</p>\n\
                                            </div>\n\
                                        </div>\n\
                                        <div class="panel-footer">\n\
                                            <div class="coupon-code">\n\
                                                MyRatings\n\
                                                <span class="print">\n\
                                                    <a href="#" class="btn btn-link"><i class="fa fa-lg fa-print"></i> Print Coupon</a>\n\
                                                </span>\n\
                                            </div>\n\
                                            <div class="exp">Please take your chance due date</div>\n\
                                        </div>\n\
                                    </div>\n\
                                </div>\n\
                            </div>';
                    $('#dirCirr').append(dd);
                });
            }

        });
    });
}

setInterval("getNoty()", 4000);


//function Generator() {};
//Generator.prototype.rand =  Math.floor(Math.random() * 100) + Date.now();
//Generator.prototype.getId = function() {
//return this.rand++;
//};
//var idGen =new Generator();
//alert(idGen.getId());

function intIdGen() {
    var RN = Math.floor(Math.random() * 9999999999);
    while (String(RN).length < 10) {
        RN = '0' + RN;
    }
    $("#intervId").val("");
    $("#intervId").val(RN);
}

$(window).load(function () {
    intIdGen();
});
