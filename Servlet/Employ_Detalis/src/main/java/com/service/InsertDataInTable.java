package com.service;

import com.Entity.Emp;
import com.dao.*;

public class InsertDataInTable {

	public static boolean insertIntable(Emp emp) 
	
	{
		
		int result=InsertDAta.InsertDataMnager(emp);
		
			if(result>0)
			{
				return true;
			}
			else
			{
				return false;
			}
	}

}
