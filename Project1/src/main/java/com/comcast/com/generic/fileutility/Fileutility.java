package com.comcast.com.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileutility {
	public String getdatafrompropertyfileString(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./ConfigAppData/common.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String data = pobj.getProperty(key);
		return data;
		
	}

}
