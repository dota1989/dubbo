package com.book.servlet;

import com.book.service.SimpleService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zhangbin on 2017/9/8.
 */
public class SimpleServlet extends HttpServlet {
    @java.lang.Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.print(SimpleService.getServiceInfo());
        printWriter.flush();
        printWriter.close();
    }

    @java.lang.Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.print(SimpleService.getServiceInfo());
        printWriter.flush();
        printWriter.close();
    }

    @java.lang.Override
    public void destroy() {
        super.destroy();
    }

    @java.lang.Override
    public void init() throws ServletException {
        super.init();
    }
}
