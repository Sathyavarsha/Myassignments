package mavenproject;

public class Mobile1 {
	
	public void sendMsg() {
		System.out.println("Good Morning");
	}
	public void makeCall() {
		System.out.println("Call to my friend");
	}

	public static void main(String[] args) {
		int cost=15000;
		float weight=64.3f;
		boolean fullcharged=true;
		String name = null;	
		Mobile1 t=new Mobile1();
		t.sendMsg();
		t.makeCall();


		System.out.println("cost is " +cost);
		System.out.println("Weight is " +weight);
		System.out.println("fullcharged is " +fullcharged); 
		System.out.println("name is "+name);
		System.out.println("This is my mobile");

	}
	
	

}
