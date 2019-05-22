<%-- 
    Document   : registration
    Created on : Jan 18, 2018, 9:17:27 AM
    Author     : Sanu Vithanage
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Institute Of Software Engineering</title>
        <link rel="icon" href="resources/images/sanu.png" type="image/png">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">

        <!-- Bootstrap Core Css -->
        <link href="resources/plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

        <!-- Waves Effect Css -->
        <link href="resources/plugins/node-waves/waves.css" rel="stylesheet" />

        <!-- Animation Css -->
        <link href="resources/plugins/animate-css/animate.css" rel="stylesheet" />

        <!-- Sweet Alert Css -->
        <link href="resources/plugins/sweetalert/sweetalert.css" rel="stylesheet" />
        <link href="resources/plugins/bootstrap-select/css/bootstrap-select.css" rel="stylesheet" />
        <!-- Custom Css -->
        <link href="resources/plugins/jquery-datatable/skin/bootstrap/css/dataTables.bootstrap.css" rel="stylesheet">
        <link href="resources/css/style.css" rel="stylesheet">

        <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
        <link href="resources/css/themes/all-themes.css" rel="stylesheet" />
        <style>
            .card .body .col-xs-4, .card .body .col-sm-4, .card .body .col-md-4, .card .body .col-lg-4 {
                margin-bottom: 4px; 
            }
            @keyframes anima{
                0%{margin-left: 4px;}
                25%{margin-left: 0px;}
                50%{margin-left: 4px;}
                75%{margin-left: 0px;}
                100%{margin-left: 4px;}
            }
            .collapsed{
                animation-name: anima;
                animation-duration: 1s;
                transition: all;
                transition-duration: 1s;
                animation-iteration-count: infinite;
            }
        </style>
    </head>
    <body class="theme-red" style="background-color: white;background: url(resources/images/startup-photos_1.jpg);background-repeat: no-repeat;background-size: cover">
        <%
            if (!session.isNew() && (session.getAttribute("cuAdmin") != null || session.getAttribute("cuUser") != null)) {
            } else {
                response.sendRedirect("index");
            }
        %>
        <!-- Page Loader -->
        <%@include file="pre-loader.jsp" %>
        <!-- #END# Page Loader -->
        <!-- Overlay For Sidebars -->
        <div class="overlay"></div>
        <!-- #END# Overlay For Sidebars -->
        <!-- Search Bar -->
        <div class="search-bar">
            <div class="search-icon">
                <i class="material-icons">search</i>
            </div>
            <input type="text" placeholder="START TYPING...">
            <div class="close-search">
                <i class="material-icons">close</i>
            </div>
        </div>
        <!-- #END# Search Bar -->
        <!-- Top Bar -->
        <!-- #Top Bar -->
        <%@include file="adm-header.jsp" %>
        <%@include file="adm-sidebar.jsp" %>
        <!-- #Top Bar -->

        <section class="content" style="margin:20px 1px 0 245px;">
            <div class="container-fluid">
                <div class="row clearfix">
                    <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8">                     
                        <div class="card animated zoomIn">  
                            <div class="footer bg-pink" style="padding: 2px"></div>
                            <div class="body" style="max-height: 440px;overflow-x: hidden">
                                <div class="row">
                                    <div class="col-sm-3">
                                        <div  align="center"> <img alt="User Pic" src="https://x1.xingassets.com/assets/frontend_minified/img/users/nobody_m.original.jpg" id="profi" class="img-circle img-responsive" max-width="100px"> 
                                        </div>
                                        <br>
                                        <div class="tital font-bold">Join Date:</div><div class="" style="font-size: 10px;" id="jdatea"><div class="preloader pl-size-xs"><div class="spinner-layer pl-pink"><div class="circle-clipper left"><div class="circle"></div></div><div class="circle-clipper right"><div class="circle"></div></div></div></div></div>
                                        <div class="clearfix"></div>
                                        <div class="bot-border"></div>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="row">
                                            <div class="col-md-4">
                                                <div class="tital font-bold">Student ID:</div><div class=""  style="font-size: 12px;" id="stuid"><div class="preloader pl-size-xs"><div class="spinner-layer pl-pink"><div class="circle-clipper left"><div class="circle"></div></div><div class="circle-clipper right"><div class="circle"></div></div></div></div></div>
                                                <div class="clearfix"></div>
                                                <div class="bot-border"></div>
                                            </div>
                                            <div class="col-md-4">
                                                <div class="tital font-bold" >Init Name:</div><div class=""  style="font-size: 12px;" id="initName"><div class="preloader pl-size-xs"><div class="spinner-layer pl-pink"><div class="circle-clipper left"><div class="circle"></div></div><div class="circle-clipper right"><div class="circle"></div></div></div></div></div>
                                                <div class="clearfix"></div>
                                                <div class="bot-border"></div>
                                            </div>
                                            <div class="col-md-4">
                                                <div class="tital font-bold">First Name:</div><div class=""  style="font-size: 12px;" id="fname"> <div class="preloader pl-size-xs"><div class="spinner-layer pl-pink"><div class="circle-clipper left"><div class="circle"></div></div><div class="circle-clipper right"><div class="circle"></div></div></div></div></div>
                                                <div class="clearfix"></div>
                                                <div class="bot-border"></div>
                                            </div>

                                        </div>
                                        <div class="row">
                                            <div class="col-md-4">
                                                <div class=" tital font-bold">Last Name:</div><div class=""  style="font-size: 12px;" id="laname"> <div class="preloader pl-size-xs"><div class="spinner-layer pl-pink"><div class="circle-clipper left"><div class="circle"></div></div><div class="circle-clipper right"><div class="circle"></div></div></div></div></div>
                                                <div class="clearfix"></div>
                                                <div class="bot-border"></div>
                                            </div>
                                            <div class="col-md-4">
                                                <div class="tital font-bold">Gender:</div><div class=""  style="font-size: 12px;" id="gender"><div class="preloader pl-size-xs"><div class="spinner-layer pl-pink"><div class="circle-clipper left"><div class="circle"></div></div><div class="circle-clipper right"><div class="circle"></div></div></div></div></div>
                                                <div class="clearfix"></div>
                                                <div class="bot-border"></div>
                                            </div>
                                            <div class="col-md-4">
                                                <div class="tital font-bold">NIC:</div><div class=""  style="font-size: 12px;" id="nic"><div class="preloader pl-size-xs"><div class="spinner-layer pl-pink"><div class="circle-clipper left"><div class="circle"></div></div><div class="circle-clipper right"><div class="circle"></div></div></div></div></div>
                                                <div class="clearfix"></div>
                                                <div class="bot-border"></div>

                                            </div>

                                        </div>
                                        <div class="row">
                                            <div class="col-md-4">
                                                <div class="">
                                                    <div class="tital font-bold">Email:</div><div class=""  style="font-size: 12px;" id="email"><div class="preloader pl-size-xs"><div class="spinner-layer pl-pink"><div class="circle-clipper left"><div class="circle"></div></div><div class="circle-clipper right"><div class="circle"></div></div></div></div></div>
                                                    <div class="clearfix"></div>
                                                    <div class="bot-border"></div>
                                                </div>
                                            </div>
                                            <div class="col-md-4">
                                                <div class="tital font-bold">Address :</div><div class=""  style="font-size: 12px;" id="address"><div class="preloader pl-size-xs"><div class="spinner-layer pl-pink"><div class="circle-clipper left"><div class="circle"></div></div><div class="circle-clipper right"><div class="circle"></div></div></div></div></div>
                                            </div>
                                            <div class="col-md-4">
                                                <div class="tital font-bold">DOB:</div><div class=""  style="font-size: 10px;" id="jdate"><div class="preloader pl-size-xs"><div class="spinner-layer pl-pink"><div class="circle-clipper left"><div class="circle"></div></div><div class="circle-clipper right"><div class="circle"></div></div></div></div></div>
                                                <div class="clearfix"></div>
                                                <div class="bot-border"></div>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="panel">
                                        <div class="panel-heading " role="tab" id="headingTwo_1">
                                            <h4 class="panel-title">
                                                <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion_1" href="#collapseTwo_1" aria-expanded="false" aria-controls="collapseTwo_1" style="text-decoration: none;">
                                                    More Details
                                                </a>
                                            </h4>
                                        </div>
                                        <div id="collapseTwo_1" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo_1">
                                            <div class="panel-body">
                                                <div class="row">
                                                    <div class="col-md-4" style="border-right: 1.2px solid #252323;min-height: 260px;">
                                                        <div class="">
                                                            <div class="m-b--35 font-bold"><u>Gardians Info</u></div>
                                                            <ul class="dashboard-stat-list">
                                                                <li >
                                                                    <span class="font-bold" style="font-size: 13px">Name</span>
                                                                    <span class="pull-right"  style="font-size: 12px;" id="gname"><b ></b></span>
                                                                </li>
                                                                <li>
                                                                    <span class="font-bold" style="font-size: 13px">TP</span>
                                                                    <span class="pull-right"  style="font-size: 12px;" id="gtp"><b></b> </span>
                                                                </li>
                                                                <li>
                                                                    <span class="font-bold" style="font-size: 13px">Home Tp</span>
                                                                    <span class="pull-right"  style="font-size: 12px;" id="gtp1"><b ></b></span>
                                                                </li>
                                                                <li>
                                                                    <span class="font-bold" style="font-size: 13px">Address 1</span>
                                                                    <span class="pull-right"  style="font-size: 12px;" id="gaddres1"><b ></b></span>
                                                                </li>

                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-4" style="border-right: 1.2px solid #252323;min-height: 260px;">
                                                        <div class="">
                                                            <div class="">
                                                                <div class="m-b--35 font-bold"><u>School Info</u></div>
                                                                <ul class="dashboard-stat-list">
                                                                    <li id="schinfo"  style="font-size: 12px;"></li>
                                                                    <li id="schinfo1"  style="font-size: 12px;"></li>
                                                                    <li></li>
                                                                </ul>

                                                                <div class="m-b--35 font-bold"><u>University Info</u></div>
                                                                <ul class="dashboard-stat-list" >
                                                                    <li id="uniinfo"  style="font-size: 12px;"></li>
                                                                    <li id="uniinfo1"  style="font-size: 12px;"></li>
                                                                    <li></li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-4" >
                                                        <div class="">
                                                            <div class="">
                                                                <div class="font-bold m-b--35"><u>Batches Info</u></div>
                                                                <ul class="dashboard-stat-list">
                                                                    <li>
                                                                        <span class="font-bold" style="font-size: 13px">Reg Date</span>
                                                                        <span class="pull-right"  style="font-size: 12px;" id="regdate"><small></small></span>
                                                                    </li>
                                                                    <li>
                                                                        <span class="font-bold" style="font-size: 13px"> Branch</span>
                                                                        <span class="pull-right"  style="font-size: 12px;" id="branch"><small></small></span>
                                                                    </li>
                                                                    <li>
                                                                        <span class="font-bold" style="font-size: 13px"> Type</span>
                                                                        <span class="pull-right"  style="font-size: 12px;" id="batype"> <small></small></span>
                                                                    </li>
                                                                    <li>
                                                                        <span class="font-bold" style="font-size: 13px"> Batch</span>
                                                                        <span class="pull-right"  style="font-size: 12px;" id="batch"><b ></b> <small></small></span>
                                                                    </li>
                                                                    <li>
                                                                        <span class="font-bold" style="font-size: 13px"> Transfer</span>
                                                                        <span class="pull-right"  style="font-size: 12px;" id="batch1"><b ></b> <small></small></span>
                                                                    </li>
                                                                    <li>
                                                                        <span class="font-bold" style="font-size: 13px">Transfer</span>
                                                                        <span class="pull-right"  style="font-size: 12px;" id="batch2"><b ></b> <small></small></span>
                                                                    </li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                </div>
                            </div>
                            <div class="footer bg-pink" style="padding: 2px"></div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="card animated shake">
                                    <div class="body">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" name="stuID" id="stuID" class="form-control">
                                                <label class="form-label">Student ID/NIC</label>
                                            </div>                                 
                                        </div>                                     
                                    </div>
                                </div> 
                            </div>                           
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="card animated lightSpeedIn">

                                    <div class="body">
                                        <div class="form-group form-float">
                                            <!--..-->
                                            <div class="form-line">
                                                <p>
                                                    <b>SELECT BATCH</b>
                                                </p>
                                                <select class="form-control show-tick" name="batch" id="cmb-batch" data-live-search="true">

                                                </select>
                                            </div>
                                            <!--..-->
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <p>
                                                    <b>SELECT COURSE</b>
                                                </p>
                                                <select class="form-control show-tick" name="course" id="cmb-crs" data-live-search="true">

                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <p>
                                                    <b>SELECT SEMESTER</b>
                                                </p>
                                                <select class="form-control show-tick" name="sname" id="semname" data-live-search="true">

                                                </select>
                                            </div>
                                        </div>                                       
                                    </div>
                                </div>
                            </div>                          
                        </div>

                    </div>
                </div>

                <div class="row clearfix">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                        <div class="card animated slideInUp">
                            <div class="header">
                                <h2 id="sbs">SEMESTER</h2>                           
                            </div>
                            <div class="body">
                                <div class="table-responsive">
                                    <table id="mainTable" class="table table-striped ">
                                        <thead class="bg-pink">
                                            <tr>
                                                <th>Sub Name</th>
                                                <th>Result 1</th>
                                                <th>Result 2</th>
                                                <th>Result 3</th>
                                                <th>Grade</th>
                                                <th>Credit</th>
                                                <th>GPA</th>
                                            </tr>
                                        </thead>
                                        <tbody class="subs">

                                        </tbody>
                                        <tfoot class="bg-pink">
                                            <tr>
                                                <th>Sub Name</th>
                                                <th>Result 1</th>
                                                <th>Result 2</th>
                                                <th>Result 3</th>
                                                <th>Grade</th>
                                                <th>Credit</th>
                                                <th>GPA</th>
                                            </tr>
                                        </tfoot>
                                    </table>
                                </div>
                                <button class="btn btn-primary pull-right">Genarate Transcript</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# CPU Usage -->
        </section>

        <!-- Jquery Core Js -->
        <script src="resources/plugins/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core Js -->
        <script src="resources/plugins/bootstrap/js/bootstrap.js"></script>

        <!-- Select Plugin Js -->
        <script src="resources/plugins/bootstrap-select/js/bootstrap-select.js"></script>

        <!-- Slimscroll Plugin Js -->
        <script src="resources/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>

        <!-- Jquery Validation Plugin Css -->
        <script src="resources/plugins/jquery-validation/jquery.validate.js"></script>

        <!-- JQuery Steps Plugin Js -->
        <script src="resources/plugins/jquery-steps/jquery.steps.js"></script>

        <!-- Sweet Alert Plugin Js -->
        <script src="resources/plugins/sweetalert/sweetalert.min.js"></script>

        <script src="resources/plugins/jquery-datatable/jquery.dataTables.js"></script>
        <script src="resources/plugins/jquery-datatable/skin/bootstrap/js/dataTables.bootstrap.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/dataTables.buttons.min.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/buttons.flash.min.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/jszip.min.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/pdfmake.min.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/vfs_fonts.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/buttons.html5.min.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/buttons.print.min.js"></script>
        <script src="resources/js/pages/tables/jquery-datatable.js"></script>
        <!-- Waves Effect Plugin Js -->
        <script src="resources/plugins/node-waves/waves.js"></script>

        <!-- Editable Table Plugin Js -->
        <script src="resources/plugins/editable-table/mindmup-editabletable.js"></script>

        <!-- Custom Js -->

        <!-- Custom Js -->
        <script src="resources/js/admin.js"></script>
        <script src="resources/js/pages/tables/editable-table.js"></script>
        <script src="resources/js/pages/forms/form-validation.js"></script>

        <!-- Demo Js -->
        <script src="resources/js/demo.js"></script>
        <script type="text/javascript">
            $('#stuID').keypress(function (evt) {
                if (evt.which == 13) {
                    var stuSeo = $('#stuID').val();
                    $.getJSON("getStudentAll?param=" + stuSeo + "", function (resp) {
                        var tempResp = resp;
                        if (tempResp == false) {
                            swal("Sorry you There is No Student For this ID..!");
                        } else {
                            $("#nameT").text(tempResp.fName + " " + tempResp.lastName);
                            $("#emailid").text(tempResp.email);
                            $("#sid").text(tempResp.studentID);
                            $("#cid").text("tempResp.fName");
                            $("#snic").text(tempResp.nic);
                            $("#stuid").text(tempResp.studentID);
                            $("#initName").text(tempResp.initName);
                            $("#fname").text(tempResp.fName);
                            $("#laname").text(tempResp.lastName);
                            $("#jdate").text(tempResp.dateofBirth);
                            $("#email").text(tempResp.email);
                            $("#gender").text(tempResp.gender);
                            $("#nic").text(tempResp.nic);
                            $("#jdatea").text(tempResp.joinDate);
                            $("#regdate").text(tempResp.regDate);
                            //                        $("profi").attr("src", "resources/images/user.png");
                            $("#address").empty();
                            $("#address").append(tempResp.address1 + "<br>" + tempResp.address2 + "<br>" + tempResp.address3 + "<br>" + "<br>" + "<br>");

                            //                        load gradian details 
                            $.getJSON("getStuGardians?param=" + stuSeo + "", function (resp) {
                                var temp = resp;
                                for (var i in temp) {
                                    var dd = temp[i];
                                    $("#gname").text(dd.firstName + " " + dd.LastName);
                                    $("#gtp").text(dd.tNumber);
                                    $("#gtp1").text(dd.pNumber);
                                    $("#gaddres1").text(dd.address1);
                                    $("#gaddres2").text(dd.address2);
                                    $("#gaddres3").text(dd.address3);
                                }
                            });


                            $.getJSON("getStuEdu?param=" + stuSeo + "", function (resp) {
                                $("#schinfo").text(resp.schoolName);
                                $("#schinfo1").text(resp.slocation);
                                $("#uniinfo").text(resp.uuni_name);
                                $("#uniinfo1").text(resp.uyear);
                            });

                            $.getJSON("getStuBranches?param=" + stuSeo + "", function (resp) {
                                var temp = resp;
                                for (var i in temp) {
                                    var dd = temp[i];
                                    $("#branch").text(dd.branchName);
                                    $("#brsnid").text(dd.branchName);
                                }


                                $.getJSON("getStubtach?param=" + stuSeo + "", function (resp) {
                                    var temp = resp;
                                    for (var i in temp) {
                                        var dd = temp[i];
                                        $("#batype").text(dd.batchType);
                                        $("#batch").text(dd.batchID);
                                        $("#bid").text(dd.batchID);
                                        $("#batch1").text(dd.batchID);
                                        $("#batch2").text(dd.batchID);
                                    }
                                });

                                loadAllFullTimeBatches();
                                function loadAllFullTimeBatches() {
                                    $.getJSON("getStubtach?param=" + stuSeo + "", function (resp) {
                                        $("#cmb-batch").selectpicker();
                                        $("#cmb-batch").empty();
                                        var tempArray = resp;
                                        for (var i in tempArray) {
                                            var temp = tempArray[i];
                                            $("#cmb-batch").append("<option>Select Batch</option>");
                                            $("#cmb-batch").append("<option>" + temp.batchID + "</option>");
                                            $("#cmb-batch").selectpicker("refresh");

                                            loadSubs();
                                            loadseco();
                                        }
                                    });
                                }


                                function loadSubs() {
                                    var bat = $('select#cmb-batch option:selected').val();
                                    $.getJSON("getStupcSubs?param=" + stuSeo + "&batch=" + bat + "", function (resp) {
                                        var tempArray = resp;
                                        $('.subs').empty();
                                        for (var i in tempArray) {
                                            var tem = tempArray[i];
                                            var tr = '<tr><td>' + tem.sub_name + '</td><td>' + tem.result + '</td><td>' + tem.result1 + '</td><td>' + tem.result2 + '</td><td>' + tem.sub_name + '</td><td>' + tem.credit + '</td><td>' + tem.gpa + '</td></tr>'
                                            //                                        table.row.add([tem.sub_name, tem.result, tem.result1, tem.result2, tem.result2, tem.gpa, tem.credit]).draw(false);
                                            $('.subs').append(tr);
                                        }
                                        $('#mainTable').editableTableWidget();
                                        $('#mainTable').editableTableWidget({editor: $('<textarea>')});
                                        $('#mainTable').editableTableWidget({
                                            cloneProperties: ['background', 'border', 'outline']
                                        });
                                        $('#mainTable td').on('validate', function (evt, newValue) {
                                            alert(this.value);

                                        });
                                    });
                                }
                                function loadseco() {
                                    $.getJSON("getStuFCourses?param=" + stuSeo + "", function (resp) {
                                        var tempArray = resp;
                                        $("#cmb-crs").selectpicker();
                                        $("#cmb-crs").empty();
                                        for (var i in tempArray) {
                                            var temp = tempArray[i];
                                            $("#cmb-crs").append("<option>Select Course</option>");
                                            $("#cmb-crs").append("<option>" + temp.ccode + "</option>");
                                            $("#cmb-crs").selectpicker("refresh");
                                        }
                                    });
                                }

                                //                            get Courses semsters
                                function loadSemForStu() {
                                    var cou = $('select#cmb-crs option:selected').val();
                                    $.getJSON("getStuFSemesters?param=" + stuSeo + "&course=" + cou + "", function (resp) {
                                        var tempArray = resp;
                                        $("#semname").selectpicker();
                                        $("#semname").empty();
                                        $("#semname").append("<option>Select Semesters</option>");
                                        for (var i in tempArray) {
                                            var tem = tempArray[i];
                                            $("#semname").append("<option>" + tem.semName + "</option>");
                                            $("#semname").selectpicker("refresh");
                                        }
                                    });
                                }
                                ;
                                $('#cmb-batch,#cmb-crs').change(function () {
                                    loadSemForStu();
                                    loadSubs();
                                });
                                //                            
                                //                            load all fulltime course subjects
                                $('#semname').change(function () {
                                    $("#sbs").text($('select#semname option:selected').val());

                                    var sem = $('select#semname option:selected').val();




                                    $.getJSON("getStufcSubs?param=" + stuSeo + "&sem=" + sem + "", function (resp) {
                                        var tempArray = resp;
                                        $('.subs').empty();
                                        for (var i in tempArray) {
                                            var tem = tempArray[i];
                                            var tr = '<tr><td>' + tem.sub_name + '</td><td>' + tem.result + '</td><td>' + tem.result1 + '</td><td>' + tem.result2 + '</td><td>' + tem.sub_name + '</td><td>' + tem.credit + '</td><td>' + tem.gpa + '</td></tr>'
                                            //                                        table.row.add([tem.sub_name, tem.result, tem.result1, tem.result2, tem.result2, tem.gpa, tem.credit]).draw(false);
                                            $('.subs').append(tr);
                                        }
                                        $('#mainTable').editableTableWidget();
                                        $('#mainTable').editableTableWidget({editor: $('<textarea>')});
                                        $('#mainTable').editableTableWidget({
                                            cloneProperties: ['background', 'border', 'outline']
                                        });
                                        $('#mainTable td').on('validate', function (evt, newValue) {
                                           console.log(evt);

                                        });
                                    });
                                });
                            });
                        }
                    });
                }

            });
        </script>

        <!--        <script src="resources/js/ajax/sanu-ajax-transgen.js"></script>-->
    </body>

</html>

<!-- -->