package com.hand;
import java.util.ArrayList;
import java.util.List;

public class Exam1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		int num = 0;
		for (int i = 101; i <= 200; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					num++;
				}
			}
			if (num == 2) {
				list.add(i);
			}
			num = 0;
		}
		System.out.print("101-200���ܹ���" + list.size() + "���������ֱ���");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "��");
		}
	}
}
