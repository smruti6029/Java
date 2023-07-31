package com.service;
import java.util.List;

import com.Entity.*;
import com.dao.GetAllEmploy;
public class GetAllEmployDetalis {

	public static List<Emp> getAllDetalis() {
		
		
		 List<Emp> getAllUser= GetAllEmploy.getEmploy();
		
		
		return getAllUser;
	}

}
