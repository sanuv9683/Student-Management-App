<%-- 
    Document   : buttons
    Created on : Feb 9, 2015, 11:22:25 AM
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
        <!-- #END# Search Bar -->
        <!-- Top Bar -->
        <!-- #Top Bar -->
        <%@include file="header.jsp" %>
        <%@include file="sidebar.jsp" %>
        <!-- #Top Bar -->

        <section class="content">
            <div class="container-fluid">
                <div class="block-header">
                    <h2>
                        DIALOGS
                        <small>Taken by <a href="https://github.com/t4t5/sweetalert" target="_blank">github.com/t4t5/sweetalert</a></small>
                    </h2>
                </div>
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="card">
                            <div class="header">
                                <h2>EXAMPLES</h2>
                                <ul class="header-dropdown m-r--5">
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                            <i class="material-icons">more_vert</i>
                                        </a>
                                        <ul class="dropdown-menu pull-right">
                                            <li><a href="javascript:void(0);">Action</a></li>
                                            <li><a href="javascript:void(0);">Another action</a></li>
                                            <li><a href="javascript:void(0);">Something else here</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                            <div class="body">
                                <div class="row clearfix js-sweetalert">
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                                        <p>A basic message</p>
                                        <button class="btn btn-primary waves-effect" data-type="basic">CLICK ME</button>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                                        <p>A title with a text under</p>
                                        <button class="btn btn-primary waves-effect" data-type="with-title">CLICK ME</button>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                                        <p>A success message!</p>
                                        <button class="btn btn-primary waves-effect" data-type="success">CLICK ME</button>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                                        <p>A warning message, with a function attached to the <b>Confirm</b> button...</p>
                                        <button class="btn btn-primary waves-effect" data-type="confirm">CLICK ME</button>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                                        <p>... and by passing a parameter, you can execute something else for <b>Cancel</b>.</p>
                                        <button class="btn btn-primary waves-effect" data-type="cancel">CLICK ME</button>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                                        <p>A message with a custom icon</p>
                                        <button class="btn btn-primary waves-effect" data-type="with-custom-icon">CLICK ME</button>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                                        <p>An HTML message</p>
                                        <button class="btn btn-primary waves-effect" data-type="html-message">CLICK ME</button>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                                        <p>A message with auto close timer</p>
                                        <button class="btn btn-primary waves-effect" data-type="autoclose-timer">CLICK ME</button>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                                        <p>A replacement for the <b>prompt</b> function</p>
                                        <button class="btn btn-primary waves-effect" data-type="prompt">CLICK ME</button>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                                        <p>With a loader (for AJAX request for example)</p>
                                        <button class="btn btn-primary waves-effect" data-type="ajax-loader">CLICK ME</button>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </section>

        <script src="resources/plugins/jquery/jquery.min.js"></script>
        <script src="resources/plugins/bootstrap/js/bootstrap.js"></script>
        <script src="resources/plugins/bootstrap-select/js/bootstrap-select.js"></script>
        <script src="resources/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>
        <script src="resources/plugins/bootstrap-notify/bootstrap-notify.js"></script>
        <script src="resources/plugins/node-waves/waves.js"></script>
        <script src="resources/plugins/sweetalert/sweetalert.min.js"></script>
        <script src="resources/js/admin.js"></script>
        <script src="resources/js/pages/ui/dialogs.js"></script>
        <script src="resources/js/demo.js"></script>
    </body>
</html>