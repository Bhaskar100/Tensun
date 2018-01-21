package com.bhaskar;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation2 {

	public  static void storeData(String str) {

		
		
		try {
			
			File file = new File("F:\\ghi.txt");

			FileOutputStream fos = new FileOutputStream(file);

			

			DataOutputStream  dos = new DataOutputStream(fos);
			
			dos.writeChars(str);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

	public static void printFirstCharacter(String str) throws Exception {
		File file = new File("F:\\ghi.txt");

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String ss = br.readLine().intern();

		char ch[] = ss.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != ' ') {
				if (i == 0) {
					System.out.println(ch[i]);
				} else if (ch[i - 1] == ' ') {
					System.out.println(ch[i]);
				}

			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		try {
			
			
			storeData(str);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			printFirstCharacter(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
