package ex;

import java.util.Scanner;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021058 蕭懋霖
 */

public class ex05_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		if(a%2==1){
			System.out.println("基數");
		}else{
			System.out.println("偶數");
		}
	}

}
