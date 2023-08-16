//Create a class called "Animal" with a method "sound()". 
//Create two subclasses, "Cat" and "Dog", that inherit from the "Animal" class
//and override the "sound()" method to make different sounds for each subclass.

package Smruti_june16;
class animalSoundclass{
	void sound()
	{
		System.out.println("Animal is sound");
	}
}

class cat extends animalSoundclass{ 
	@Override
	void sound()
	{
	System.out.println("Cat is speaking Mau");
	}
	
}
class dog extends animalSoundclass{
	@Override
	void sound()
	{
	System.out.println("dog is speaking bho bho");
	}
	
}

public class animalSound {
		public static void main(String[]args)
		{
			animalSoundclass cat=new cat();
			animalSoundclass dog=new dog();
			cat.sound();
			dog.sound();
		}
	
	
	
	
	
	
}
