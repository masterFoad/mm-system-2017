package mm.webclientservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mm.da.DataAccess;

/**
 * Servlet implementation class AddMentee
 */
@WebServlet("/AddMentee")
public class AddMentee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMentee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
				/*
				 * uFirstName
		uLastName
		uPhoneNumber
		uEmail
		uGender
		uAddress
		uGraduationStatus
		uCourseOfStudy
		uAcademicInstitution
		uRemSemesters
		uAverage
		uNotes
		
				 * 
				 * */
		
		
		String uFirstName = request.getParameter("uFirstName");
		String uLastName = request.getParameter("uLastName");
		String uPhoneNumber = request.getParameter("uPhoneNumber");
		String uEmail = request.getParameter("uEmail");
		String uGender = request.getParameter("uGender");
		String uAddress = request.getParameter("uAddress");
		String uGraduationStatus = request.getParameter("uGraduationStatus");
		String uCourseOfStudy = request.getParameter("uCourseOfStudy");
		String uAcademicInstitution = request.getParameter("uAcademicInstitution");
		String uRemSemesters = request.getParameter("uRemSemesters");
		String uAverage = request.getParameter("uAverage");
		String uNotes = request.getParameter("uNotes");
		
		DataAccess myDa = new DataAccess();
		myDa.addMentee(uFirstName,uLastName,uPhoneNumber,uEmail,uGender
				,uAddress,uGraduationStatus,uCourseOfStudy,uAcademicInstitution,uRemSemesters)
		
		
	}

}
