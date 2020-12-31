//package edu.njfu.sas.filter;
//
//import com.mysql.cj.Session;
//import com.mysql.cj.xdevapi.SessionImpl;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//
//public class MyFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        //String encoding=filterConfig.getInitParameter("encoding");
//        //String namespace=filterConfig.getInitParameter("namespace");
//        System.out.println("MyFilter.init()方法被调用");
//        //System.out.println("-----" + encoding + "------,-----"+namespace+"-----");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        //System.out.println("MyFilter.doFilter()方法开始工作了");
//        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
//        Object user=session.getAttribute("user");
//        if(user==null){
//            PrintWriter writer = ((HttpServletResponse) servletResponse).getWriter();
//            writer.write("<script>alert('用户未登录，请登录');location.href='index.html'</script>");
//
//        }
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("MyFilter.destroy()方法被调用，MyFilter被销毁");
//    }
//}
