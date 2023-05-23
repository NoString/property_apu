package my.apu.system.config;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class BaseServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        try {
            this.getClass()                                                //servlet对象得到Servlet类即Class类的实例
                    .getMethod(req.getParameter("m"),       //通过req.getParameter获取url中method属性的值
                            HttpServletRequest.class,
                            HttpServletResponse.class)            //反射知识，得到方法对象
                    .invoke(this, req, res);                      //传参，调用方法，（this指的是谁来调用该方法）
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();                          //异常处理
        }
    }
}
