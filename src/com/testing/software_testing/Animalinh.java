package com.testing.software_testing;

class AnimalandBird{
	public void Run() {
		System.out.print("Yehh i can run faster");
	}
	public void eat ()
	{
		System.out.print("Eating is necessary ");
	}
}

class Bird extends AnimalandBird{
	public void fly()
	{
		System.out.print("yehh i can fly into the sky");
	}
}
class Animal extends AnimalandBird{
	public void bark()
	{
		System.out.println("i can bark loudly");
	}
}
public class Animalinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b=new Bird();
		b.eat();
		b.Run();
		b.fly();
		Animal a=new Animal();
		a.bark();
		a.Run();
		a.eat();
	}

}
