package bai5;

import java.util.Scanner;

public class bai5 
{
	public static void main(String[] args)
	{
		int s=0;
		Scanner vp = new Scanner(System.in);
		do
		{
		System.out.println("nhap vao so nguyen:" );
		int a=vp.nextInt();
		s=s+a;
		System.out.println("tong la: "+s );
		}
		while(s < 100);
	}
}
