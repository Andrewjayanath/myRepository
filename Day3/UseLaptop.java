package Day3;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop l1=new Laptop();
		l1.brand="Samsung";
		String a=l1.brand.toUpperCase();
		System.out.println(a);
		int b=a.length();
		System.out.println(b);
		boolean c=a.startsWith("D");
		System.out.println(c);
		char d=a.charAt(6);
		System.out.println(d);
		String e=a.toLowerCase();
		System.out.println(e);
		String f="black";
		System.out.println(f);
		
		
		
	}

}
