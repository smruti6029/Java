//Write a program ,here we define an enum called AgeCategory which represents the eligibility
//for voting. It has two enum values: ELIGIBLE and INELIGIBLE, each with a corresponding message.
//The checkVotingEligibility() method takes an age as input and returns the appropriate AgeCategory 
//based on the age.create a  method, we set an age value (in this case, 20) 
//and call the checkVotingEligibility() method to determine the eligibility. Finally, 
//we print the age and the eligibility message based on the results.

package com.enum4;
public class Enum {
	enum AgeCategory {
        ELIGIBLE("You are eligible for voting."),
        INELIGIBLE("You are ineligible for voting.");

        private final String message;

        AgeCategory(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
    
    public static AgeCategory checkVotingEligibility(int age) {
        if (age >= 18) {
            return AgeCategory.ELIGIBLE;
        } else {
            return AgeCategory.INELIGIBLE;
        }
    }
    
    public static void main(String[] args) 
    {
        int age = 20;
        AgeCategory sc = checkVotingEligibility(age);
        System.out.println(sc.getMessage());
    }
}













