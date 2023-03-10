package com.ioSamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileSample {

	public static void main(String[] args) throws IOException {
		Properties connProp=new Properties();
		connProp.setProperty("username", "trg08");
		connProp.setProperty("password", "trg08");
		FileOutputStream propsFile=new FileOutputStream("Information.properties");
		connProp.store(propsFile, "Properties File");
		propsFile.close();
		String uname=null;
		String password=null;
		Properties temProp=new Properties();
		FileInputStream obtained=new FileInputStream("Information.properties");
		temProp.load(obtained);
		obtained.close();
		uname=temProp.getProperty("username");
		password=temProp.getProperty("password");
		System.out.println(uname+" "+password);
	}

}
