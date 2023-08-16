//Given a list of names, count the number of occurrences of each name and display the result.

package com.Collection;
import java.util.*;

public class OccuranceOfGivenString {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Rapidsoft");
		list.add("laptop");
		list.add("Raja");
		list.add("Raja");
		HashSet<String> set = new HashSet<>();
		for(String str : list) {
			if(!set.contains(str)) {
				int frequency = Collections.frequency(list, str);
				set.add(str + " - " + Integer.toString(frequency));
			}
		}

		System.out.println(set);
	}

}
