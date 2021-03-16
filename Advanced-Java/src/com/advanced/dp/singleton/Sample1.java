package com.advanced.dp.singleton; 

//Early Instantiation

class Sample1 {

	private static Sample1 s = new Sample1 ();
	
	private Sample1(){
	
	}
public static Sample1 getInstance() {
	return s;
}
}
