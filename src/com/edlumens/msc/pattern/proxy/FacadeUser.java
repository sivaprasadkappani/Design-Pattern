package com.edlumens.msc.pattern.proxy;

import com.edllumens.msc.pattern.facade.ReportGeneratorFacade;
import com.edllumens.msc.pattern.facade.ReportType;

public class FacadeUser {
	public static void main(String[] args) throws Exception
	  {
	    ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
	     
	    reportGeneratorFacade.generateReport(ReportType.HTML, null, null);
	     
	    reportGeneratorFacade.generateReport(ReportType.PDF, null, null);
	  }
}
