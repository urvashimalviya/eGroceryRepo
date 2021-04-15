package com.thinking.machines.egrocery.managers;

import com.thinking.machines.egrocery.hibernate.Category;
import com.thinking.machines.egrocery.hibernate.CategoryHome;
import com.thinking.machines.egrocery.hibernate.Item;
import com.thinking.machines.egrocery.hibernate.ItemHome;

public class ItemManager {
	public WSResponse addItem(Item item)
	{
		WSResponse wsresponse;
		wsresponse=new WSResponse();	
	try
	{
		ItemHome ih=new ItemHome();
		ih.persist(item);
		wsresponse.setSuccess(true);
		wsresponse.setResult("Item added succesfully");
	}catch(Exception exception)
	{
		wsresponse.setSuccess(false);
		wsresponse.setException(exception.getMessage());
	}
return wsresponse;
	}
	public WSResponse updateItem(Item item)
	{
		WSResponse wsresponse;
		wsresponse=new WSResponse();	
	try
	{
		ItemHome ih=new ItemHome();
		ih.persist(item);
		wsresponse.setSuccess(true);
		wsresponse.setResult("Item updated succesfully");
	}catch(Exception exception)
	{
		wsresponse.setSuccess(false);
		wsresponse.setException(exception.getMessage());
	}
return wsresponse;	
	}
	public WSResponse removeItem(int itemcode)
	{
		WSResponse wsresponse;
		wsresponse=new WSResponse();	
	try
	{
		ItemHome ih=new ItemHome();
		ih.persist(item);
		wsresponse.setSuccess(true);
		wsresponse.setResult("Item deleted succesfully");
	}catch(Exception exception)
	{
		wsresponse.setSuccess(false);
		wsresponse.setException(exception.getMessage());
	}
return wsresponse;
	}
public WSResponse getItem(int itemcode)
{
	WSResponse wsresponse;
	wsresponse=new WSResponse();	
try
{
	ItemHome ih=new ItemHome();
	ih.persist(item);
	wsresponse.setSuccess(true);
	wsresponse.setResult("Items :");
}catch(Exception exception)
{
	wsresponse.setSuccess(false);
	wsresponse.setException(exception.getMessage());
}
return wsresponse;
}
public WSResponse getItems()
{
	WSResponse wsresponse;
	wsresponse=new WSResponse();	
try
{
	ItemHome ih=new ItemHome();
	ih.persist(item);
	wsresponse.setSuccess(true);
	wsresponse.setResult("All items list :");
}catch(Exception exception)
{
	wsresponse.setSuccess(false);
	wsresponse.setException(exception.getMessage());
}
return wsresponse;
}
public WSResponse addCategory(Category category)
{
	WSResponse wsresponse;
	wsresponse=new WSResponse();
	try
	{
		CategoryHome ch=new CategoryHome();
		ch.persist(category);
		wsresponse.setSuccess(true);
		wsresponse.setResult("Category Added succesfully");
		}catch(Exception exception)
	{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
	}
	return wsresponse;
}
public WSResponse updateCategory(Category category)
{
	WSResponse wsresponse;
	wsresponse=new WSResponse();
	try
	{
		CategoryHome ch=new CategoryHome();
		ch.persist(category);
		wsresponse.setSuccess(true);
		wsresponse.setResult("Category updated succesfully");
		}catch(Exception exception)
	{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
	}
	return wsresponse;
}

public WSResponse removeCategory(int categorycode)
{
	WSResponse wsresponse;
	wsresponse=new WSResponse();
	try
	{
		CategoryHome ch=new CategoryHome();
		ch.persist(categorycode);
		wsresponse.setSuccess(true);
		wsresponse.setResult("Category updated succesfully");
		}catch(Exception exception)
	{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
	}
	return wsresponse;
}


}
