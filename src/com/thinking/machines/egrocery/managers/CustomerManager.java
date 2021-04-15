package com.thinking.machines.egrocery.managers;
import java.util.*;
import com.thinking.machines.egrocery.hibernate.Customer;
import com.thinking.machines.egrocery.hibernate.CustomerHome;

public class CustomerManager {
		private Customer customer;

		public WSResponse addCustomer(Customer customer)
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();	
		try
		{
			CustomerHome ch=new CustomerHome();
			ch.persist(customer);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Customer added succesfully");
		}catch(Exception exception)
		{
			wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
	return wsresponse;
		}
		public WSResponse updateCustomer(Customer customer)
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();
		try
		{
			CustomerHome ch=new CustomerHome();
			ch.persist(customer);
			wsresponse.setSuccess(true);
			wsresponse.setResult("Customer updated succesfully");
		}catch(Exception exception)
		{
		    wsresponse.setSuccess(false);
			wsresponse.setException(exception.getMessage());
		}
		return wsresponse;
		}
		
		public WSResponse removeCustomer(Customer customercode)
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();
			try
			{
				CustomerHome ch=new CustomerHome();
				ch.persist(customer);
				wsresponse.setSuccess(true);
				wsresponse.setResult("Customer deleted succesfully");
			}catch(Exception exception)
			{
				wsresponse.setSuccess(false);
				wsresponse.setException(exception.getMessage());
			}
			return wsresponse;
		}
		public WSResponse getCustomer(Customer customercode)
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();
			try
			{
				CustomerHome ch=new CustomerHome();
				ch.persist(customer);
				wsresponse.setSuccess(true);
				wsresponse.setResult("List :");
			}catch(Exception exception)
			{
				wsresponse.setSuccess(false);
				wsresponse.setException(exception.getMessage());
			}
			return wsresponse;	
		}
		
		public WSResponse getCustomers()
		{
			WSResponse wsresponse;
			wsresponse=new WSResponse();
			try
			{
				CustomerHome ch=new CustomerHome();
				ch.persist(customer);
				wsresponse.setSuccess(true);
				wsresponse.setResult("Customer deleted succesfully");
			}catch(Exception exception)
			{
				wsresponse.setSuccess(false);
				wsresponse.setException(exception.getMessage());
			}
			return wsresponse;
		}

}
