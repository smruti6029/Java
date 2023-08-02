package com.datainsert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ManagerDao.DataInsert;
import com.entity.devloper;
import com.entity.manager;
import com.entity.quality;
import java.util.*;



public class DataInsertIntable 
{
	public static void  dataInsert() throws IOException 
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		manager manager=new manager(1,"Shiva Sir");
		manager manager1=new manager(2,"Sourav Sir");
		devloper dev=new devloper();
		devloper dev1=new devloper();
		List<devloper> devList=new ArrayList<devloper>();
		dev.setId(1);
		dev.setManager(manager1);
		dev.setName("Sandeep Bali");
		dev1.setId(2);
		dev1.setName("Smruti");
		dev1.setManager(manager);
		devList.add(dev1);
		devList.add(dev);
		quality q=new quality();
		q.setManager(manager1);
		q.setId(1);
		q.setName("Abhisek");
		q.setManager(manager1);
		DataInsert.InsertDataMnager(manager);
		DataInsert.InsertDataMnager(manager1);
		DataInsert.InsertDataQuality(q);
		
		DataInsert.InsertDataDevloper(devList);
//		
		
		
	

	}
}
