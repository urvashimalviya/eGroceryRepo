package com.thinking.machines.egrocery.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thinking.machines.egrocery.hibernate.OperatorPurchaseOrderMapping;
import com.thinking.machines.egrocery.hibernate.OperatorPurchaseOrderMappingHome;

/**
 * Servlet implementation class TestServlet6
 */
@WebServlet("/TestServlet6")
public class TestServlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet6() {
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
		OperatorPurchaseOrderMapping operatorpurchaseordermapping=new OperatorPurchaseOrderMapping();
		operatorpurchaseordermapping.setMappingTime(null);
	    operatorpurchaseordermapping.setPurchaseOrderReferenceNumber(12L);
	    operatorpurchaseordermapping.setMappingDate(null);
	    operatorpurchaseordermapping.setProcessStatus('A');
	
	    OperatorPurchaseOrderMappingHome oh=new OperatorPurchaseOrderMappingHome();
	    try
		{
			oh.persist(operatorpurchaseordermapping);
			pw.println("Test Complete");
		}catch(Exception e)
		{
		pw.println("Test failed"+e);
	    }
	}
	    

	/**"
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
