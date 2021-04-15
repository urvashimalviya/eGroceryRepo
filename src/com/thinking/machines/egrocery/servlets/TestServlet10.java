package com.thinking.machines.egrocery.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thinking.machines.egrocery.hibernate.PurchaseOrder;
import com.thinking.machines.egrocery.hibernate.PurchaseOrderHome;

/**
 * Servlet implementation class TestServlet10
 */
@WebServlet("/TestServlet10")
public class TestServlet10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet10() {
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
	PurchaseOrder purchaseorder=new PurchaseOrder();
	purchaseorder.setReferenceNumber(153L);
	purchaseorder.setCustomerCode(123);
	purchaseorder.setDateOfOrder(null);
	purchaseorder.setTimeOfOrder(null);
    purchaseorder.setOrderStatus('C');
    PurchaseOrderHome ph=new PurchaseOrderHome();
    try
	{
		ph.persist(purchaseorder);
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
