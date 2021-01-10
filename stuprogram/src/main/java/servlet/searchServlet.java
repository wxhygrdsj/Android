package servlet;

import com.google.gson.Gson;
import dao.Impl.StudentDaoImpl;
import dao.StudentDao;
import model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        StudentDao sdao=new StudentDaoImpl();
        //List<Student> students=sdao.getStudentsByName(name);
        PrintWriter out=response.getWriter();
        out.write(sdao.getStudentsByName(name));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
