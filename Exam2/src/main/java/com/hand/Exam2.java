package com.hand;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int salary = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入工资：");
		try {
			salary = scanner.nextInt();
			if (salary > 0) {
				if ((salary - 3500) > 1500 && (salary - 3500) < 4500) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500) * 0.1);
				} else if ((salary - 3500) <= 0) {
					System.out.println("您不需要缴纳税费");
				} else if ((salary - 3500) < 1500 && (salary - 3500) > 0) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500) * 0.03);
				} else if ((salary - 3500) > 4500 && (salary - 3500) < 9500) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500) * 0.2);
				} else if ((salary - 3500) > 9000 && (salary - 3500) < 35000) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500) * 0.25);
				} else if ((salary - 3500) > 35000 && (salary - 3500) < 55000) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500) * 0.3);
				} else if ((salary - 3500) > 55000 && (salary - 3500) < 80000) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500) * 0.35);
				} else if ((salary - 3500) > 80000) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500) * 0.45);
				} else {
					System.out.println("您输入有误，请重新输入！");
				}
			} else {
				System.out.println("您输入有误，请重新输入！");
			}
		} catch (Exception e) {
			System.out.println("您输入有误，请重新输入！");
			e.printStackTrace();
		}

	}

}
