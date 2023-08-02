package com.validation;

import java.util.List;

import com.DAO_FOR_MCQ.GetAllUSer;
import com.DAO_FOR_MCQ.UserQuestionAnswerById;
import com.mcq.entity.User_Input_Answer;
import com.mcq.entity.UsersInputClass;

public class UserValidation {

	public static boolean vallidUser(int user_id) 
	
	{
		List<User_Input_Answer> useranswer=UserQuestionAnswerById.getQuestionanswer();
		for(User_Input_Answer inputdata:useranswer)
		{
			if(inputdata.getUser().getId()==user_id)
			{
				return false;
			}

		}
		return true;
	}

}
