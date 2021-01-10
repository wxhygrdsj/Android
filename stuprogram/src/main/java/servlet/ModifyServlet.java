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
import java.util.List;

@WebServlet("/ModifyServlet")//修改学生信息servlet
public class ModifyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String stuno=new String(request.getParameter("stuno").getBytes("ISO8859-1"),"UTF-8");
        StudentDaoImpl studentDao=new StudentDaoImpl();
        String allstudent=studentDao.getAllStudent();
        StudentDao sdao=new StudentDaoImpl();
        List<Student> students=null;
        String student=sdao.getStudentsByName(stuno);
        request.setAttribute("students",allstudent);
        request.getRequestDispatcher("updatestudent.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
