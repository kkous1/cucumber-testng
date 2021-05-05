package base;

import java.util.Properties;

public class File_Reader {

	Properties properties = new Properties();
	String config_path = System.getProperty("user.dir") + "src/main/resources/config/config.properties";

	public String Get_Report_File_Path() {
		String Report_Path = properties.getProperty("Report_path");
		String Full_Path = System.getProperty("user.dir" + Report_Path);
		return Full_Path;
	}

}
