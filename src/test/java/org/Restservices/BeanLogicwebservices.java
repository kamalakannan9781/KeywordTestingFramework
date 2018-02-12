package org.Restservices;

import java.io.IOException;

import org.Mytesting.BusinessLogic;
import org.Mytesting.PropertiesUtility;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class BeanLogicwebservices {
static BusinessLogicwebservices buslogic;
	
	
	public static void postrequestimplement() throws InterruptedException, IOException
	{
		String xmlfile=PropertiesUtility.getspringwebservicesxml();	
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(xmlfile));
		buslogic=(BusinessLogicwebservices) factory.getBean(PropertiesUtility.getpostrequestBean());		
	}

}
