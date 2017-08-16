package sw;

import java.util.Scanner;

public class sw1 {
	public static void main(String args[])
	{
		//THIS PROJECT CONTAINS BASIC ATM MACHINE WORKINGS 
		int b;
		for(b=100;b<=100;b++);
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("ICICI bank atm:\n\n1cash withdrawl\n2cash deposit\n3balance enquiry\n4Exit");
		a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("withdrawing cash...\n");
			switch(1)
			{
			case 1:
				System.out.println("collect your cash");
				break;
			}
		   break;
		case 2:
			System.out.println("put your cash in cdm machine/n");
			System.out.println("collect your recipt");
			break;
		case 3:
			System.out.println("Your remaining a/c balance is\n"+b);
			break;
		case 4:
			System.out.println("thanks for visiting");
			break;
		}
	}

}
