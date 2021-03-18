package com.advanced.dp.singleton;

//Lazy Instantiation

class SingletonL {

	private static SingletonL s = null;
	
	private SingletonL(){
	
	}
public static SingletonL getInstance() {
	//Create an object if it is not created
	if(s==null) {
		s = new SingletonL(); 
	}
	//Return the object
	return s;
}
}
