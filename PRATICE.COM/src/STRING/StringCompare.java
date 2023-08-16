package STRING;
import java.util.ArrayList;
import java.util.*;

public class StringCompare {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList();
		a.add("master");
		a.add("smruti");
		a.add("Ranjan");
		System.out.println(a);
		HashSet<String> color=new HashSet<>();
		color.add("RED");
		color.add("Yello");
		color.add("BLACK");
		color.add("RED");
		color.add("Yello");
		a.add("String");
		System.out.println(color);
		
		
		System.out.println(color.size()+"           "+a.size());
	}

}
