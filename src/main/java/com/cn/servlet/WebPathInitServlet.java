package com.cn.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author Syen
 * @date 2019/7/28 0028-下午 15:54
 */
@WebServlet(urlPatterns = {},loadOnStartup = 2)
public class WebPathInitServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        config.getServletContext().setAttribute("ctx",config.getServletContext().getContextPath());

        super.init(config);
    }
}
