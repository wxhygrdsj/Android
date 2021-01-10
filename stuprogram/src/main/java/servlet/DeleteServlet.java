package servlet;

import dao.Impl.StudentDaoImpl;
import dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String stuname=request.getParameter("stuname");
        System.out.println(stuname);
        StudentDao sdao=new StudentDaoImpl();
        sdao.deleteStu(stuname);
        PrintWriter out=response.getWriter();
        //String s=sdao.getAllStudent();
        try {
            System.out.print(sdao.getAllStudent());
            out.write(sdao.getAllStudent());
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }
}

