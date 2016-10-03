package ex;

import java.util.Scanner;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021058 蕭懋霖
 */

public class ex03_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String a=scn.next();
		char b=a.charAt(0);
		int v1=b;
		if(v1>=97&&v1<=122){
			System.out.println((char)(v1-32));
		}else if(v1>=65&&v1<=90){
			System.out.println((char)(v1+32));
		}else{
			System.out.println("其他字元");
		}
	}

}
