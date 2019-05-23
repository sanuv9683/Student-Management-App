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
        <link href="resources/plugins/bootstrap-material-datetimepicker/css/bootstrap-material-datetimepicker.css" rel="stylesheet" />
        <!--        <link href="resources/plugins/bootstrap-select/css/bootstrap-select.css" rel="stylesheet" />-->
        <link href="resources/plugins/waitme/waitMe.css" rel="stylesheet" />
        <link href="resources/plugins/jquery-datatable/skin/bootstrap/css/dataTables.bootstrap.css" rel="stylesheet">
        <link href="resources/css/style.css" rel="stylesheet">
        <link href="resources/css/themes/all-themes.css" rel="stylesheet" />
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
                        <div class="card animated slideInDown">
                            <div class="header bg-pink">
                                <h2>SUBJECT REGISTRATION</h2>
                                <ul class="header-dropdown m-r--5">
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                            <i class="material-icons">more_vert</i>
                                        </a>

                                    </li>
                                </ul>
                            </div>
                            <div class="body">
                                <form id="form_validation" class="subform" method="POST">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" class="form-control" name="subName" required>
                                            <label class="form-label">Subject Name</label>
                                        </div>
                                    </div>

                                    <button class="btn btn-primary waves-effect" id="subbtn" type="button">SUBMIT SUBJECT</button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8">
                        <div class="card animated slideInUp">
                            <div class="header">
                                <h2>AVAILABLE SUBJECTS</h2>
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
                                    <table class="table table-bordered table-striped table-hover dataTable js-exportable" id="subje-table">
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
                                        <tbody style="font-size: 11px;">

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# Basic Validation -->


            </div>
        </section>

        <script src="resources/plugins/jquery/jquery.min.js"></script>
        <script src="resources/plugins/bootstrap/js/bootstrap.js"></script>
        <script src="resources/plugins/bootstrap-select/js/bootstrap-select.js"></script>
        <script src="resources/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>
        <script src="resources/plugins/jquery-validation/jquery.validate.js"></script>
        <script src="resources/plugins/jquery-steps/jquery.steps.js"></script>
        <script src="resources/plugins/sweetalert/sweetalert.min.js"></script>
        <script src="resources/plugins/momentjs/moment.js"></script>
        <script src="resources/plugins/autosize/autosize.js"></script>
        <script src="resources/plugins/bootstrap-material-datetimepicker/js/bootstrap-material-datetimepicker.js"></script>
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
        <script src="resources/js/pages/forms/form-validation.js"></script>
        <script src="resources/js/admin.js"></script>
        <script src="resources/js/pages/forms/basic-form-elements.js"></script>
        <script src="resources/js/demo.js"></script>
        <link href="resources/plugins/bootstrap-select/css/bootstrap-select.css" rel="stylesheet" />
        <script>
            getAllS();

            $("#subbtn").click(function () {
                var form = $('.subform').serialize();
                $.post("addSubject", form, function (resp) {
                    getAllS();
                    swal(resp);
                });

            });


            function getAllS() {
                $.getJSON("getAllSubs", function (resp) {
                    var respon = resp;
                    var table = $('#subje-table').DataTable();
                    table.clear().draw();
                    for (var i in respon) {
                        var temp = respon[i];
                        table.row.add([temp.sub_name, temp.id]).draw(false);
                    }
                });
            }
        </script>
    </body>

</html>