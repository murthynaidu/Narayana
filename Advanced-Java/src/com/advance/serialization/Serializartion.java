package com.advance.serialization;

import java.io.*;
//to import FileOutputStream and ObjectOutputStream

class Serialization implements Serializable  {
//to make serialization class as Serializable
//to overcome NotSerializableEception
	
	String a = "Anji";
	String b = "Narayana";
	String c = "Aarya";
	
}
class SerializeDemo{
	
	public static void main(String[] args) throws Exception {
	//to overcome fileNotFoundException and IoException
		
		Serialization s = new Serialization();
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("Test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		//deserialization
		FileInputStream fis = new FileInputStream("Test.txt");
		ObjectInputStream in = new ObjectInputStream(fis);
		Serialization d2 = (Serialization)in.readObject();
				
				System.out.println("a = "+d2.a);
				System.out.println("b = "+d2.b);
				System.out.println("c = "+d2.c);
	
	}

}
