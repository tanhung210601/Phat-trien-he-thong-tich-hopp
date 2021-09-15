package tuan2;

import java.util.Scanner;

public class cau4 {

	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhap n:");
		int n=nhap.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Tổng từ 1...n là "+sum);
		

	}

}
