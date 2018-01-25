import java.io.IOException;

import org.junit.Test;

public class ExecutionTest {
	
	@Test
	public void Testingapp() throws InterruptedException, IOException
	{
		String path=PropertiesUtility.getPathProperties();
		int sheetnumber=PropertiesUtility.setSheetProperties();		
		int sheetrowcount=PropertiesUtility.setSheetRowCountProperties();		
		int sheetkeyword=PropertiesUtility.setSheetKeywordProperties();		
		int sheetdata=PropertiesUtility.setSheetDataProperties();		
		ExcelUtility.setexcel(path,sheetnumber);
		int value=ExcelUtility.getrowCount(path, sheetrowcount);
		int rowcount=value-1;		
		for(int i=0;i<=rowcount;i++)
		{
			String keyword=ExcelUtility.getdata(i,sheetkeyword);			
			String data=ExcelUtility.getdata(i,sheetdata);
			if(keyword.equals("openbrowser"))
			{
				ActionsKeywords.openbrowser();
			}
			else if(keyword.equals("navigate"))
			{
				ActionsKeywords.navigate(data);
			}
			else if(keyword.equals("enterproduct"))
			{
				ActionsKeywords.click_df(data);
				
			}
			else if(keyword.equals("click_search"))
			{
				ActionsKeywords.click_search();
				
			}
			else if(keyword.equals("click_product"))
			{
				ActionsKeywords.select_product1();
				
			}
			
			else if(keyword.equals("Swith tab"))
			{
				ActionsKeywords.swith_tab();
				
			}
			else if(keyword.equals("Add cart"))
			{
				ActionsKeywords.clickAddTocart();
				
			}
			else if(keyword.equals("close browser"))
			{
				ActionsKeywords.closeBrowser();
				
			}
			else if(keyword.equals("swith parent"))
			{
				ActionsKeywords.swithParent();
				Thread.sleep(2000);
				
			}			
			else if(keyword.equals("click_product2"))
			{
				ActionsKeywords.select_product3();
				
			}
			else if(keyword.equals("Swith tab"))
			{
				ActionsKeywords.swith_tab();
				
			}
			else if(keyword.equals("Add cart"))
			{
				ActionsKeywords.clickAddTocart();
				
				
			}			
			else if(keyword.equals("validate"))
			{
				ActionsKeywords.validate();
				
				
			}
			
		}
	}
}
	
	

