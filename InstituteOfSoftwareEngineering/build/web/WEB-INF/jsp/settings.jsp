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
        <link href="resources/plugins/sweetalert/sweetalert.css" rel="stylesheet" />

        <!-- Custom Css -->
        <link href="resources/css/style.css" rel="stylesheet">

        <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
        <link href="resources/css/themes/all-themes.css" rel="stylesheet" />

        <link href="resources/plugins/bootstrap-select/css/bootstrap-select.css" rel="stylesheet" />
        <link href="resources/plugins/waitme/waitMe.css" rel="stylesheet" />
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
                            <div class="header">
                                <h2>SETTINGS</h2>
                                <ul class="header-dropdown m-r--5">
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                            <i class="material-icons">more_vert</i>
                                        </a>

                                    </li>
                                </ul>
                            </div>
                            <div class="body">
                                <div class="">
                                    <!-- Nav tabs -->
                                    <ul class="nav nav-tabs" role="tablist">
                                        <li role="presentation" class="active">
                                            <a href="#home_with_icon_title" data-toggle="tab">
                                                <i class="material-icons">home</i> HISTORY
                                            </a>
                                        </li>
                                        <li role="presentation">
                                            <a href="#profile_with_icon_title" data-toggle="tab">
                                                <i class="material-icons">face</i> LOGGER
                                            </a>
                                        </li>
                                        <li role="presentation">
                                            <a href="#messages_with_icon_title" data-toggle="tab">
                                                <i class="material-icons">email</i> MESSAGES
                                            </a>
                                        </li>
                                        <li role="presentation">
                                            <a href="#settings_with_icon_title" data-toggle="tab">
                                                <i class="material-icons">settings</i> SETTINGS
                                            </a>
                                        </li>
                                    </ul>

                                    <!-- Tab panes -->
                                    <div class="tab-content">
                                        <div role="tabpanel" class="tab-pane fade in active" id="home_with_icon_title">

                                            <div class="row clearfix">
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                    <div class="card">
                                                        <div class="header">
                                                            <h2>
                                                                v1.0.5
                                                                <small>27th June 2017</small>
                                                            </h2>
                                                        </div>
                                                        <div class="body">
                                                            <p>- Fixed bugs</p>
                                                            <p>- Button with icon & text added</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                    <div class="card">
                                                        <div class="header">
                                                            <h2>
                                                                v1.0.5
                                                                <small>27th June 2017</small>
                                                            </h2>
                                                        </div>
                                                        <div class="body">
                                                            <p>- Fixed bugs</p>
                                                            <p>- Button with icon & text added</p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div role="tabpanel" class="tab-pane fade" id="profile_with_icon_title">
                                            <div class="row clearfix">
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                    <div class="card">
                                                        <div class="header">
                                                            <h2>
                                                                Users LOGGER
                                                                <small>Followup Users History</small>
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
                                                            <form>
                                                                <div class="form-group form-float">
                                                                    <div class="form-line">
                                                                        <input type="text" class="form-control" name="username" required>
                                                                        <label class="form-label">User*</label>
                                                                    </div>
                                                                </div>
                                                                <div class="form-group form-float">
                                                                    <div class="form-line">
                                                                        <input type="date" class="form-control" name="password" id="password" required>
                                                                        <label class="form-label">Date*</label>
                                                                    </div>
                                                                </div>
                                                                <button type="button" class="btn btn-primary m-t-15 waves-effect">Search</button>
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                    <div class="card">
                                                        <div class="header">
                                                            <h2>
                                                                v1.0.5
                                                                <small>27th June 2017</small>
                                                            </h2>
                                                        </div>
                                                        <div class="body">
                                                            <p>- Fixed bugs</p>
                                                            <p>- Button with icon & text added</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                    <div class="card">
                                                        <div class="header">
                                                            <h2>
                                                                v1.0.5
                                                                <small>27th June 2017</small>
                                                            </h2>
                                                        </div>
                                                        <div class="body">
                                                            <p>- Fixed bugs</p>
                                                            <p>- Button with icon & text added</p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div role="tabpanel" class="tab-pane fade" id="messages_with_icon_title">
                                            <b>Message Content</b>

                                        </div>
                                        <div role="tabpanel" class="tab-pane fade" id="settings_with_icon_title">

                                            <div class="row clearfix">
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                    <div class="card">
                                                        <div class="header">
                                                            <h2>
                                                                CHANGE PASSWORD
                                                                <small>Keep Your Account Safe</small>
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
                                                            <form>
                                                                <div class="form-group form-float">
                                                                    <div class="form-line">
                                                                        <input type="password" class="form-control" name="username" required>
                                                                        <label class="form-label">Old Password*</label>
                                                                    </div>
                                                                </div>
                                                                <div class="form-group form-float">
                                                                    <div class="form-line">
                                                                        <input type="password" class="form-control" name="password" id="password" required>
                                                                        <label class="form-label">New Password*</label>
                                                                    </div>
                                                                </div>
                                                                <div class="form-group form-float">
                                                                    <div class="form-line">
                                                                        <input type="password" class="form-control" name="confirm" required>
                                                                        <label class="form-label">Confirm Password*</label>
                                                                    </div>
                                                                </div>
                                                                <button type="button" class="btn btn-primary m-t-15 waves-effect">Change</button>
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!--ts-->
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# Basic Validation -->
                <!-- Advanced Validation -->


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

        <script src="resources/js/admin.js"></script>
        <script src="resources/js/pages/forms/form-validation.js"></script>
        <script src="resources/js/pages/forms/basic-form-elements.js"></script>

        <!-- Demo Js -->
        <script src="resources/js/demo.js"></script>
    </body>

</html>