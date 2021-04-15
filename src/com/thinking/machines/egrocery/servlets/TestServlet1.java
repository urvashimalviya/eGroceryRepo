package com.thinking.machines.egrocery.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thinking.machines.egrocery.hibernate.Customer;
import com.thinking.machines.egrocery.hibernate.CustomerHome;

/**
 * Servlet implementation class TestServlet1
 */
@WebServlet("/TestServlet1")
public class TestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet1() {
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
		Customer customer=new Customer();
		customer.setName("Chandler Bing");
		customer.setAddress("Central Perk");
		customer.setContactNumber("9691448224");
		customer.setSmsNotificationNumber("2556462556");
		CustomerHome ch=new CustomerHome();
		try
		{
			ch.persist(customer);
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
