
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saithanmayeebukkittu
 */
@WebServlet("/student")
public class StudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("studentId");

        // Call business logic to fetch student data
        Student student = StudentService.getStudentById(Integer.parseInt(studentId));

        // Set the student object in the request scope
        request.setAttribute("student", student);

        // Forward to the JSP page for display
        RequestDispatcher dispatcher = request.getRequestDispatcher("studentDetails.jsp");
        dispatcher.forward(request, response);
    }
}
