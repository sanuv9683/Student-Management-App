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
        <!-- JQuery DataTable Css -->
        <!-- Bootstrap Material Datetime Picker Css -->
        <link href="resources/plugins/bootstrap-material-datetimepicker/css/bootstrap-material-datetimepicker.css" rel="stylesheet" />
        <!-- Wait Me Css -->
        <!-- Bootstrap Select Css -->
        <link href="resources/plugins/bootstrap-select/css/bootstrap-select.css" rel="stylesheet" />
        <link href="resources/plugins/waitme/waitMe.css" rel="stylesheet" />
        <link href="resources/plugins/jquery-datatable/skin/bootstrap/css/dataTables.bootstrap.css" rel="stylesheet">
        <link href="resources/css/style.css" rel="stylesheet">
        <link href="resources/css/themes/all-themes.css" rel="stylesheet" />

    </head>
    <body class="theme-red">
        <!-- Page Loader -->
        <div class="page-loader-wrapper">
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
        </div>
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

        <section class="content">
            <div class="container-fluid">
                <!-- Basic Validation -->
                <div class="row clearfix">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="card">
                            <div class="header bg-teal">
                                <h2>BRANCH MANAGEMENT</h2>
                                <ul class="header-dropdown m-r--5">
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                            <i class="material-icons">more_vert</i>
                                        </a>

                                    </li>
                                </ul>
                            </div>
                            <div class="body">

                                <form id="form_validation" class="branchadd">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" class="form-control" maxlength="20" minlength="3" name="bname" required>
                                            <label class="form-label">Branch Name</label>
                                        </div>
                                    </div>  
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" class="form-control" maxlength="20" minlength="3" name="bloca" required>
                                            <label class="form-label">Branch Location</label>
                                        </div>
                                    </div>
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" class="form-control"  maxlength="60" minlength="3" name="baddone" required>
                                            <label class="form-label">Address One</label>
                                        </div>
                                    </div>
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" class="form-control"  maxlength="60" minlength="3" name="baddtwo" required>
                                            <label class="form-label">Address Two</label>
                                        </div>
                                    </div>
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" class="form-control"  maxlength="60" minlength="3" name="baddthree" required>
                                            <label class="form-label">Address Three</label>
                                        </div>
                                    </div>
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="number" class="form-control"  maxlength="10" minlength="10" name="bcontact" required>
                                            <label class="form-label">Contact No</label>
                                        </div>
                                    </div>
                                    <button class="btn btn-primary waves-effect" id="branchreg-btn" type="button">SUBMIT</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# Basic Validation -->

                <!-- Advanced Validation -->
                <div class="row clearfix">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="card">
                            <div class="header bg-teal">
                                <h2>View All Branches</h2>
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
                                    <table class="table table-bordered table-striped table-hover dataTable js-exportable" id="abcd">
                                        <thead class="bg-pink">
                                            <tr>
                                                <th>Branch Name</th>
                                                <th>Branch Location</th>
                                                <th>Contact Number</th>                                               
                                            </tr>
                                        </thead>
                                        <tfoot class="bg-pink">
                                            <tr>
                                                <th>Branch Name</th>
                                                <th>Branch Location</th>
                                                <th>Contact Number</th>     
                                            </tr>
                                        </tfoot>
                                        <tbody >
                                            
                                        </tbody>
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

        <script src="resources/plugins/momentjs/moment.js"></script>

        <!-- Autosize Plugin Js -->
        <script src="resources/plugins/autosize/autosize.js"></script>

        <!-- Bootstrap Material Datetime Picker Plugin Js -->
        <script src="resources/plugins/bootstrap-material-datetimepicker/js/bootstrap-material-datetimepicker.js"></script>
        <!-- Custom Js -->
        <!-- Sweet Alert Plugin Js -->

        <!-- Waves Effect Plugin Js -->
        <script src="resources/plugins/node-waves/waves.js"></script>

        <!-- Jquery DataTable Plugin Js -->

        <script src="resources/plugins/jquery-datatable/jquery.dataTables.js"></script>
        <script src="resources/plugins/jquery-datatable/skin/bootstrap/js/dataTables.bootstrap.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/dataTables.buttons.min.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/buttons.flash.min.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/jszip.min.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/pdfmake.min.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/vfs_fonts.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/buttons.html5.min.js"></script>
        <script src="resources/plugins/jquery-datatable/extensions/export/buttons.print.min.js"></script>

        <!-- Custom Js -->
        <script src="resources/js/pages/tables/jquery-datatable.js"></script>
        <script src="resources/js/pages/forms/form-validation.js"></script>
        <!-- Custom Js -->
        <script src="resources/js/admin.js"></script>
        <script src="resources/js/pages/forms/basic-form-elements.js"></script>


        <!-- Demo Js -->
        <script src="resources/js/demo.js"></script>
        <script src="resources/js/ajax/sanu-branch-ajax.js"></script>
    </body>

</html>