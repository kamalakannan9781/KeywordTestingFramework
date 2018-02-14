package org.Mytesting;

import java.io.IOException;

import org.junit.Before;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class BeanLogic {
	static BusinessLogic buslogic;
	
	//Click by name logic for bean id is implemented
	public static void ClicknameImplement() throws InterruptedException, IOException
	{
		String xmlfile=PropertiesUtility.getspringxml();		
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(xmlfile));
		buslogic=(BusinessLogic) factory.getBean(PropertiesUtility.getenternameBean());		
	}
	//swith back to parent window logic for bean id is implemented
	public static void swithparentImplement() throws InterruptedException, IOException
	{
		String xmlfile=PropertiesUtility.getspringxml();
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(xmlfile));
		buslogic=(BusinessLogic) factory.getBean(PropertiesUtility.getswithparentBean());		
	}
	//Close the current browser logic for bean id is implemented
	public static void closebrowserImplement() throws InterruptedException, IOException
	{
		String xmlfile=PropertiesUtility.getspringxml();
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(xmlfile));
		buslogic=(BusinessLogic) factory.getBean(PropertiesUtility.getclosebrowserBean());		
	}
	//Close all browsers logic for bean id is implemented
	public static void quitbrowserImplement() throws InterruptedException, IOException
	{
		String xmlfile=PropertiesUtility.getspringxml();
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(xmlfile));
		buslogic=(BusinessLogic) factory.getBean(PropertiesUtility.getquitbrowserBean());		
	}
	//swith to new browser or Tab logic for bean id is implemented
	public static void swithtabImplement() throws InterruptedException, IOException
	{
		String xmlfile=PropertiesUtility.getspringxml();
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(xmlfile));
		buslogic=(BusinessLogic) factory.getBean(PropertiesUtility.getswithtabBean());
		
	}
	//Click by xpath logic for bean id is implemented
	public static void ClickxpathImplement() throws InterruptedException, IOException
	{
		String xmlfile=PropertiesUtility.getspringxml();
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(xmlfile));
		buslogic=(BusinessLogic) factory.getBean(PropertiesUtility.getclickxpathBean());
		
	}
	//Click by class name logic for bean id is implemented
	public static void ClickclassnameImplement() throws InterruptedException, IOException
	{
		String xmlfile=PropertiesUtility.getspringxml();
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(xmlfile));
		buslogic=(BusinessLogic) factory.getBean(PropertiesUtility.getclickclassnameBean());
		
		
	}
	//Launch new browser logic for bean id is implemented
	/*public static void openbrowserImplement() throws IOException
	{
		String xmlfile=PropertiesUtility.getspringxml();
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(xmlfile));
		buslogic=(BusinessLogic) factory.getBean(PropertiesUtility.getopenbrowserBean());	
		//String path=buslogic.showpath();
		//String exepath=buslogic.showexepath();
		buslogic.openbrowser();
	}*/
	//navigate with the set URL logic for bean id is implemented
	public static void navigateImplement(WebDriver driver) throws IOException
	{
		String xmlfile=PropertiesUtility.getspringxml();
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(xmlfile));
		buslogic=(BusinessLogic) factory.getBean(PropertiesUtility.getnavigateBean());	
		String url=buslogic.showurl();
	    buslogic.navigate(url,driver);
	}
	//Verification logic for bean id is implemented
	public static void verifyImplement(WebDriver driver) throws IOException
	{
		String xmlfile=PropertiesUtility.getspringxml();
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(xmlfile));
		buslogic=(BusinessLogic) factory.getBean(PropertiesUtility.getverifyBean());	
		String verifydata=buslogic.showverifydata();
		System.out.println("verifydata value :"+verifydata);
	    buslogic.verifydata(verifydata,driver);
	}
	
	
	
}