package tuan2;

import java.util.Scanner;

public class cau2 {

	public static void main(String[] args) {
		
		Scanner nhap =new Scanner(System.in);
		System.out.println("Nhap số cân kiểm tra:");
		int a=nhap.nextInt();
		int count=0;
		for(int i=1;i<a;i++)
		{	
			
			if(a%i==0)
			{
				count++;
			}
		}
		if(count<2)
		System.out.println(a+ " Là số nguyên tố");
		else
			System.out.println(a+" Không phải số nguyên tố");
		

	}

}
