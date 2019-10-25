package com.wkm;

import java.util.LinkedList;

public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution7().reverse(1234));
	}

	int reverse(int x) {
		LinkedList<Integer> l = new LinkedList<>();
		int res = 0;
		int sign = 1;
		if (x <= Math.pow(-2, 31) || x >= (Math.pow(2, 31) - 1)) {
			return 0;
		} else {
			if (x >= 0) {
				l.push(1);
			} else {
				l.push(-1);
			}
			for (;;) {
				if (x % 10 != 0) {
					l.push(x % 10);
					x = x / 10;
				} else if (x % 10 == 0 && x / 10 != 0) {
					continue;
				} else {
					break;
				}
			}
		}
		for (int i = 0; i < l.size(); i++) {
			System.out.println("p:"+l.pop());
			/*if (i == 0)
				sign = l.pop();
			else
				res += l.pop() * Math.pow(10, i);*/
		}
		return res * sign;
	}

}
