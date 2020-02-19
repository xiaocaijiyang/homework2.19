package chinasoft;

import javax.servlet.*;
import java.io.IOException;

public class homework2 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
          String str1="打印一个字符串";
          String str2="今天偷了一只汤姆猫";
        System.out.println(str1);
        System.out.println(str2);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
