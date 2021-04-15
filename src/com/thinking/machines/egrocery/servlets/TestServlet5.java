package com.thinking.machines.egrocery.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thinking.machines.egrocery.hibernate.ShopOperator;
import com.thinking.machines.egrocery.hibernate.ShopOperatorHome;

/**
 * Servlet implementation class TestServlet5
 */
@WebServlet("/TestServlet5")
public class TestServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet5() {
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
		ShopOperator shopoperator=new ShopOperator();
		shopoperator.setUsername("_urvashim");
		shopoperator.setPassword("1520");
		shopoperator.setPasswordKey("KD");
		shopoperator.setIsAdminstrator(false);
		shopoperator.setName("Urvashi Malviya");
		
		ShopOperatorHome sh=new ShopOperatorHome();
		try
		{
			sh.persist(shopoperator);
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
