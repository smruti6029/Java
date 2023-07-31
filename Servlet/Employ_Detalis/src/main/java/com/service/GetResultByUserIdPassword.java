package com.service;

import com.dao.GetAllResult;
import com.Entity.*;

public class GetResultByUserIdPassword {

	public static Emp getUserdetalis(String email, String password) 
	
	{
		
		Emp userDetalis=GetAllResult.gelResult(email,password);
		
			return  userDetalis;
		
		
	}

}
