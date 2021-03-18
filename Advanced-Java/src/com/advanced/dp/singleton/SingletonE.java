package com.advanced.dp.singleton; 

//Early Instantiation

class SingletonE {
//Creates a new object
	private static SingletonE s = new SingletonE ();
	
	private SingletonE(){
	
	}
public static SingletonE getInstance() {
	//Return the object
	return s;
}
}
