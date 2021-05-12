package com.employeewage;

public class Employy {
public static void main(String[] args) 
{
	System.out.println("Wellcom to the Employee Wage Builder");

	int x = 1;
	double empCheck = Math.floor(Math.random() * 10) % 2;
	if ( empCheck == x )
	{
		System.out.println("Employee is Present");
	}
	else 
		{
		System.out.println("Employee is Absent");
		}
	
}

}
