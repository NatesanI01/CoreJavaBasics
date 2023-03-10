package com.ioSamples;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamSample {

	public static void main(String[] args) {
		try {
			FileInputStream file=new FileInputStream("input.txt");
			int i=file.read();
			while(i!=-1)
			{
				System.out.print((char)i);
				i=file.read();
			}
			file.close();
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}

	}

}
