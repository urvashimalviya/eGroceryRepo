package com.thinking.machines.egrocery.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thinking.machines.egrocery.hibernate.ProcessedPurchaseOrder;
import com.thinking.machines.egrocery.hibernate.ProcessedPurchaseOrderHome;

/**
 * Servlet implementation class TestServlet7
 */
@WebServlet("/TestServlet7")
public class TestServlet7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet7() {
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
		ProcessedPurchaseOrder processedpurchaseorder =new ProcessedPurchaseOrder();
		processedpurchaseorder.setReferenceNumber(0);
		processedpurchaseorder.setMappingDate(null);
		processedpurchaseorder.setMappingTime(null);
		processedpurchaseorder.setPurchaseOrderReferenceNumber(0);
		processedpurchaseorder.setProcessStatus('A');
		processedpurchaseorder.setCompletionDate(2018-01-15);
		processedpurchaseorder.setCompletionTime(22:22:25);
		ProcessedPurchaseOrderHome ph=new ProcessedPurchaseOrderHome();
		try
		{
			ph.persist(processedpurchaseorder);
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
