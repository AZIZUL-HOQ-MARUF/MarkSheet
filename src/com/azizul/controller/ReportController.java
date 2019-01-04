package com.azizul.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.azizul.model.Model;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

@Controller
@RequestMapping("/report")
public class ReportController {

	@Autowired
	ServletContext context;

	@Autowired
	SessionFactory sessionFactory;

	@RequestMapping(value = "/studentReport/{id}", method = RequestMethod.GET)
	@ResponseBody
	public void getRpt1(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("College") Model clg, @PathVariable("id") Integer id) throws JRException, IOException {

		/*int pValue=clg.getReportId();*/
		int pValue=id;
		Connection c = null;
		try {
			c = sessionFactory.getSessionFactoryOptions().getServiceRegistry().getService(ConnectionProvider.class)
					.getConnection();
			System.out.println("pp: " + c.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String rp = context.getRealPath("/WEB-INF/reports");
		/*System.out.println("rp: " + rp);*/
		try {

		File file = new File(rp + "\\College_2.jrxml");
		/*
		 * InputStream jasperStream =
		 * this.getClass().getResourceAsStream("/reports/report_spring_user.jasper");
		 * System.out.println("jj: " + jasperStream);
		 */
		
		
		 /* this two lines of code will be executed while generating the report from ".jrxml"*/
		InputStream input = new FileInputStream(file);
	      //Generating the report
	      JasperReport jasperReport = JasperCompileManager.compileReport(input);
		
		
		
		Map<String, Object> params = new HashMap<>();
		params.put("ID", pValue);/*
		JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);*/
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, c); // new JREmptyDataSource()

		/*response.setHeader("Expires", "0");
		response.setHeader("Cache-Control","must-revalidate, post-check=0, pre-check=0");
		response.setHeader("Pragma", "public");*/
		response.setContentType("application/x-pdf");
	    response.setHeader("Content-disposition", "inline; filename=Markshit_Of_" +pValue+"_"+ new java.util.Date() + ".pdf");

		final OutputStream outStream = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(jasperPrint, outStream);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
