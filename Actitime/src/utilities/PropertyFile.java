package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile
{
	static String propertyfile_path="../Actitime/Actitime.properties";
	public static String getPropertyValue(String keyname)
	{
		Properties p=new Properties();
		try
		{
			p.load(new FileInputStream(propertyfile_path));
		} 
		catch (IOException e)
		{
		}
		return p.getProperty(keyname);
	}

}
