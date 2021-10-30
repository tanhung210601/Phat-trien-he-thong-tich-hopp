package tuan2;

import java.util.Scanner;

public class cau5 {

	public static void main(String[] args) {
		Scanner nhap =new Scanner(System.in);
		float sum=0;
		System.out.println("Nhap số phần tử");
		int n=nhap.nextInt();
		float a[]=new float[100];
		System.out.println("Nhap các phần tử cho mảng");
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap a["+i+"]");
			a[i]=nhap.nextFloat();
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>=0)
			{
				sum+=a[i];
			}
		}
		System.out.println("Tổng các số dương: " +sum);
		

	}

}
