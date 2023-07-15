package com.StudentService;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.Dao.StudentMarkDao;

public class UbdateStudentMark {

	public static int ubdateMark() throws Exception 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Code ");
		String code=br.readLine();
		System.out.println("Enter Sub Mark \n Eng- \n Math-  \n BIO- \n IT- \n Chem- \n Phy");
		double english=Double.parseDouble(br.readLine());
		double math=Integer.parseInt(br.readLine());
		double bio=Integer.parseInt(br.readLine());
		double it=Integer.parseInt(br.readLine());
		double chem=Integer.parseInt(br.readLine());
		double phy=Integer.parseInt(br.readLine());
		int insert = 0;
		if(english<=100 && math<=100 && bio<=100 && it<=100 && chem<=100 && phy<=100)
		{
		insert= (StudentMarkDao.updateStudentMark(code,english,math,bio,it,chem,phy));
		}
		else 
		{
			System.out.println("Enter The Student mark Between 1 to 100");
		}
		
		return insert;
	}
		
		
		
	}


