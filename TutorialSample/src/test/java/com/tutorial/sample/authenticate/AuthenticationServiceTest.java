package com.tutorial.sample.authenticate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.tutorial.sample.dao.AuthenticationDao;
import com.tutorial.sample.service.AuthenticationService;
import com.tutorial.sample.service.UserInfo;

public class AuthenticationServiceTest {
	
	private AuthenticationService authService; 
	private AuthenticationDao authDao;
	
	@Before
	public void setup()
	{
		authDao = Mockito.mock(AuthenticationDao.class);
		authService = new AuthenticationService(authDao);
	}
	
	@After
	public void tear() {
		
	}
	
	@Test
	public void checkAuthorizedUser()
	{
		Boolean expected = false;
		Boolean actual;
		
		UserInfo userInfoInput = new UserInfo();
		userInfoInput.setUserId("123");
		userInfoInput.setUserName("CSD");
		userInfoInput.setUserRole("User");
		
		//Return data from DB
		UserInfo userDBInfo = new UserInfo();
		userDBInfo.setUserName("test");
		userDBInfo.setUserRole("Admin");
		
		Mockito.when(authDao.authorizeUserById("123")).thenReturn(userDBInfo);
		
		actual = authService.authorizeUser(userInfoInput);
		Mockito.verify(authDao).authorizeUserById("123");
		
		assertEquals(expected,actual);
		
	}

}
