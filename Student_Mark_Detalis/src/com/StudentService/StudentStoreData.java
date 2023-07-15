package com.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Dao.StudentMarkDao;
import com.utility.calculateGradePercentage;

import Student_Controller_Package.ConnectionDb;
import java.util.*;
public class StudentStoreData 
{
	public static boolean storeData() throws NumberFormatException, Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student Name,Student,Id,Student Mark");
		System.out.println("Enter Name");
		String name=br.readLine();
		System.out.println("Enter id");
		String code=br.readLine();
		System.out.println("Enter Sub Mark \n Eng- \n Math-  \n BIO- \n IT- \n Chem- \n Phy");
		double english=Double.parseDouble(br.readLine());
		double math=Integer.parseInt(br.readLine());
		double bio=Integer.parseInt(br.readLine());
		double it=Integer.parseInt(br.readLine());
		double chem=Integer.parseInt(br.readLine());
		double phy=Integer.parseInt(br.readLine());
		boolean insert = false;
		if(english<=100 && math<=100 && bio<=100 && it<=100 && chem<=100 && phy<=100)
		{
		insert= (StudentMarkDao.updateStudentDetalis(name,code,english,math,bio,it,chem,phy));
		}
		else 
		{
			System.out.println("Enter The Student mark Between 1 to 100");
		}
		return insert;
	}

	public static void calculateGradeWithPercentage(int id) throws SQLException 
	{
		Map<String,ArrayList<Double>> studentMarkes=new HashMap<>();
		ArrayList<Double>  marks=new ArrayList<>();
		String name="";
		ResultSet set=StudentMarkDao.GetValue(id);
		if(set!=null)
		{
		while(set.next())
		{
			marks.add(set.getDouble("english"));
			marks.add(set.getDouble("math"));
			marks.add(set.getDouble("bio"));
			marks.add(set.getDouble("it"));
			marks.add(set.getDouble("chem"));
			marks.add(set.getDouble("phy"));
			name=set.getString("name");
			
		}
		studentMarkes.put(name, marks);
		HashMap<String,Double> gp=calculateGradePercentage.calculateGradePercentage(studentMarkes);
		if(gp!=null)
		{
			System.out.println(name);
			System.out.println("--------------------");
		gp.forEach((k,v)->{
			System.out.println(k);
			System.out.println("--------------------");
			System.out.printf(" The Grade %.2f", v);
			System.out.println("  ");
		
			
		});
		
		}
		}
		
		
	}
}
