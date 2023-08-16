package wrapper_class;

//Given a list of strings, remove all elements that start with a vowel and display the modified list.

import java.util.*;

class VowelStringRemove
{
	List<String> list=new ArrayList<>();
	public void checkVowel(List<String> list)
	{
		this.list=list;
		List<String> vowel=new ArrayList<>();
		vowel.add("a");
		vowel.add("e");
		vowel.add("i");
		vowel.add("o");
		vowel.add("u");
		vowel.add("A");
		vowel.add("E");
	
		
		for(String str:list)
		{
//			System.out.println(str);
			for(String vowel1:vowel)
			{
//				System.out.println(vowel1);
				if(vowel1.charAt(0)==str.charAt(0))
				{
					System.out.println("nbdvcvdkcvdas");
					list.remove(str);
					System.out.println("end");
					break;
				}
			}
			
			System.out.println("Final end");
		}
		
		System.out.println("dkjgdwkhv");
//		return list;
	}
}


public class WrapperExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Mass");
		list.add("Raja");
		list.add("apple");
		VowelStringRemove obj=new VowelStringRemove();
		obj.checkVowel(list);

	}

	

}

