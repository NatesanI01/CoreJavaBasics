package com.ioSamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamSample {

	public static void main(String[] args) {
		String data="Welcome to SDET Traing";
		try {
			FileOutputStream file=new FileOutputStream ("output1.txt");
			byte[] arr=data.getBytes();
			file.write(arr);
			file.close();
		}catch(IOException e)
		{
			e.getStackTrace();
		}

	}

}
