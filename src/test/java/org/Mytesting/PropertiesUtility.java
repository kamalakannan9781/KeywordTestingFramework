package org.Mytesting;


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
	public static String getUsername() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String username=properties.getProperty("data.username");
		System.out.println("The username value is :"+username);
		return username;
		
	}
	public static String getAccesskey() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String accesskey=properties.getProperty("data.accesskey");
		System.out.println("The accesskey value is :"+accesskey);
		return accesskey;
		
	}
	public static String getspringxml() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String xmlfile=properties.getProperty("data.springxml").trim();
		System.out.println("The path value is :"+xmlfile);
		return xmlfile;
		
	}
	public static String getspringwebservicesxml() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String webservicesxmlfile=properties.getProperty("data.springwebservicesxml").trim();
		System.out.println("The path value is :"+webservicesxmlfile);
		return webservicesxmlfile;
		
	}
	public static String getenternameBean() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String entername=properties.getProperty("data.entername").trim();
		System.out.println("The data.entername value is :"+entername);
		return entername;
		
	}
	public static String getpostrequestBean() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String postrequest=properties.getProperty("data.postrequest").trim();
		System.out.println("The data.postrequest value is :"+postrequest);
		return postrequest;
		
	}
	public static String getswithparentBean() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String swithparent=properties.getProperty("data.swithparent").trim();
		System.out.println("The data.swithparent value is :"+swithparent);
		return swithparent;
		
	}
	public static String getclosebrowserBean() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String closebrowser=properties.getProperty("data.closebrowser").trim();
		System.out.println("The data.closebrowser value is :"+closebrowser);
		return closebrowser;
		
	}
	public static String getquitbrowserBean() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String quitbrowser=properties.getProperty("data.quitbrowser").trim();
		System.out.println("The data.quitbrowser value is :"+quitbrowser);
		return quitbrowser;
		
	}
	public static String getswithtabBean() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String swithtab=properties.getProperty("data.swithtab").trim();
		System.out.println("The data.swithtab value is :"+swithtab);
		return swithtab;
		
	}
	public static String getclickxpathBean() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String clickxpath=properties.getProperty("data.clickxpath").trim();
		System.out.println("The data.clickxpath value is :"+clickxpath);
		return clickxpath;
		
	}
	public static String getclickclassnameBean() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String clickclassname=properties.getProperty("data.clickclassname").trim();
		System.out.println("The data.clickclassname value is :"+clickclassname);
		return clickclassname;
		
	}
	public static String getopenbrowserBean() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String openbrowser=properties.getProperty("data.openbrowser").trim();
		System.out.println("The data.openbrowser value is :"+openbrowser);
		return openbrowser;
		
	}
	public static String getnavigateBean() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String navigate=properties.getProperty("data.navigate").trim();
		System.out.println("The data.navigate value is :"+navigate);
		return navigate;
		
	}
	public static String getverifyBean() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String verify=properties.getProperty("data.verify").trim();
		System.out.println("The data.verify value is :"+verify);
		return verify;
		
	}
	public static int setSheetProperties() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String sheet=properties.getProperty("data.sheetSetExcel").trim();
		int result = Integer.parseInt(sheet);		
		return result;
		
	}
	public static int setSheetRowCountProperties() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String sheet=properties.getProperty("data.sheetRowCount").trim();
		int result = Integer.parseInt(sheet);		
		return result;
		
		
	}
	
	public static int setSheetKeywordProperties() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String sheet=properties.getProperty("data.sheetKeyword").trim();
		int result = Integer.parseInt(sheet);		
		return result;
		
	}
	public static int setSheetDataProperties() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String sheet=properties.getProperty("data.sheetdata").trim();
		int result = Integer.parseInt(sheet);		
		return result;
		
	}
}
