package com.thinking.machines.egrocery.managers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thinking.machines.egrocery.hibernate.CustomerHome;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet(name = "TestServlet12", urlPatterns = { "/TestServlet12" })
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
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
		CustomerManager customermanager=new CustomerManager();
		customermanager.addCustomer(null);
		CustomerHome ch=new CustomerHome(); 
		try 
		{ 
	    ch.persist(null); 
	    pw.println("Test complete"); 
	    }catch(Exception e) 
		{ 
	    	pw.println("Test failed "+e); 
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
