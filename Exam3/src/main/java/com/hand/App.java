package com.hand;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("璇疯緭鍏ユ棩鏈燂細");
			String a = scanner.nextLine();
			String[] date = a.split("-");
			int year = Integer.parseInt(date[0]);
			int month = Integer.parseInt(date[1]);
			int day = Integer.parseInt(date[2]);
			int sum = 0;
			switch (month) {
			case 1:
				sum += day;
				break;
			case 2:
				sum = 31 + day;
				break;
			case 3:
				sum = 31 + 29 + day;
				break;
			case 4:
				sum = 31 + 29 + 31 + day;
				break;
			case 5:
				sum = 31 + 29 + 31 + 30 + day;
				break;
			case 6:
				sum = 31 + 29 + 31 + 30 + 31 + day;
				break;
			case 7:
				sum = 31 + 29 + 31 + 30 + 31 + 30 + day;
				break;
			case 8:
				sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
				break;
			case 9:
				sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
				break;
			case 10:
				sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
				break;
			case 11:
				sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
				break;
			case 12:
				sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
				break;
			}
			System.out.println("浣犺緭鍏ョ殑鏃ユ湡涓哄綋骞寸殑绗�" + sum + "澶�");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
