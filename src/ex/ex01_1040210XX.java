﻿package ex;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/12
 * Author: 1040210XX 周永振老師
 */

import java.util.Scanner;

public class ex01_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a, b;
		System.out.print("請輸入 a 與 b 的值: ");
		a = scn.nextInt();
		b = scn.nextInt();
		int i = a, sum = 0;
		while(i <= b){
			sum += i;
			i++;
		}
		System.out.print("從 " + a + " 加到 " + b + " 的總合為 " + sum);
	}

}

