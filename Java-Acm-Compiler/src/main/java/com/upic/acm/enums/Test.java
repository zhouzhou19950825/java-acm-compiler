package com.upic.acm.enums;

import com.upic.acm.dealCode.support.DealCodeCenter;
import com.upic.acm.result.DealResult;

public class Test {

	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		Scanner s1=new Scanner(returnTest());
//		System.out.println("111");
		
		StringBuilder sb = new StringBuilder();
//		sb.append("package Dongshuai;").append("\n");
		sb.append("import java.util.Scanner;");
		sb.append("public class Main{").append("\n");
		sb.append("    public static void main(String[]args){").append("\n");
		sb.append("Scanner s=new Scanner(System.in);");
		sb.append("int a[]=new int[6];");
		sb.append("for(int i=0;i<6;i++){a[i]=s.nextInt()+1;}").append("\n");
		sb.append("for(int j=0;j<6;j++){System.out.println(a[j]);}").append("\n");
		sb.append("    }").append("\n");
		sb.append("}").append("\n");
		DealCodeCenter d=new DealCodeCenter(false, null);
		DealResult deal = d.deal(sb.toString());
	}
	public static String returnTest(){
		return "1";
	}
}
