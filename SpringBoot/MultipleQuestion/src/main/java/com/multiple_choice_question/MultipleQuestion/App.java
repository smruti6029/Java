package com.multiple_choice_question.MultipleQuestion;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import com.InsertData.GetAllQuestionAnswer;
import com.InsertData.InsertQuestionAnswer;
import com.adduserdetais.AddUserDetalis;
import com.allResult.GetAllResult;
import com.checkresult.*;


public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter 1 for Admin \nEnter 2 For Examiner");
    	int input =Integer.parseInt(bf.readLine());
    	if(input==1)
    	{
    		while(true)
    		{
    			System.out.println("Enter 1 For Insert Question \n2 For Check Result \n 3 for break");
    			int input1=Integer.parseInt(bf.readLine());
        		if(input1==1)
        		{
        		InsertQuestionAnswer.insertdata();
        		}
        		if(input1==2)
        		{
        			GetAllResult.getAll();
        		}
        		if(input1==3)
        		{
        			break;
        		}
    			
    		}
    	}
    	
    	
    	if(input==2)
    	{
    		while(true)
        	{
    			System.out.println("Enter 1 For Add User \nEnter 2 For Gave Exam \n3 For Check Result \n4 For Break");
    			int input2=Integer.parseInt(bf.readLine());
    			if(input2==1)
    			{
    				AddUserDetalis.addUser();
    			}
        		if(input2==2)
        		{
        			
        			GetAllQuestionAnswer.getQuestion();
        		}
        		if(input2==3)
        		{
        			CheckResultWIthId.checkResultById();
        		}
        		if(input2==4)
        		{
        			break;
        		}
        		
        	}
    		
    	}
    	
    	
    }
}
