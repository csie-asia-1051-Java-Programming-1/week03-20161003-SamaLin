package hw;

import java.util.Scanner;

public class hw02_105021058 {

	/*
	 * Topic: 讓使用者輸入多個數，統計正數、負數及零各有多少個。
	 * Date: 2016/10/03
	 * Author: 105021058  蕭懋霖
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int ip=0;
		int a=0;
		int b=0;
		int c=0;
//		String v1="y";
		while(true){
			ip=scn.nextInt();
			if(ip<0){
				a=a+1;
			}else if(ip==0){
				b=b+1;
			}else if(ip>0){
				c=c+1;
			}
			System.out.println("是繼續輸入");
			String v1=scn.next();
			if(v1.equals("n")){break;}
			
		}
		System.out.println("-:"+a);
		System.out.println("0:"+b);
		System.out.println("+:"+c);
	}

}
