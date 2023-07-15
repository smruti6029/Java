package Student_Controller_Package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Dao.StudentMarkDao;
import com.StudentService.CountStudentEachGrade;
import com.StudentService.StudentStoreData;
import com.StudentService.UbdateStudentMark;

public class StudentMainClass {
	public static void main(String[] args) throws NumberFormatException, Exception  
	
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String tableinsert;
//		1
		while(true) 
		{
	
			System.out.println("Enter 1 to add Student Markes");
			System.out.println("Enter 2 to Featch Data With Calculate Grade");
			System.out.println("Enter 3 to Mark to update");
			System.out.println("Enter 4 to See The Grade of Student");
			System.out.println("Enter 5 to exit");
			
			int input=Integer.parseInt(br.readLine());
			if(input==1)
			{
				boolean add=StudentStoreData.storeData();
				if(add)
				{
					System.out.println("Insert Sussesfuly");
				}
				else
				{
					System.out.println("Insert Faild");
				}
			}
			if(input==2)
			{
				System.out.println("Enter Student Code");
				int id=Integer.parseInt(br.readLine());
				StudentStoreData.calculateGradeWithPercentage(id);
			}
			if(input==3)
			{
				int insertUbdate=UbdateStudentMark.ubdateMark();
				if(insertUbdate!=0)
				{
					System.out.println("Ubdate SucessFully");
				}
				else
				{
					System.out.println("Ubdateed Falid");
				}
			}
			if(input==4)
			{
				CountStudentEachGrade.CountStudentEachGrade();
			}
			if(input==5)
			{
				System.out.println("Thank You");
				break;
			}
			System.out.println("Thank You");
			
			
		}
		
		
	}
	

}
