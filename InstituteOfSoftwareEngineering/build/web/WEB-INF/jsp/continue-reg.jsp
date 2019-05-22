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
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">
        <link href="resources/plugins/bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="resources/plugins/node-waves/waves.css" rel="stylesheet" />
        <link href="resources/plugins/animate-css/animate.css" rel="stylesheet" />
        <link href="resources/plugins/sweetalert/sweetalert.css" rel="stylesheet" />
        <link href="resources/plugins/bootstrap-material-datetimepicker/css/bootstrap-material-datetimepicker.css" rel="stylesheet" />
        <link href="resources/plugins/waitme/waitMe.css" rel="stylesheet" />
        <link href="resources/plugins/bootstrap-select/css/bootstrap-select.css" rel="stylesheet" />
        <link href="resources/css/style.css" rel="stylesheet">
        <link href="resources/css/themes/all-themes.css" rel="stylesheet" />
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

                            <div class="body">
                                <form id="studentReg" method="POST">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" class="form-control" name="initName" maxlength="50" minlength="3" required>
                                            <label class="form-label">SEARCH BY STUDENT NIC</label>
                                        </div>
                                    </div>
                                    <button  class="btn btn-primary waves-effect" type="submit">SEARCH</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!--////-->




                <!-------->
                <div class="row clearfix">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="card">
                            <div class="header">
                                <h2>COURSE SELECTION</h2>
                                <ul class="header-dropdown m-r--5">
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                            <i class="material-icons">more_vert</i>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                            <div class="body">
                                <form id="studentReg" method="POST">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <p>
                                                <b>SELECT BRANCH</b>
                                            </p>
                                            <select class="form-control show-tick" data-live-search="true">
                                                <option>PANADURA BRANCH</option>
                                                <option>GALLE BRANCH</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <p>
                                                <b>SELECT COURSE TYPE</b>
                                            </p>
                                            <select class="form-control show-tick" data-live-search="true">
                                                <option>FULL TIME COURSE</option>
                                                <option>PART TIME COURSE</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <p>
                                                <b>SELECT COURSE</b>
                                            </p>
                                            <select class="form-control show-tick" data-live-search="true">
                                                <option>GDSE</option>
                                                <option>ABSD</option>
                                                <option>CMJD</option>
                                            </select>
                                        </div>
                                    </div>
                                    <!--..-->  
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <p>
                                                <b>SELECT SUBJECTS</b>
                                            </p>
                                            <select class="form-control show-tick" multiple data-live-search="true">
                                                <option>ABCD</option>
                                                <option>Ketchup</option>
                                                <option>Relish</option>
                                            </select>
                                        </div>
                                    </div>
                                    <!--B-->
                                    <button  class="btn btn-primary waves-effect" type="submit">REGISTER</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!--///////-->               
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

        <!-- Waves Effect Plugin Js -->
        <script src="resources/plugins/node-waves/waves.js"></script>

        <script src="resources/plugins/momentjs/moment.js"></script>

        <!-- Autosize Plugin Js -->
        <script src="resources/plugins/autosize/autosize.js"></script>

        <!-- Bootstrap Material Datetime Picker Plugin Js -->
        <script src="resources/plugins/bootstrap-material-datetimepicker/js/bootstrap-material-datetimepicker.js"></script>
        <!-- Custom Js -->
        <script src="resources/js/admin.js"></script>
        <script src="resources/js/pages/forms/basic-form-elements.js"></script>
        <script src="resources/js/pages/forms/form-validation.js"></script>

        <!-- Demo Js -->
        <script src="resources/js/demo.js"></script>
        <script src="resources/js/sanu-ajax.js"></script>

        <script src="resources/js/sanu-ajax.js"></script>
        <script src="resources/js/ajax/sanu-continue-reg.js"></script>

    </body>

</html>