package javaio;

import java.io.FileInputStream;

public class CheckedException {

	public static void main(String[] args) {
		FileInputStream fis = null;
		 // throw  FileNotFoundException
	
		 fis = new FileInputStream("C:/file.txt");
		int k;
		//throw IOException
		while(( k = fis.read() ) != -1) {
			System.out.print((char)k);
		}
			//throw IOException
			fis.close();
			
		}

	}


