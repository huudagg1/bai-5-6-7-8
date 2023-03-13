package bai8;

import java.util.Scanner;

public class bai8 
{
	public static void main(String[] args)
	{
		int n,k;
		int s=0;
		float tb;
		Scanner vp = new Scanner(System.in);
		System.out.println("nhap so phan tu: ");
		n=vp.nextInt();
		for (int i = 1; i<=n; i++)
		{
            System.out.println("Nhap so thu3 " + i + ": ");
            k= vp.nextInt();
            s += k;
        } 
        tb=s / n;
        System.out.println("Trung binh cong = " +tb);
    }
}
