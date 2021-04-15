package com.thinking.machines.egrocery.managers;

import com.thinking.machines.egrocery.hibernate.PurchaseOrderHome;
import com.thinking.machines.egrocery.hibernate.PurchaseOrderItem;
import com.thinking.machines.egrocery.hibernate.PurchaseOrderItemHome;

public class PurchaseOrderManager {

	public PurchaseOrderManager() {
		// TODO Auto-generated constructor stub
	}
	
	public WSResponse createList(int customercode)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			PurchaseOrderHome ph=new PurchaseOrderHome();
			ph.persist(purchaseorder);
			wsresponse.setSuccess(true);
			wsresponse.setResult("List created : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse addToList(PurchaseOrderItem purchaseorderitem)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			PurchaseOrderItemHome ph=new PurchaseOrderItemHome();
			ph.persist(purchaseorder);
			wsresponse.setSuccess(true);
			wsresponse.setResult("List created : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
}

public WSResponse updateListItem(PurchaseOrderItem purchaseorderitem)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			PurchaseOrderItemHome ph=new PurchaseOrderItemHome();
			ph.persist(purchaseorderitem);
			wsresponse.setSuccess(true);
			wsresponse.setResult("List updated : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
}
	public WSResponse clearList(int referencenumber)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			PurchaseOrderHome ph=new PurchaseOrderHome();
			ph.persist(purchaseorder);
			wsresponse.setSuccess(true);
			wsresponse.setResult("List deleted : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

    public WSResponse getPreviousOrders(int customercode)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			PurchaseOrderHome ph=new PurchaseOrderHome();
			ph.persist(purchaseorder);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Previous orders list : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }
public WSResponse getPurchaseOrder(int referencenumber)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			PurchaseOrderHome ph=new PurchaseOrderHome();
			ph.persist(purchaseorder);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Purchase Order : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse PlaceOrder(int referencenumber)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			PurchaseOrderHome ph=new PurchaseOrderHome();
			ph.persist(purchaseorder);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Placed Order : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse getOrderStatus(int customercode)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			PurchaseOrderItemHome ph=new PurchaseOrderItemHome();
			ph.persist(purchaseorderitem);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Placed Order : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }


}
