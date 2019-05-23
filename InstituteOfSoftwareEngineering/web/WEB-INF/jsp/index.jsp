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
        <link href="plugins/morrisjs/morris.css" rel="stylesheet" />
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
        <%@include file="adm-header.jsp" %>
        <!-- #Top Bar -->
        <%@include file="adm-sidebar.jsp" %>

        <section class="content">
            <div class="container-fluid">
                <div class="block-header">
                    <h2>DASHBOARD</h2>
                </div>

                <!-- Widgets -->
                <div class="row clearfix">
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                        <div class="info-box bg-pink hover-zoom-effect">
                            <div class="icon">
                                <i class="material-icons">face</i>
                            </div>
                            <div class="content">
                                <div class="text">STUDENTS</div>
                                <div class="number">0</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                        <div class="info-box bg-blue hover-zoom-effect">
                            <div class="icon">
                                <i class="material-icons">games</i>
                            </div>
                            <div class="content">
                                <div class="text">BATCHES</div>
                                <div class="number">0</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                        <div class="info-box bg-light-green hover-zoom-effect">
                            <div class="icon">
                                <i class="material-icons">next_week</i>
                            </div>
                            <div class="content">
                                <div class="text">COURSES</div>
                                <div class="number count-to" data-from="0" data-to="0" data-speed="1000" data-fresh-interval="20"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                        <div class="info-box bg-orange hover-zoom-effect">
                            <div class="icon">
                                <i class="material-icons">style</i>
                            </div>
                            <div class="content">
                                <div class="text">SUBJECTS</div>
                                <div class="number count-to" data-from="0" data-to="0" data-speed="1000" data-fresh-interval="20"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# Widgets -->
                <!-- CPU Usage -->
                <div class="row clearfix">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                        <div class="card">
                            <div class="header">
                                <div class="row clearfix">
                                    <div class="col-xs-12 col-sm-6">
                                        <h2>BATCH VIEW</h2>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 align-right">
                                       
                                    </div>
                                </div>
                                <ul class="header-dropdown m-r--5">
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                            <i class="material-icons">more_vert</i>
                                        </a>
                                       
                                    </li>
                                </ul>
                            </div>
                            <div class="body">
                             
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# CPU Usage -->
               

                
            </div>
        </section>

        <!-- Jquery Core Js -->
        <script src="resources/plugins/jquery/jquery.min.js"></script>
        <script src="resources/plugins/bootstrap/js/bootstrap.js"></script>
        <script src="resources/plugins/bootstrap-select/js/bootstrap-select.js"></script>
        <script src="resources/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>
        <script src="resources/plugins/node-waves/waves.js"></script>
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
    </body>

</html>