package com.servlet.utils;

public class MathUtils {
	
	public static int add (int firstParam, int secondParam) {
		return firstParam + secondParam;
	}
	
	public static int mult (int firstParam, int secondParam) {
		return firstParam * secondParam;
	}
	
	public static int sub (int firstParam, int secondParam) {
		return firstParam - secondParam;
	}
	
	public static int div (int firstParam, int secondParam) {
		if (firstParam == 0 ||secondParam == 0) return 0;
		return firstParam / secondParam;
	}

}
