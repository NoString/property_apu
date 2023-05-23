package my.apu.common.servlet;

import my.apu.system.config.BaseServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@WebServlet("/test")
public class WelcomeServlet extends BaseServlet {

    public String welcome(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("\"调用了\" = " + "调用了");
        System.out.println("req.getRequestURL() = " + req.getRequestURL());
        return "哈哈啊";
    }
}
