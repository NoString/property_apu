<%--
  Created by IntelliJ IDEA.
  User: zhs
  Date: 5/24/2023
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Property APU</title>
    <link rel="stylesheet" href="static/css/reset.css">
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <link rel="stylesheet" href="static/css/login/login.css">
    <script type="text/javascript" src="static/layui/layui.js"></script>

</head>
<body>
<div class="backImg">
    <div class="layui-row">
        <div class="layui-col-md4 layui-col-lg-offset6" style="margin-top: 20%">


            <fieldset class="layui-elem-field" style="border-radius: 5px">
                <legend style="color: white;">Welcome to Property APU System</legend>

                <div class="layui-row" style="background: #e2e2e2;">
                    <img src="static/img/logo.png"  class="layui-col-md3 layui-col-md-offset4">
                    <form  action="/login.action" method="post" class="layui-form yPadding">
                        <div class="layui-form-item xPadding">

                            <input type="text" name="username" lay-verify="required" lay-reqtext="can not empty"
                                   placeholder="username" autocomplete="off" class="layui-input">

                        </div>
                        <div class="layui-form-item xPadding">

                            <input type="text" name="password" lay-verify="required" lay-reqtext="can not empty"
                                   placeholder="password" autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-row">
                            <div class="layui-col-md4 layui-col-md-offset1">
                                <button type="button"
                                        class="layui-btn layui-btn-primary layui-border-black layui-btn-xs"
                                        lay-submit="" lay-filter="demo1">I forget my password
                                </button>

                            </div>
                            <div class="layui-col-md7">
                                <div class="layui-row">
                                    <div class="layui-col-md5 layui-col-md-offset1">
                                        <button type="button" class="layui-btn layui-btn-radius" lay-submit=""
                                                lay-filter="demo1">Sign up
                                        </button>

                                    </div>
                                    <div class="layui-col-md2">
                                        <button type="submit" class="layui-btn layui-btn-normal layui-btn-radius"
                                                lay-submit lay-filter="signIn">Sign in
                                        </button>

                                    </div>

                                </div>
                            </div>

                        </div>

                    </form>
                </div>

            </fieldset>
        </div>

    </div>


</div>


</body>
</html>
