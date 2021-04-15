package com.thinking.machines.egrocery.managers;

import javax.persistence.Entity;

@Entity
public class WSResponse 
{
	private boolean success;
	private string message;
	private object result;
	
	public WSResponse(){
	}
	
	public WSResponse(boolean success,string message, object result){
		this.success=success;
		this.message=message;
		this.result=result;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public string getMessage() {
		return message;
	}
	public void setMessage(string message) {
		this.message = message;
	}
	public object getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}


	