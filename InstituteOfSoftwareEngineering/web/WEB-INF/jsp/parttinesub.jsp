<%-- 
    Document   : registration
    Created on : Jan 18, 2015, 9:17:27 AM
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
        <link href="resources/plugins/jquery-datatable/skin/bootstrap/css/dataTables.bootstrap.css" rel="stylesheet">
        <link href="resources/plugins/sweetalert/sweetalert.css" rel="stylesheet" />

        <!-- Custom Css -->
        <link href="resources/css/style.css" rel="stylesheet">

        <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
        <link href="resources/css/themes/all-themes.css" rel="stylesheet" />

        <link href="resources/plugins/bootstrap-select/css/bootstrap-select.css" rel="stylesheet" />
        <link href="resources/plugins/waitme/waitMe.css" rel="stylesheet" />
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
                <!-- Basic Validation -->
                <div class="row clearfix">
                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                        <div class="card animated slideInUp">
                            <div class="header">
                                <h2>PART-TIME SUBJECTS MANAGEMENT</h2>
                                <ul class="header-dropdown m-r--5">
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                            <i class="material-icons">more_vert</i>
                                        </a>

                                    </li>
                                </ul>
                            </div>
                            <div class="body">
                                <form id="form_validation" class="parttimef" method="POST">
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
                                                <b>SELECT SUBJECTS</b>
                                            </p>
                                            <select class="form-control show-tick" name="subject" data-live-search="true" id="all-subs">

                                            </select>
                                        </div>
                                    </div>
                                    <button class="btn btn-primary waves-effect" id="sem-me" type="button">Merge Subjects For Semester</button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8">
                        <div class="card animated slideInUp">
                            <div class="header">
                                <h2>
                                    Semester Review
                                </h2>
                                <ul class="header-dropdown m-r--5">
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                            <i class="material-icons">more_vert</i>
                                        </a>

                                    </li>
                                </ul>
                            </div>
                            <div class="body" style="min-height: 490px;max-height: 490px;overflow-x: auto">
                                <div class="table-responsive">
                                    <table class="table table-bordered table-striped table-hover dataTable js-exportable" id="subj-part">
                                        <thead class="bg-pink">
                                            <tr>
                                                <th>Subject Name</th>
                                                <th>Edit</th>

                                            </tr>
                                        </thead>
                                        <tfoot class="bg-pink">
                                            <tr>
                                                <th>Subject Name</th>
                                                <th>Edit</th>
                                            </tr>
                                        </tfoot>
                                        <tbody style="font-size: 10px;">

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# Basic Validation -->
                <!-- Advanced Validation -->


            </div>
        </section>


        <script src="resources/plugins/jquery/jquery.min.js"></script>
        <script src="resources/plugins/bootstrap/js/bootstrap.js"></script>
        <script src="resources/plugins/bootstrap-select/js/bootstrap-select.js"></script>
        <script src="resources/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>
        <script src="resources/plugins/jquery-validation/jquery.validate.js"></script>
        <script src="resources/plugins/jquery-steps/jquery.steps.js"></script>
        <script src="resources/plugins/sweetalert/sweetalert.min.js"></script>
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
        <script src="resources/js/admin.js"></script>
        <script src="resources/js/pages/forms/form-validation.js"></script>
        <script src="resources/js/pages/forms/basic-form-elements.js"></script>
        <script src="resources/js/demo.js"></script>
        <script>
            loadAllSubjects();
            loadAllFullTimeBatches();
            function loadAllFullTimeBatches() {
                $.getJSON("getptbatch", function (resp) {
                    $("#cmb-batch").selectpicker();
                    $("#cmb-batch").empty();
                    $("#cmb-batch").append("<option>Select One</option>");
                    $("#cmb-batch").selectpicker("refresh");
                    var tempArray = resp;
                    for (var i in tempArray) {
                        var temp = tempArray[i];
                        $("#cmb-batch").append("<option>" + temp.batchID + "</option>");
                        $("#cmb-batch").selectpicker("refresh");
                        loadseco();
                        loadAllC();
                    }
                });
            }

            function loadAllSubjects() {
                $.getJSON("getAllSubs", function (resp) {
                    $("#all-subs").selectpicker();
                    $("#all-subs").empty();
                    $("#all-subs").append("<option>Select One</option>");
                    $("#all-subs").selectpicker("refresh");
                    var tempArray = resp;
                    for (var i in tempArray) {
                        var temp = tempArray[i];
                        $("#all-subs").append("<option>" + temp.sub_name + "</option>");
                        $("#all-subs").selectpicker("refresh");
                        loadseco();
                    }
                });
            }

            $("#cmb-batch").change(function () {
                var value = $('select#cmb-batch option:selected').val();
                $.getJSON("getACFB?batch=" + value + "", function (resp) {
                    var tempArray = resp;
                    $("#cmb-crs").selectpicker();
                    $("#cmb-crs").empty();
                    $("#cmb-crs").append("<option>Select One</option>");
                    $("#cmb-crs").selectpicker("refresh");
                    for (var i in tempArray) {
                        var temp = tempArray[i];
                        $("#cmb-crs").append("<option>" + temp.ccode + "</option>");
                        $("#cmb-crs").selectpicker("refresh");
                    }
                });

            });



            $("#sem-me").click(function () {
                var form = $('.parttimef').serialize();
                $.post("partSubmergec", form, function (resp) {
                    swal(resp);
                    loadAllC();
                });
            });






            $('#cmb-batch,#cmb-crs').change(function () {
                var batch = $('select#cmb-batch option:selected').val();
                var cou = $('select#cmb-crs option:selected').val();
                $.getJSON("semforbc?batch=" + batch + "&course=" + cou + "", function (resp) {
                    var tempArray = resp;
                    $("#selhsem").selectpicker();
                    $('#selhsem').empty();
                    $("#selhsem").append("<option>Select One</option>");
                    for (var i in tempArray) {
                        var tem = tempArray[i];
                        $('#selhsem').append('<option>' + tem.semName + '</option');
                        $("#selhsem").selectpicker("refresh");
                    }
                });
            });


            function loadAllC() {
                var batch = $('select#cmb-batch option:selected').val();
                $.getJSON("getPartTimeSubjects?batch=" + batch + "", function (resp) {
                    var tempArray = resp;
                    var table = $('#subj-part').DataTable();
                    table.clear().draw();
                    for (var i in tempArray) {
                        var temp = tempArray[i];
                        table.row.add([temp.sub_name, temp.id]).draw(false);
                    }
                });
            }



            function loadseco() {
                var value = $('select#cmb-batch option:selected').val();
                $.getJSON("getACFB?batch=" + value + "", function (resp) {
                    var tempArray = resp;
                    $("#cmb-crs").selectpicker();
                    $("#cmb-crs").empty();
                    $("#cmb-crs").append("<option>Select One</option>");
                    $("#cmb-crs").selectpicker("refresh");
                    for (var i in tempArray) {
                        var temp = tempArray[i];
                        $("#cmb-crs").append("<option>" + temp.ccode + "</option>");
                        $("#cmb-crs").selectpicker("refresh");
                    }
                });
            }

        </script>
    </body>

</html>