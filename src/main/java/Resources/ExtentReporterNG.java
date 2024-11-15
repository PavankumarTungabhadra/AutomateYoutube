package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG  {
	
	
	public  static ExtentReports getReportObject() {
		String ReportPath = System.getProperty("user.dir")+"//Reports//index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(ReportPath);
		reporter.config().setReportName("AutomationExecution");
		reporter.config().setDocumentTitle("ExecutionDetails");
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Pavankumar Tungabhadra");
		
		return extent;
	}
	
	

}
