package hw;

import java.util.Scanner;

public class hw03_105021058 {

	/*
	 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
	 * Date: 2016/10/03
	 * Author: 105021058  蕭懋霖
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int sum=1;
		for(int i=a;i>=1;i--){
			sum=sum*i;
		}
		System.out.println(sum);
	}

}
