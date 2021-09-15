package tuan2;

import java.util.Scanner;

public class Cau3 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap he số bậc 2,a:");
		float a=nhap.nextFloat();
		System.out.println("Nhập hệ số bậc 1:");
		float b=nhap.nextFloat();
		System.out.println("Nhap hệ số tự do:");
		float c=nhap.nextFloat();
		if(a==0)
		{
			if(b==0)
			{
				System.out.println("Phương trình vô nghiệm");
			}
			else {
				System.out.println("Phương trình có nghiệm là:x= "+(-c)/b);
			}
		}
		float delta=b*b - 4*a*c;
		 if (delta > 0) {
	            
	            System.out.println("Phương trình có 2 nghiệm là: "
	               + "x1 = " + (-b + Math.sqrt(delta)) / (2*a) + " và x2 = " + (-b - Math.sqrt(delta)) / (2*a));
	        } else if (delta == 0) {
	       
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + (-b / (2 * a)));
	        } else {
	            System.out.println("Phương trình vô nghiệm!");
	        }
		
		
		
		

	}

}
