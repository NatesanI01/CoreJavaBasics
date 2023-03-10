package com.ioSamples;

import java.io.File;

public class FileCreateSample {

	public static void main(String[] args) {
	//	File dir=new File("newFileDirectory");
		File dir=new File("E:\\workspace\\SDETTrainingWS");
		File files[]=dir.listFiles();
		for(int i=0; i<files.length; i++)
		{
			System.out.println(files[i].isDirectory());
		}
		boolean value=false;
		try {
			boolean isDir=dir.mkdir();
			System.out.println(dir.getAbsolutePath());
			System.out.println(dir.getPath());
			System.out.println(dir.exists());
			if(isDir) {
				File file=new File(dir.getAbsolutePath()+"\\newFile.txt");
				value=file.createNewFile();
			}
		if(value) {
			System.out.println("The new file is created");
		}
	}
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}
