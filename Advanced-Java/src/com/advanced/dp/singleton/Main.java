package com.advanced.dp.singleton;

public class Main {

	public static void main(String[] args) {
		
		Sample1 test1 = Sample1.getInstance();
		Sample1 test2 = Sample1.getInstance();
		Sample1 test3 = Sample1.getInstance();
		Sample2 test4 = Sample2.getInstance();
		Sample2 test5 = Sample2.getInstance();
		Sample2 test6 = Sample2.getInstance();

	}

}
