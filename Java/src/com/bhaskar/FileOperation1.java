package com.bhaskar;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation1 {
	
	public static void WriteOperation() throws IOException {
		
		
		try {
			FileOutputStream fis  = new FileOutputStream("F:\\abc.txt");
			//BufferedOutputStream bis = new BufferedOutputStream(fis);
			DataOutputStream dis = new DataOutputStream(fis);
			
			dis.writeChars("Hi how r u ");
			
			
			System.out.println("Data will be stored");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void readOperation() throws Exception{
		
		FileInputStream fis  = new FileInputStream("F:\\abc.txt");
		BufferedInputStream  bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String output=" ";
		
		
		
		while((output=dis.readLine())!=null){
			
			System.out.println(output.trim());
			
			char ch[] = output.toCharArray();
			
			for (int i=0;i<ch.length-1;i++) {
				
				if(ch[i]=='h'){
					
					ch[i]='b';
					
					System.out.println(ch[i]);
				}
				
			}
						
		}
	}
	
		
	public static void main(String[] args) {
		
		try {
			readOperation();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
