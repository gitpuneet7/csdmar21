/**
 * 
 */
package com.tutorial.sample.service;

import com.tutorial.sample.dao.AuthenticationDao;

/**
 * @author gurud
 *
 */
public class AuthenticationService {
	
	private AuthenticationDao authDao;

	public AuthenticationService(AuthenticationDao authDao) {
		// TODO Auto-generated constructor stub
		this.authDao = authDao;
	}

	public AuthenticationService() {
		// TODO Auto-generated constructor stub
	}

	public Boolean authorizeUser(UserInfo userInfo) {
		// TODO Auto-generated method stub
		UserInfo userInfoFromDB = authDao.authorizeUserById(userInfo.getUserId());
		return userInfoFromDB.getRole().equals(userInfo.getRole());
	}

}
