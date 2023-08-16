package example_switch;
import java.util.*;

class demo {
	void show()
	{
		int a,y;
		Scanner objj=new Scanner(System.in);
		System.out.println("enter day");
		a=objj.nextInt();
		switch(a) {
		case 1:
			System.out.println("monday");
			System.out.println("please eneter 1 to coutinue and 0 to exit");
			y=objj.nextInt();
			
			if(y==1) {
				show();
			}
				else {
					break;
					
				}
			break;
		  case 2:
			
			System.out.println("tuesday");
			System.out.println("please eneter 1 to coutinue and 0 to exit");
			y=objj.nextInt();
			
			if(y==1) {
				show();
			}
				else {
					break;
					
				}
			break;
			case 3:
				
				System.out.println("wednesday");
				System.out.println("please eneter 1 to coutinue and 0 to exit");
				y=objj.nextInt();
				
				if(y==1) {
					show();
				}
					else {
						break;
						
					}
				break;
			case 4:
				
				System.out.println("thusday");
				System.out.println("please eneter 1 to coutinue and 0 to exit");
				y=objj.nextInt();
				
				if(y==1) {
					show();
				}
					else {
						break;
						
					} 
				break;
				case 5:
						
						System.out.println("Friday");
						System.out.println("please eneter 1 to coutinue and 0 to exit");
						y=objj.nextInt();
						
						if(y==1) {
							show();
						}
							else {
								break;
								
							}
						break;
				case 6:
					
					System.out.println("saturday");
					System.out.println("please eneter 1 to coutinue and 0 to exit");
					y=objj.nextInt();
					
					if(y==1) {
						show();
					}
						else {
							break;
							
						}
					break;
				case 7:
					
					System.out.println("SUNDAY");
					System.out.println("please eneter 1 to coutinue and 0 to exit");
					y=objj.nextInt();
					
					if(y==1) {
						show();
					}
						else {
							break;
							
						}
					default :
						System.out.println("enter the day betweed 1 to7");
						show();
			     }
		
			
			
		}
	}
class demo42{
	public static void main(String[]args)
	{
		demo obj1=new demo();
		obj1.show();
	}
}
