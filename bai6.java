package bai6;

import java.util.Scanner;

public class bai6 
{
	public static void main(String[] args)
	{
	int gt=1;
	Scanner vp = new Scanner(System.in);
	System.out.println("nhap so nguyen duong: ");
	int a=vp.nextInt();
	for(int i=1;i<=a;i++)
	{
		gt=gt*i;
	}
	System.out.println("giai thua bang: "+gt);
	}
	}
