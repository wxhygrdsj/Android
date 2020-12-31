//package edu.njfu.sas.servlet2;
//
//import javax.imageio.ImageIO;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebServlet(name = "ImageCodeServlet")
//public class ImageCodeServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String vericode=CreateVerificationCod.getSecurityCode();
//        HttpSession session= request.getSession();
//        session.setAttribute("verityCode",vericode);
//        response.setContentType("img/jpeg");
//        response.setHeader("Pragma","No-cache");
//        response.setHeader("Cache-Control","no_cache");
//
//        response.setDateHeader("Expires",0);
//        ImageIO.write(new CreateVerificationCodeImage)
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        this.doPost(request,response);
//    }
//}
