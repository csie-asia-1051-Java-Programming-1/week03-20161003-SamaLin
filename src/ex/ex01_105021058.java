package ex;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105021058 蕭懋霖
 */
import java.util.*;
public class ex01_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String a=scn.nextLine();
		String data[]=a.split("");
		for(int i=data.length-1;i>=0;i--)
		{
			System.out.print(data[i]);
		}
	}

}
