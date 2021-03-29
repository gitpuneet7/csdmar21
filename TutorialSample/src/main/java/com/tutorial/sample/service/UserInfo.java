/**
 * 
 */
package com.tutorial.sample.service;

/**
 * @author gurud
 *
 */
public class UserInfo {

	private String uname;
	private String urole;
	private String uid;
	
	public void setUserName(String uname) {
		// TODO Auto-generated method stub
		this.uname = uname;
		
	}

	public void setUserRole(String urole) {
		// TODO Auto-generated method stub
		this.urole = urole;
		
	}

	public void setUserId(String uid) {
		// TODO Auto-generated method stub
		this.uid = uid;
		
	}

	public String getUserId() {
		// TODO Auto-generated method stub
		return this.uid;
	}

	public String getRole() {
		// TODO Auto-generated method stub
		return this.urole;
	}

}
