package com.sample.structural.facade;

import com.sample.structural.facade.steps.ReportType;

public class Client {
	public static void main(String[] args) throws Exception {
		
		ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();

		reportGeneratorFacade.generateReport(ReportType.HTML);
		reportGeneratorFacade.generateReport(ReportType.PDF);
	}
}
