//Create a program for an online bookstore that sells different types of books. 
//Design a Book superclass with attributes like title, author, and price. 
//Implement subclasses such as FictionBook, NonFictionBook, and Ebook that inherit from Book. 
//Override methods like getDiscountedPrice() in each subclass based on specific discount rules.
//Use inheritance to share common attributes and behaviors.


package smruti_june15_ass;


class bookstore{
	
	String title;
	String author;
	double price;
	
	 void getDiscountedPrice(String title , String author ,double price){
		
	     if(price >2000 && price <5000) {
	    	 price = 0.80 *price;
	     } else if(price >5000) {
	    	 price = 0.65* price;
	     }else {
	    	 price=0.95 *price;
	     }
		
	}
	
	
	
}

class FictionBook extends bookstore{
	
	 void getDiscountedPrice(String title , String author , double price){
			
		  if(price >=2000 && price <5000) {
		    	 price = 0.75 *price;
		     } else if(price >=5000 ) {
		    	 price = 0.60* price;
		     }else {
		    	 price=0.90 *price;
		     }
			
		  System.out.println("frictionBook after discount =" + price);	
	}
	 
	
	
	
}

class NonFictionBook extends bookstore{
	
	 void getDiscountedPrice(String title , String author , double price){
			
		  if(price >=2000 && price <5000) {
		    	 price = 0.56 *price;
		     } else if(price >=5000 ) {
		    	 price = 0.40* price;
		     }else {
		    	 price=0.80 *price;
		     }
			
		  System.out.println("NON_FictionBook after discount =" + price);	
	}
			
				
	
}

class Ebook extends bookstore{
	
	 void getDiscountedPrice(String title , String author , double price){
			
		  if(price >=2000 && price <5000) {
		    	 price = 0.66 *price;
		     } else if(price >=5000 ) {
		    	 price = 0.50* price;
		     }else {
		    	 price=0.90 *price;
		     }
			
		  System.out.println("E_book after discount =" + price);	
	}
			

}
	
	public class bookStore_imformation {
		public static void main(String[] args) {
			
			bookstore b1 = new FictionBook();
//			System.out.PRINTLN()
			b1.getDiscountedPrice("THE SMART WORLD ", "S.R.N", 3000);
			
			bookstore b2 = new NonFictionBook();
			b2.getDiscountedPrice("PROGRAMINNING WITH C", ".K.P", 7999);
			
			bookstore b3 = new Ebook();
			b3.getDiscountedPrice("PROGRAMINNING WITH JAVA", "mASTER", 109);
			
		}
}