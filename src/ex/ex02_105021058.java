package ex;

import java.util.Scanner;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021058 蕭懋霖
 */

public class ex02_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String a=scn.next();
		char b=a.charAt(0);
		int v1=b-'a';
		int v2=b-'A';
		if(v1>=0&&v1<26){
			System.out.println("小寫");
		}else if(v2>=0&&v2<26){
			System.out.println("大寫");
		}else{
			System.out.println("其他字元");
		}
	}

}
