package hw;

import java.util.Scanner;

public class hw01_105021058 {

	/*
	 * Topic: 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
	 * Date: 2016/10/03
	 * Author: 105021058  蕭懋霖
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		String b=Integer.toString(a);
		System.out.println(b.length());
	}

}
