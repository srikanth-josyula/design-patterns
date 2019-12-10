package com.sample.structural.facade.service;

import com.sample.structural.facade.steps.Report;

public class ReportWriter {
	public void writeHtmlReport(Report report) {
		System.out.println("HTML Report written");

		// implementation
	}

	public void writePdfReport(Report report) {
		System.out.println("Pdf Report written");

		// implementation
	}
}
