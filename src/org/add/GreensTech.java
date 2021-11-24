package org.add;

public class GreensTech {
	public void greensOmr( int age,String address) {
		System.out.println( "age "+age + "\t address "+ address);
		
	}
	public void greensAdayar(String name, int sal) {
		System.out.println("name "+ name + "\n salary "+ sal);

	}
	public void greensChennai(float avg) {
		System.out.println("average"+avg);
		

	}
	
	public static void main(String[] args) {
		GreensTech g = new GreensTech();
		g.greensOmr(65,"chennai");
		g.greensAdayar("adayar", 17000);
		g.greensChennai(77.8f);
	}

}
