package com.thinking.machines.egrocery.managers;

public class OperationManager {

	public OperationManager() {
		// TODO Auto-generated constructor stub
	}
public WSResponse createOperator(ShopOperator shopoperator)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Operator created : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse updateOperator(ShopOperator shopoperator)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Operator updated : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse removeOperator(username)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Remove operator : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse getOperator(string username)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult(" operator : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse getOperators()
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult(" operators : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse getOrder(int referencenumber)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult(" Order : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse getOrders()
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Orders : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse getOperatorsStatus()
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Orders : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }


public WSResponse delegateOrder(int referencenumber, string username)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Orders : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse getOrderToProcess(string username)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Orders : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }

public WSResponse updatePurchaseOrderItemStatus(purchaseorder referencenumber,item referencenumber,orderstatus)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult("PO item status : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }
public WSResponse updateOrderStatus(referencenumber,status)
	{
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			ShopOperatorHome sh=new ShopOperatorHome();
			sh.persist(shopoperator);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Orders : ");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
         }





}
