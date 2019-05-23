<%-- 
    Document   : flott
    Created on : Jan 2, 2015, 2:56:07 PM
    Author     : Sanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Institute Of Software Engineering</title>
        <link rel="icon" href="resources/images/sanu.png" type="image/png">
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">
        <link href="resources/plugins/bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="resources/plugins/node-waves/waves.css" rel="stylesheet" />
        <link href="resources/plugins/animate-css/animate.css" rel="stylesheet" />
        <link href="resources/plugins/jquery-datatable/skin/bootstrap/css/dataTables.bootstrap.css" rel="stylesheet">
        <link href="plugins/morrisjs/morris.css" rel="stylesheet" />
        <link href="resources/css/style.css" rel="stylesheet">
        <link href="resources/css/themes/all-themes.css" rel="stylesheet" />
        <style type="text/css">
            .info-box{
                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.2);
                height: 65px;
                display: flex;
                cursor: pointer;
                position: relative;
                overflow: hidden;
                margin-bottom: 30px;
            }
            .info-box .icon i {
                color: #fff;
                font-size: 42px;
                line-height: 64px;
            }
            .dataTables_wrapper .dt-buttons a.dt-button {
                font-size: 5px;
            }
            div.dataTables_wrapper div.dataTables_filter label {
                font-size: 9px;
            }
            div.dataTables_wrapper div.dataTables_info {
                padding-top: 8px;
                white-space: nowrap;
                font-size: 10px;
            }
            .pagination > li:first-child > a, .pagination > li:last-child > a {
                width: auto;
                height: 32px;
                -webkit-border-radius: 0;
                -moz-border-radius: 0;
                -ms-border-radius: 0;
                border-radius: 0;
                font-size: 10px;
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
        <%@include file="adm-header.jsp" %>
        <!-- #Top Bar -->
        <%@include file="adm-sidebar.jsp" %>

        <section class="content" style="margin:20px 1px 0 245px;">
            <div class="container-fluid">
                <div class="block-header">
                    <h2 style="color: white!important;">DASHBOARD</h2>
                </div>

                <!-- Widgets -->
                <div class="row clearfix animated slideInUp">
                    <div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
                        <div class="info-box bg-pink hover-zoom-effect">
                            <div class="icon">
                                <i class="material-icons">face</i>
                            </div>
                            <div class="content">
                                <div class="text">STUDENTS</div>
                                <div class="count-to" id="stu"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
                        <div class="info-box bg-blue hover-zoom-effect">
                            <div class="icon">
                                <i class="material-icons">games</i>
                            </div>
                            <div class="content">
                                <div class="text">BATCHES</div>
                                <div class="count-to" id="bat"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
                        <div class="info-box bg-light-green hover-zoom-effect">
                            <div class="icon">
                                <i class="material-icons">school</i>
                            </div>
                            <div class="content">
                                <div class="text">COURSES</div>
                                <div class="count-to" id="cou"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
                        <div class="info-box bg-orange hover-zoom-effect">
                            <div class="icon">
                                <i class="material-icons">style</i>
                            </div>
                            <div class="content">
                                <div class="text">SUBJECTS</div>
                                <div class="count-to" id="sub"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
                        <div class="info-box bg-green hover-zoom-effect">
                            <div class="icon">
                                <i class="material-icons">computer</i>
                            </div>
                            <div class="content">
                                <div class="text">USERS</div>
                                <div class="count-to" id="usr"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
                        <div class="info-box bg-deep-orange hover-zoom-effect">
                            <div class="icon">
                                <i class="material-icons">security</i>
                            </div>
                            <div class="content">
                                <div class="text">ADMINS</div>
                                <div class="count-to" id="adm"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# Widgets -->



                <!-- Advanced Validation -->
                <div class="row clearfix">
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                        <div class="card animated zoomIn">                           
                            <div class="body" style="min-height: 430px;max-height: 430px;overflow-x: hidden;">
                                <div class="table-responsive">
                                    <table class="table table-bordered table-striped table-hover dataTable js-exportable" id="stuff">
                                        <thead class="bg-pink" style="font-size: 11px;">
                                            <tr>
                                                <th>Name</th>
                                                <th>Nic</th>
                                                <th>TP</th>
                                                <th>Email</th>
                                            </tr>
                                        </thead>
                                        <tbody style="font-size: 10px;"></tbody>
                                        <tfoot class="bg-pink" style="font-size: 11px;">
                                            <tr>
                                                <th>Name</th>
                                                <th>Nic</th>
                                                <th>TP</th>
                                                <th>Email</th>
                                            </tr>
                                        </tfoot>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                        <div class="card animated slideInLeft">
                            <div class="body" style="min-height: 430px;max-height: 430px;overflow-x: hidden;">
                                <div class="table-responsive">
                                    <table class="table table-bordered table-striped table-hover dataTable js-exportable" id="batch-t">
                                        <thead class="bg-pink" style="font-size: 11px;">
                                            <tr>
                                                <th>Batch ID</th>
                                                <th>No</th>
                                                <th>Starte Date</th>
                                                <th>Type </th>
                                                <th>Total Students</th>
                                            </tr>
                                        </thead>
                                        <tbody style="font-size: 10px;"></tbody>
                                        <tfoot class="bg-pink" style="font-size: 11px;">
                                            <tr>
                                                <th>Batch ID</th>
                                                <th>No</th>
                                                <th>Starte Date</th>
                                                <th>Type </th>
                                                <th>Total Students</th>
                                            </tr>
                                        </tfoot>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# Advanced Validation -->
            </div>
        </section>

        <!-- Jquery Core Js -->
        <script src="resources/plugins/jquery/jquery.min.js"></script>
        <script src="resources/plugins/bootstrap/js/bootstrap.js"></script>
        <script src="resources/plugins/bootstrap-select/js/bootstrap-select.js"></script>
        <script src="resources/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>
        <script src="resources/plugins/node-waves/waves.js"></script>
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
        <script src="resources/plugins/jquery-countto/jquery.countTo.js"></script>
        <script src="resources/plugins/raphael/raphael.min.js"></script>
        <script src="resources/plugins/morrisjs/morris.js"></script>
        <script src="resources/plugins/chartjs/Chart.bundle.js"></script>
        <script src="resources/plugins/flot-charts/jquery.flot.js"></script>
        <script src="resources/plugins/flot-charts/jquery.flot.resize.js"></script>
        <script src="resources/plugins/flot-charts/jquery.flot.pie.js"></script>
        <script src="resources/plugins/flot-charts/jquery.flot.categories.js"></script>
        <script src="resources/plugins/flot-charts/jquery.flot.time.js"></script>
        <script src="resources/plugins/jquery-sparkline/jquery.sparkline.js"></script>
        <script src="resources/js/admin.js"></script>
        <script src="resources/js/pages/index.js"></script>
        <script src="resources/js/demo.js"></script>
        <script type="text/javascript">
            //load branches//
            loadBathes();
            function loadBathes() {
                $.getJSON("getAllBatches", function (resp) {
                    var respon = resp;
                    var table = $('#batch-t').DataTable();
                    table.clear().draw();
                    for (var i in resp) {
                        var temp = resp[i];
                        table.row.add([temp.batchID, temp.batchNo, temp.startDate, temp.batchType, temp.total]).draw(false);
                    }
                });
            }

            getStuCounts();
            getAllBathes();
            getCourses();
            getSubjectsCount();
            function getStuCounts() {
                $.getJSON("getStuCount", function (resp) {
                    $('#stu').countTo({
                        from: 0,
                        to: resp,
                        speed: 1000,
                        refreshInterval: 10,
                        formatter: function (value, options) {
                            return value.toFixed(options.decimals);
                        },
                        onUpdate: function (value) {
                            console.debug(this);
                        },
                        onComplete: function (value) {
                            console.debug(this);
                        }
                    });
                });
            }

            function getAllBathes() {
                $.getJSON("getBatCount", function (resp) {
                    $('#bat').countTo({
                        from: 0,
                        to: resp,
                        speed: 1000,
                        refreshInterval: 10,
                        formatter: function (value, options) {
                            return value.toFixed(options.decimals);
                        },
                        onUpdate: function (value) {
                            console.debug(this);
                        },
                        onComplete: function (value) {
                            console.debug(this);
                        }
                    });
                });
            }

            function getCourses() {
                $.getJSON("getCouCount", function (resp) {
                    $('#cou').countTo({
                        from: 0,
                        to: resp,
                        speed: 1000,
                        refreshInterval: 10,
                        formatter: function (value, options) {
                            return value.toFixed(options.decimals);
                        },
                        onUpdate: function (value) {
                            console.debug(this);
                        },
                        onComplete: function (value) {
                            console.debug(this);
                        }
                    });
                });
            }

            function getSubjectsCount() {
                $.getJSON("getSubCount", function (resp) {
                    $('#sub').countTo({
                        from: 0,
                        to: resp,
                        speed: 1000,
                        refreshInterval: 10,
                        formatter: function (value, options) {
                            return value.toFixed(options.decimals);
                        },
                        onUpdate: function (value) {
                            console.debug(this);
                        },
                        onComplete: function (value) {
                            console.debug(this);
                        }
                    });
                });
            }

            loadAllStudents();
            function loadAllStudents() {
                $.getJSON("getAllStudents", function (resp) {
                    var tempArray = resp;
                    var table = $('#stuff').DataTable();
                    table.clear().draw();
                    for (var i in tempArray) {
                        var temp = tempArray[i];
                        table.row.add([temp.fName, temp.nic, temp.tel_mob, temp.email]).draw(false);
                    }
                });

            }



        </script>
    </body>

</html>