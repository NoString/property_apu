package my.apu.system.servlet;


import com.alibaba.fastjson2.JSONObject;
import my.apu.system.config.BaseServlet;
import my.apu.system.utils.ParseBody;
import my.apu.system.utils.sqlUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;

@WebServlet("/login.action")
public class LoginServlet extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HashMap<String, String> bodyMap = ParseBody.toMap(req);
        Connection conn = sqlUtil.getConn();

    }
}
