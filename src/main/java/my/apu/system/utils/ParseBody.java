package my.apu.system.utils;

import com.alibaba.fastjson2.JSONObject;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;

public class ParseBody {
    public static HashMap<String, String> toMap(HttpServletRequest req) throws IOException {
        HashMap<String, String> bodyMap = new HashMap<>();
        ServletInputStream servletInputStream = req.getInputStream();

        StringBuilder content = new StringBuilder();
        byte[] b = new byte[1024];
        int lens;
        while ((lens = servletInputStream.read(b)) > 0) {
            content.append(new String(b, 0, lens));
        }

        String strContent = content.toString(); // 请求体内容
        String[] split = strContent.split("&");
        for (String s : split) {
            String[] keyAndValue = s.split("=");
            bodyMap.put(keyAndValue[0],keyAndValue[1]);
        }


        return bodyMap;
    }
}
