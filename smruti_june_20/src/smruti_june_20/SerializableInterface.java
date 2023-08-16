package smruti_june_20;
import java.io.Serializable;

class MyClass implements Serializable {
    
	private static final long serialVersionUID = 123456789L;
	void show()
	{
		System.out.println(serialVersionUID);
	}
	}

public class SerializableInterface {

	public static void main(String[] args) 
	{
		MyClass obj=new MyClass();
		obj.show();

	}

}
