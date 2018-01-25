import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	public static void setexcel(String path,int sheetnum)
	{
		
		
		try {
			File src = new File(path);
			FileInputStream	fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheetAt(sheetnum);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	public static String getdata(int rownum,int cellnum)
	{
		String data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}
	public static int getrowCount(String path,int sheetnum) throws IOException
	{	
			int value;
			File src = new File(path);
			FileInputStream	fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheetAt(sheetnum);
			return value =sheet.getPhysicalNumberOfRows();	
		
	}
	public static String getPathProperties() throws IOException
	{
		FileReader reader= new FileReader("src\\main\\java\\data.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String path=properties.getProperty("data.path");
		System.out.println("The path value is :"+path);
		return path;
		
	}
	
}