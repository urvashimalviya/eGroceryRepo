package com.thinking.machines.egrocery.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thinking.machines.egrocery.hibernate.PurchaseOrderItem;
import com.thinking.machines.egrocery.hibernate.PurchaseOrderItemHome;

/**
 * Servlet implementation class TestServlet9
 */
@WebServlet("/TestServlet9")
public class TestServlet9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet9() {
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
		PurchaseOrderItem purchaseorderitem=new PurchaseOrderItem();
		purchaseorderitem.setReferenceNumber(115L);
		purchaseorderitem.setItemCode(123);
		purchaseorderitem.setQuantity(500.35);
		purchaseorderitem.setComment("Happy new year");
		purchaseorderitem.setOrderStatus('C');
		purchaseorderitem.setRate(100.25);
		purchaseorderitem.setUnitOfMeasurementCode(12300);
		PurchaseOrderItemHome ph=new PurchaseOrderItemHome();
		try
		{
			ph.persist(purchaseorderitem);
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
