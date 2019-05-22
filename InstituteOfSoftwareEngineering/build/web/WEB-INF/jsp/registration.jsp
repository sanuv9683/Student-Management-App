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
                <!-- Advanced Form Example With Validation -->
                <div class="row clearfix">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="card">
                            <div class="header">
                                <h2>STUDENT REGISTRATION</h2>
                                <ul class="header-dropdown m-r--5">
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                            <i class="material-icons">more_vert</i>
                                        </a>

                                    </li>
                                </ul>
                            </div>
                            <div class="body">
                                <form id="wizard_with_validation" class="studentReg" method="POST">
                                    <h3>Student Information</h3>
                                    <fieldset>                                      
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="initName" maxlength="50" minlength="3" required>
                                                <label class="form-label">Initial Name</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="fName" maxlength="15" minlength="2"  required>
                                                <label class="form-label">First Name</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" maxlength="15" minlength="2" name="lName" required>
                                                <label class="form-label">Last Name</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" maxlength="50" minlength="3" name="aOne" required>
                                                <label class="form-label">Address One</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" maxlength="50" minlength="3" name="aTwo" required>
                                                <label class="form-label">Address Two</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" maxlength="50" minlength="3" name="aThree" required>
                                                <label class="form-label">Address Three</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="number" class="form-control" maxlength="10" minlength="10" name="homeTp" required>
                                                <label class="form-label">Home TP</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="number" class="form-control" maxlength="10" minlength="10" name="mobileTp" required>
                                                <label class="form-label">Mobile Number</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="datepicker form-control" name="bob"  required>
                                                <label class="form-label">Date Of Birth... Ex : Date/Month/Year</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="email" class="form-control" name="email" required>
                                                <label class="form-label">Email</label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <input type="radio" name="gender" id="male" value="Male" class="with-gap" required>
                                            <label for="male">Male</label>

                                            <input type="radio" name="gender" id="female" value="Female" class="with-gap" required>
                                            <label for="female" class="m-l-20">Female</label>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text"  class="form-control" maxlength="10" minlength="10" name="nic" required>
                                                <label class="form-label">NIC</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="number" class="form-control" max="5000" min="5000" name="regfee" required>
                                                <label class="form-label">Reg Fee</label>
                                            </div>
                                        </div>
                                    </fieldset>

                                    <h3>Gardian Information</h3>
                                    <fieldset>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="GfName" maxlength="30" minlength="2"  required>
                                                <label class="form-label">First Name</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" maxlength="30" minlength="2" name="GlName" required>
                                                <label class="form-label">Last Name</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" maxlength="50" minlength="2" name="GaOne" required>
                                                <label class="form-label">Address One</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" maxlength="50" minlength="2" name="GaTwo" required>
                                                <label class="form-label">Address Two</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" maxlength="50" minlength="2" name="GaThree" required>
                                                <label class="form-label">Address Three</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="number" class="form-control" maxlength="10" minlength="10" name="GhomeTp" required>
                                                <label class="form-label">Home TP</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="number" class="form-control" maxlength="10" minlength="10" name="GmobileTp" required>
                                                <label class="form-label">Mobile Number</label>
                                            </div>
                                        </div>
                                    </fieldset>

                                    <h3>Education Information</h3>
                                    <fieldset>
                                        <div class="">
                                            <h4>School Information</h4>
                                            <div class="form-group form-float">
                                                <div class="form-line">
                                                    <input type="text" class="form-control" name="schoolName" maxlength="50" minlength="2"  >
                                                    <label class="form-label">School Name</label>
                                                </div>
                                            </div>
                                            <div class="form-group form-float">
                                                <div class="form-line">
                                                    <input type="text" class="form-control" maxlength="20" minlength="2" name="schoolLocation" >
                                                    <label class="form-label">School Location</label>
                                                </div>
                                            </div>

                                        </div>
                                        <div class="">
                                            <h4>University Information</h4>
                                            <div class="form-group form-float">
                                                <div class="form-line">
                                                    <input type="text" class="form-control" name="uName" maxlength="60" minlength="2" >
                                                    <label class="form-label">University Name</label>
                                                </div>
                                            </div>
                                            <div class="form-group form-float">
                                                <div class="form-line">
                                                    <input type="number" class="form-control"  name="uYear">
                                                    <label class="form-label">University Year</label>
                                                </div>
                                            </div>
                                        </div>
                                    </fieldset>  
                                    <h3>Terms & Conditions</h3>
                                    <fieldset>
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <p>
                                                    <b>IQ Test</b>
                                                </p>
                                                <select class="form-control show-tick" name="iq" required>
                                                    <option>Passed</option>
                                                    <option>Failed</option>
                                                    <option>Not Submited</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group form-float">
                                            <div class="form-line">

                                                <input id="acceptTerms-2" name="acceptTerms" type="checkbox" required>
                                                <label for="acceptTerms-2">Registration Fee Is Completed</label>
                                            </div>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# Advanced Form Example With Validation -->

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
        <!--<script src="resources/js/pages/forms/form-wizard.js"></script>-->
        <!-- Demo Js -->
        <script src="resources/js/demo.js"></script>
        <script src="resources/js/ajax/sanu-reg-ajax.js"></script>

    </body>

</html>