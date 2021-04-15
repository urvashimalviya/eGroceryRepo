package com.thinking.machines.egrocery.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thinking.machines.egrocery.hibernate.Registration;
import com.thinking.machines.egrocery.hibernate.RegistrationHome;

/**
 * Servlet implementation class TestServlet8
 */
@WebServlet("/TestServlet8")
public class TestServlet8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet8() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw;
		pw=response.getWriter();
		response.setContentType("text/html");
		Registration registration=new Registration();
		registration.setCustomerCode(150);
		registration.setDateOfRegistration('09-Oct-2018');
		registration.setIsActive('I');
		registration.setPassword("sweetie");
		registration.setUsername("rachelgreen");
		RegistrationHome rh=new RegistrationHome();
		try
		{
				rh.persist(registration);
				pw.println("Test Complete");
			}catch(Exception e)
			{
			pw.println("Test failed"+e);
		    }
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
