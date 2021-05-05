package config;

public class Config_File_Reader {
	
	public String Get_Config_Report_File_Path() {
		
		String path = System.getProperty("user.dir"+"/src/main/java/config/extent-config.xml");
		
		return path;
		
	}

}
