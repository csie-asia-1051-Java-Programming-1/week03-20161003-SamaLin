package ex;

import java.util.Scanner;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 105021058 蕭懋霖
 */

public class ex04_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int sum=0;
		String b=Integer.toString(a);
		for(int i=0;i<=b.length()-1;i++)
		{
			sum=sum+((int)b.charAt(i)-48);
		}
		System.out.println(sum);
	}

}
