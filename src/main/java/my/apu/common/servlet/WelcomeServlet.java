package my.apu.common.servlet;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import my.apu.system.config.BaseServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/test")
public class WelcomeServlet extends BaseServlet {

    public String welcome(HttpServletRequest req,
                          HttpServletResponse resp) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader reader = req.getReader();
        String line;
        while ((line = reader.readLine()) != null){
            stringBuffer.append(line);
        }
        JSONObject parse = (JSONObject) JSON.parse(stringBuffer.toString());
        System.out.println("parse.get(name) = " + parse.get("name"));
        return "哈哈啊";
    }
}
