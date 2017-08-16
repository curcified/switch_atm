package sw;

import java.util.Scanner;

public class sw {

	public static void main(String[] args) {
		//THIS PROJECT CONTAINS GRADES ACCORDING TO MARKS
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		switch(a)
		{
		case 40:
			System.out.println("Fail(very bad)");
			break;
		case 90:
			System.out.println("Excellent");
			break;
		case 60:
			System.out.println("Avarage");
			break;
		case 50:
			System.out.println("Not great");
			break;	
		}
	}

}
