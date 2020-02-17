package com.epamtask_week4.Interest;
import java.util.Scanner;
class Interest extends Find_Interest
{
	
	public void find()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type of interest:\n1.SIMPLE INTEREST\n2.COMPOUND INTEREST");
		int ch=sc.nextInt();
		System.out.println("Enter the principal amount");
		float principal_amount=sc.nextFloat();
		System.out.println("Enter number of years");
		int years=sc.nextInt();
		System.out.println("Enter rate of interest");
		float rate_of_interest=sc.nextFloat();
		if(ch==1)
			System.out.println("Simple interest is "+simple_interest(principal_amount,years,rate_of_interest));
		else if(ch==2)
		{
			System.out.println("Enter number of times to be calculated");
			int num_times=sc.nextInt();
			System.out.println("Compound interest is "+compound_interest(principal_amount,num_times,years,rate_of_interest));
		}
		else
		{
			System.out.println("Enter valid type of interest number");
		}
		sc.close();
	}
	public static void main(String args[])
	{
		Interest obj=new Interest();
		obj.find();
	}
}