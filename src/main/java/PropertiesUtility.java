import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	
	public static String getPathProperties() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String path=properties.getProperty("data.path");
		System.out.println("The path value is :"+path);
		return path;
		
	}

	public static int setSheetProperties() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String sheet=properties.getProperty("data.sheetSetExcel");
		int result = Integer.parseInt(sheet);		
		return result;
		
	}
	public static int setSheetRowCountProperties() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String sheet=properties.getProperty("data.sheetRowCount");
		int result = Integer.parseInt(sheet);		
		return result;
		
		
	}
	
	public static int setSheetKeywordProperties() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String sheet=properties.getProperty("data.sheetKeyword");
		int result = Integer.parseInt(sheet);		
		return result;
		
	}
	public static int setSheetDataProperties() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String sheet=properties.getProperty("data.sheetdata");
		int result = Integer.parseInt(sheet);		
		return result;
		
	}
}
