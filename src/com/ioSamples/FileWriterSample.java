package com.ioSamples;

import java.io.FileWriter;

public class FileWriterSample {

	public static void main(String[] args) {
		String data="This is the data in the output file";
		String name="Hi how are you";
		try {
			FileWriter output=new FileWriter("output.txt");
			output.write(data);
			output.write(name);
			output.flush();
			output.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}
