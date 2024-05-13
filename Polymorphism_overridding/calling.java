package Polymorphism_overridding;

import java.util.Scanner;

public class calling extends Hill_Station
{

	public static void main(String[] args) 
	{
		
		int choice;
		char ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to hill stations");
		do
		{
		System.out.println("choose your location for your trip");
		System.out.println("1: Manali himachal pradesh"+"\n2: Mussoorie uttarkhand"+"\n3: Gulmarg J&k ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Manali obj=new Manali();
			int choice1;
			System.out.println("what you want to see"+"\n1:Famous location"+"\n2:Famous For");
			choice1=sc.nextInt();
			switch(choice1)
			{
			case 1:
				obj.location();
				break;
			case 2:
				obj.Famousfor();
				break;	
			default:
				System.out.println("Invalid Input");
				break;
			}
			break;
		case 2:
			Mussoorie obj2=new Mussoorie();
			int choice11;
			System.out.println("what you want to see"+"\n1:Famous location"+"\n2:Famous For");
			choice11=sc.nextInt();
			switch(choice11)
			{
			case 1:
				obj2.location();
				break;
			case 2:
				obj2.Famousfor();
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			break;
		case 3:
			Gulmarg obj3=new Gulmarg();
			int choice111;
			System.out.println("what you want to see"+"\n1:Famous location"+"\n2:Famous For");
			choice111=sc.nextInt();
			switch(choice111)
			{
			case 1:
				obj3.location();
				break;
			case 2:
				obj3.Famousfor();
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		System.out.println("do you want to see any other place?");
		ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
	}

}
