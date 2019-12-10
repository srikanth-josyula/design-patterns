package com.sample.structural.facade;

/**
 * Using ReportGeneratorFacade, we will hide all these steps and and expose easy to use methods. 
 **/

import com.sample.structural.facade.service.ReportWriter;
import com.sample.structural.facade.steps.Report;
import com.sample.structural.facade.steps.ReportData;
import com.sample.structural.facade.steps.ReportFooter;
import com.sample.structural.facade.steps.ReportHeader;
import com.sample.structural.facade.steps.ReportType;

public class ReportGeneratorFacade {
	public static void generateReport(ReportType type) {
		if (type == null) {
			// throw some exception
		}
		// Create report
		Report report = new Report();

		report.setHeader(new ReportHeader());
		report.setFooter(new ReportFooter());

		// Get data from dataSource and set to ReportData object

		report.setData(new ReportData());

		// Write report
		ReportWriter writer = new ReportWriter();
		switch (type) {
		case HTML:
			writer.writeHtmlReport(report);
			break;

		case PDF:
			writer.writePdfReport(report);
			break;
		}
	}
}
