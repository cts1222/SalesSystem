package ca.demo.Salestools;

public class Main {

	public static void main(String[] args) {
		SalesData data=new SalesData();
		displayGreeting();
		data.display();
		

	}

	private static void displayGreeting() {
		System.out.println("hello");
		System.out.println("this app");
		System.out.println("new line");
	}

}
