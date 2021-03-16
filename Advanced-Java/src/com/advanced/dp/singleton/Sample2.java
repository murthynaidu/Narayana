package com.advanced.dp.singleton;

//Lazy Instantiation

class Sample2 {

	private static Sample2 s = null;
	
	private Sample2(){
	
	}
public static Sample2 getInstance() {
	if(s==null) {
		s = new Sample2(); 
	}
	return s;
}
}
