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
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">
        <link href="resources/plugins/bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="resources/plugins/node-waves/waves.css" rel="stylesheet" />
        <link href="resources/plugins/animate-css/animate.css" rel="stylesheet" />
        <link href="resources/plugins/sweetalert/sweetalert.css" rel="stylesheet" />
        <link href="resources/css/style.css" rel="stylesheet">
        <link href="resources/plugins/jquery-datatable/skin/bootstrap/css/dataTables.bootstrap.css" rel="stylesheet">
        <link href="resources/css/themes/all-themes.css" rel="stylesheet" />
        <link href="resources/plugins/bootstrap-select/css/bootstrap-select.css" rel="stylesheet" />
        <link href="resources/plugins/waitme/waitMe.css" rel="stylesheet" />
    </head>
    <body class="theme-red">
        <!-- Page Loader -->
        <!--        <div class="page-loader-wrapper">
                    <div class="loader">
                        <div class="preloader">
                            <div class="spinner-layer pl-red">
                                <div class="circle-clipper left">
                                    <div class="circle"></div>
                                </div>
                                <div class="circle-clipper right">
                                    <div class="circle"></div>
                                </div>
                            </div>
                        </div>
                        <p>Please wait...</p>
                    </div>
                </div>-->
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
        <%--<%@include file="adm-sidebar.jsp" %>--%>
        <!-- #Top Bar -->

        <section class="content">
            <div class="container-fluid">
                <!-- Basic Validation -->
                <div class="row clearfix">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="card">
                            <div class="header">
                                <h2>SEMESTER MANAGEMENT</h2>
                                <ul class="header-dropdown m-r--5">
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                            <i class="material-icons">more_vert</i>
                                        </a>

                                    </li>
                                </ul>
                            </div>
                            <div class="body">
                                <form id="form_validation" class="semform" method="POST">
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
                                                <option>Semester One</option>
                                                <option>Semester Two</option>
                                                <option>Semester Three</option>
                                                <option>Semester Four</option>
                                                <option>Semester Five</option>
                                                <option>Semester Six</option>
                                                <option>Semester Seven</option>
                                                <option>Semester Eight</option>
                                                <option>Semester Nine</option>
                                                <option>Semester Ten</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <p>
                                                <b>SELECT NUMBER</b>
                                            </p>
                                            <select class="form-control show-tick" name="snumber" id="cnumber" data-live-search="true">
                                                <option>01</option>
                                                <option>02</option>
                                                <option>03</option>
                                                <option>04</option>
                                                <option>05</option>
                                                <option>06</option>
                                                <option>07</option>
                                                <option>08</option>
                                                <option>09</option>
                                                <option>10</option>
                                            </select>                                       
                                        </div>
                                    </div>
                                    <button class="btn btn-primary waves-effect" id="sem-btn" type="button">SUBMIT</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# Basic Validation -->
                <!-- Advanced Validation -->

                <!-- Validation Stats -->
                <div class="row clearfix">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="card">
                            <div class="header">
                                <h2>
                                    SEMESTER VIEW
                                </h2>
                                <ul class="header-dropdown m-r--5">
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                            <i class="material-icons">more_vert</i>
                                        </a>

                                    </li>
                                </ul>
                            </div>
                            <div class="body">
                                <div class="table-responsive">
                                    <table class="table table-bordered table-striped table-hover dataTable js-exportable" id="sem-table">
                                        <thead class="bg-pink">
                                            <tr>
                                                <th>Semester Code</th>
                                                <th>Semester Name</th>
                                                <th>Edit</th>

                                            </tr>
                                        </thead>
                                        <tfoot class="bg-pink">
                                            <tr>
                                                <th>Semester Code</th>
                                                <th>Semester Name</th>
                                                <th>Edit</th>

                                            </tr>
                                        </tfoot>
                                        <tbody>

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# Validation Stats -->
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
        <script src="resources/js/ajax/sanu-semester.js"></script>
    </body>
</html>