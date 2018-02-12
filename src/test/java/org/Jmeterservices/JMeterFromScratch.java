/*package org.Jmeterservices;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.jmeter.config.gui.ArgumentsPanel;
import org.apache.jmeter.control.LoopController;
import org.apache.jmeter.control.gui.LoopControlPanel;
import org.apache.jmeter.control.gui.TestPlanGui;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.protocol.http.control.gui.HttpTestSampleGui;
import org.apache.jmeter.protocol.http.sampler.HTTPSampler;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.TestPlan;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
import org.testng.annotations.Test;
import org.apache.jmeter.threads.SetupThreadGroup;
import org.apache.jmeter.threads.ThreadGroup;
import org.apache.jmeter.threads.gui.ThreadGroupGui;

public class JMeterFromScratch {
	@Test
	public void myTest() throws IOException
	{
		StandardJMeterEngine jm = new StandardJMeterEngine();
        // jmeter.properties
        JMeterUtils.loadJMeterProperties("C:\\apache-jmeter-3.3\\bin\\jmeter.properties");

        HashTree hashTree = new HashTree();     

        // HTTP Sampler
        HTTPSampler httpSampler = new HTTPSampler();
        httpSampler.setDomain("www.google.com");
        httpSampler.setPort(80);
        httpSampler.setPath("/");
        httpSampler.setMethod("GET");

        // Loop Controller
        TestElement loopCtrl = new LoopController();
        ((LoopController)loopCtrl).setLoops(1);
        ((LoopController)loopCtrl).addTestElement(httpSampler);
        ((LoopController)loopCtrl).setFirst(true);

        // Thread Group
        SetupThreadGroup threadGroup = new SetupThreadGroup();
        threadGroup.setNumThreads(1);
        threadGroup.setRampUp(1);
        threadGroup.setSamplerController((LoopController)loopCtrl);

        // Test plan
        TestPlan testPlan = new TestPlan("C:\\maven\\apache-maven-3.3.9\\bin\\src\\test\\jmeter\\Test Plan.jmx");
        
       

        hashTree.add("testPlan", testPlan);
        hashTree.add("loopCtrl", loopCtrl);
        hashTree.add("threadGroup", threadGroup);
        hashTree.add("httpSampler", httpSampler);       

        jm.configure(hashTree);
        String logFile = "C:\\example.jtl";

        jm.run();
        System.out.println("sucess");
	}
}


*/