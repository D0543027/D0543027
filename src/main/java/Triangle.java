package com.example;

public class Triangle {
	public String checkTriangle(double a, double b, double c){

		if (a <= 0 || b <= 0 || c <= 0) {
			return "不是三角形";
		}
		// 任兩邊和須大於第三邊
		// assert ((a + b > c) && (b + c > a) && (a + c > b));
		if ((a + b <= c) || (b + c <= a) || (a + c <= b)) {
			return "不是三角形";
		}

		if ((a == b) && (b == c)) {
			return "正三角形";
		} else if ((a == b) || (b == c) || (a == c)) {
			if (isNinetyDegree(a, b, c) || isNinetyDegree(b, c, a) || isNinetyDegree(a, c, b)) {
				return "等腰直角三角形";
			} else {
				return "等腰三角形";
			}
		} else if (isNinetyDegree(a, b, c) || isNinetyDegree(b, c, a) || isNinetyDegree(a, c, b)) {
			return "直角三角形";
		} else {
			return "一般三角形";
		}
	}

	/**
	 * 檢查直角. 誤差設0.01.
	 */

	public static boolean isNinetyDegree(double a, double b, double c) {
		if (Math.abs(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) < 0.01) {
			return true;
		}
		return false;
	}
}
