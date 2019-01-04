package com.azizul.controller;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.azizul.model.Model;
import com.azizul.service.Service;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
	
	static int edit=0;
	@Autowired
	Service service;

	@RequestMapping({ "/", "index" })
	public String index() {
		return "/index";
	}

	// List mapping
	@RequestMapping({ "/list" })
	public ModelAndView list() {
		List<Model> lst = service.getList();
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("list", lst);
		m.put("College", new Model());

		return new ModelAndView("/ListOfStudent", m);

	}

	// add mapping
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add() {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("College", new Model());
		return new ModelAndView("/add", m);
	}

	// Search mappingS
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView getEmployee(@ModelAttribute("College") Model clg) {
		String name = clg.getName();
		clg.setRoll(name);
		String roll = clg.getRoll();

		List<Model> lst = service.getObject(name, roll);
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("list", lst);

		return new ModelAndView("/ListOfStudent", m);
	}

	// edit mapping
	@RequestMapping(value = "/edit/{stuId}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable("stuId") Integer id) {
		edit=id;
		Map<String, Object> m = new HashMap<String, Object>();
		Model mdl = service.getObject(id);
		m.put("College", mdl);
		return new ModelAndView("/edit", m);
	}

	// Update mapping
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("College") Model clg, BindingResult result, ModelMap m) {

		if (result.hasErrors()) {
			System.out.println(result);
			return "/edit";
		}
		if (clg.getType() == null) {
			clg.setType("");

		}

		// Calculations
		double constant = 100, totalGp = 0.00, totalCredit = 0.00;

		// GPA
		String grade = "";
		// subjects number variables
		int sub1Number = 0, sub2Number = 0, sub3Number = 0, sub4Number = 0, sub5Number = 0, sub6Number = 0,
				sub7Number = 0, sub8Number = 0, sub9Number = 0, sub10Number = 0;

		// Subject Credits
		int sub1ch = 0, sub2ch = 0, sub3ch = 0, sub4ch = 0, sub5ch = 0, sub6ch = 0, sub7ch = 0, sub8ch = 0, sub9ch = 0,
				sub10ch = 0;
		// Subject Grade points
		double s1Gp = 0.00, s2Gp = 0.00, s3Gp = 0.00, s4Gp = 0.00, s5Gp = 0.00, s6Gp = 0.00, s7Gp = 0.00, s8Gp = 0.00,
				s9Gp = 0.00, s10Gp = 0.00;

		// Subject Full Marks
		double s1Fm = 0.00, s2Fm = 0.00, s3Fm = 0.00, s4Fm = 0.00, s5Fm = 0.00, s6Fm = 0.00, s7Fm = 0.00, s8Fm = 0.00,
				s9Fm = 0.00, s10Fm = 0.00;

		try {

			if (!clg.getSubject_I_OB().equals("")) {
				sub1Number = Integer.parseInt(clg.getSubject_I_OB());// clg.getSubject_I_GL() returning obtained marks
			}
			if (!clg.getSubject_II_OB().equals("")) {
				sub2Number = Integer.parseInt(clg.getSubject_II_OB());
			}
			if (!clg.getSubject_III_OB().equals("")) {
				sub3Number = Integer.parseInt(clg.getSubject_III_OB());
			}
			if (!clg.getSubject_IV_OB().equals("")) {
				sub4Number = Integer.parseInt(clg.getSubject_IV_OB());
			}
			if (!clg.getSubject_V_OB().equals("")) {
				sub5Number = Integer.parseInt(clg.getSubject_V_OB());
			}
			if (!clg.getSubject_VI_OB().equals("")) {
				sub6Number = Integer.parseInt(clg.getSubject_VI_OB());
			}
			if (!clg.getSubject_VII_OB().equals("")) {
				sub7Number = Integer.parseInt(clg.getSubject_VII_OB());
			}
			if (!clg.getSubject_VIII_OB().equals("")) {
				sub8Number = Integer.parseInt(clg.getSubject_VIII_OB());
			}
			if (!clg.getSubject_IX_OB().equals("")) {
				sub9Number = Integer.parseInt(clg.getSubject_IX_OB());
			}
			if (!clg.getSubject_X_OB().equals("")) {
				sub10Number = Integer.parseInt(clg.getSubject_X_OB());
			}

			// getting credits

			if (!clg.getSubject_I_CH().equals("")) {
				sub1ch = Integer.parseInt(clg.getSubject_I_CH());// clg.getSubject_I_CH() returning Credit Hours
			}
			if (!clg.getSubject_II_CH().equals("")) {
				sub2ch = Integer.parseInt(clg.getSubject_II_CH());
			}
			if (!clg.getSubject_III_CH().equals("")) {
				sub3ch = Integer.parseInt(clg.getSubject_III_CH());
			}
			if (!clg.getSubject_IV_CH().equals("")) {
				sub4ch = Integer.parseInt(clg.getSubject_IV_CH());
			}
			if (!clg.getSubject_V_CH().equals("")) {
				sub5ch = Integer.parseInt(clg.getSubject_V_CH());
			}
			if (!clg.getSubject_VI_CH().equals("")) {
				sub6ch = Integer.parseInt(clg.getSubject_VI_CH());
			}
			if (!clg.getSubject_VII_CH().equals("")) {
				sub7ch = Integer.parseInt(clg.getSubject_VII_CH());
			}
			if (!clg.getSubject_VIII_CH().equals("")) {
				sub8ch = Integer.parseInt(clg.getSubject_VIII_CH());
			}
			if (!clg.getSubject_IX_CH().equals("")) {
				sub9ch = Integer.parseInt(clg.getSubject_IX_CH());
			}
			if (!clg.getSubject_X_CH().equals("")) {
				sub10ch = Integer.parseInt(clg.getSubject_X_CH());
			}

			// getting Full marks

			if (!clg.getSubject_I_FM().equals("")) {
				s1Fm = Double.parseDouble(clg.getSubject_I_FM());// clg.getSubject_I_FM() returning Full Marks
			}
			if (!clg.getSubject_II_FM().equals("")) {
				s2Fm = Double.parseDouble(clg.getSubject_II_FM());
			}
			if (!clg.getSubject_III_FM().equals("")) {
				s3Fm = Double.parseDouble(clg.getSubject_III_FM());
			}
			if (!clg.getSubject_IV_FM().equals("")) {
				s4Fm = Double.parseDouble(clg.getSubject_IV_FM());
			}
			if (!clg.getSubject_V_FM().equals("")) {
				s5Fm = Double.parseDouble(clg.getSubject_V_FM());
			}
			if (!clg.getSubject_VI_FM().equals("")) {
				s6Fm = Double.parseDouble(clg.getSubject_VI_FM());
			}
			if (!clg.getSubject_VII_FM().equals("")) {
				s7Fm = Double.parseDouble(clg.getSubject_VII_FM());
			}
			if (!clg.getSubject_VIII_FM().equals("")) {
				s8Fm = Double.parseDouble(clg.getSubject_VIII_FM());
			}
			if (!clg.getSubject_IX_FM().equals("")) {
				s9Fm = Double.parseDouble(clg.getSubject_IX_FM());
			}
			if (!clg.getSubject_X_FM().equals("")) {
				s10Fm = Double.parseDouble(clg.getSubject_X_FM());
			}

			/*
			 * double s1Credit, s2Credit, s3Credit, s4Credit, s5Credit, s6Credit, s7Credit,
			 * s8Credit, s9Credit, s10Credit;
			 * 
			 * s1Credit = Double.parseDouble(clg.getSubject_I_CH()); s2Credit =
			 * Double.parseDouble(clg.getSubject_II_CH()); s3Credit =
			 * Double.parseDouble(clg.getSubject_III_CH()); s4Credit =
			 * Double.parseDouble(clg.getSubject_IV_CH()); s5Credit =
			 * Double.parseDouble(clg.getSubject_V_CH()); s6Credit =
			 * Double.parseDouble(clg.getSubject_VI_CH()); s7Credit =
			 * Double.parseDouble(clg.getSubject_VII_CH()); s8Credit =
			 * Double.parseDouble(clg.getSubject_VIII_CH()); s9Credit =
			 * Double.parseDouble(clg.getSubject_IX_CH()); s10Credit =
			 * Double.parseDouble(clg.getSubject_X_CH());
			 */

			s1Fm = (constant / s1Fm) * sub1Number;

			s2Fm = (constant / s2Fm) * sub2Number;

			s3Fm = (constant / s3Fm) * sub3Number;
			s4Fm = (constant / s4Fm) * sub4Number;
			s5Fm = (constant / s5Fm) * sub5Number;
			s6Fm = (constant / s6Fm) * sub6Number;
			s7Fm = (constant / s7Fm) * sub7Number;
			s8Fm = (constant / s8Fm) * sub8Number;
			s9Fm = (constant / s9Fm) * sub9Number;
			s10Fm = (constant / s10Fm) * sub10Number;

			// comparing for First Subject
			if (sub1Number != 0) {
				if (s1Fm >= 80) {
					clg.setSubject_I_GL("A+");
					clg.setSubject_I_GP("4.00");
					s1Gp = 4.00 * Integer.parseInt(clg.getSubject_I_CH());
				}

				else if (s1Fm >= 75 && s1Fm < 80) {
					clg.setSubject_I_GL("A");
					clg.setSubject_I_GP("3.75");
					s1Gp = 3.75 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 70 && s1Fm < 75) {
					clg.setSubject_I_GL("A-");
					clg.setSubject_I_GP("3.50");
					s1Gp = 3.50 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 65 && s1Fm < 70) {
					clg.setSubject_I_GL("B+");
					clg.setSubject_I_GP("3.25");
					s1Gp = 3.25 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 60 && s1Fm < 65) {
					clg.setSubject_I_GL("B");
					clg.setSubject_I_GP("3.00");
					s1Gp = 3.00 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 55 && s1Fm < 60) {
					clg.setSubject_I_GL("B-");
					clg.setSubject_I_GP("2.75");
					s1Gp = 2.75 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 50 && s1Fm < 55) {
					clg.setSubject_I_GL("C+");
					clg.setSubject_I_GP("2.50");
					s1Gp = 2.50 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 45 && s1Fm < 50) {
					clg.setSubject_I_GL("C");
					clg.setSubject_I_GP("2.25");
					s1Gp = 2.25 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 40 && s1Fm < 45) {
					clg.setSubject_I_GL("D");
					clg.setSubject_I_GP("2.00");
					s1Gp = 2.00 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm < 40) {
					clg.setSubject_I_GL("F");
					clg.setSubject_I_GP("0.00");
					s1Gp = 0.00 * Integer.parseInt(clg.getSubject_I_CH());
				}
			} else {
				clg.setSubject_I_GL("");
			}

			// comparing for second Subject
			if (sub2Number != 0) {
				if (s2Fm >= 80) {
					clg.setSubject_II_GL("A+");
					clg.setSubject_II_GP("4.00");
					s2Gp = 4.00 * Integer.parseInt(clg.getSubject_II_CH());
				}

				else if (s2Fm >= 75 && s2Fm < 80) {
					clg.setSubject_II_GL("A");
					clg.setSubject_II_GP("3.75");
					s2Gp = 3.75 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 70 && s2Fm < 75) {
					clg.setSubject_II_GL("A-");
					clg.setSubject_II_GP("3.50");
					s2Gp = 3.50 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 65 && s2Fm < 70) {
					clg.setSubject_II_GL("B+");
					clg.setSubject_II_GP("3.25");
					s2Gp = 3.25 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 60 && s2Fm < 65) {
					clg.setSubject_II_GL("B");
					clg.setSubject_II_GP("3.00");
					s2Gp = 3.00 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 55 && s2Fm < 60) {
					clg.setSubject_II_GL("B-");
					clg.setSubject_II_GP("2.75");
					s2Gp = 2.75 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 50 && s2Fm < 55) {
					clg.setSubject_II_GL("C+");
					clg.setSubject_II_GP("2.50");
					s2Gp = 2.50 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 45 && s2Fm < 50) {
					clg.setSubject_II_GL("C");
					clg.setSubject_II_GP("2.25");
					s2Gp = 2.25 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 40 && s2Fm < 45) {
					clg.setSubject_II_GL("D");
					clg.setSubject_II_GP("2.00");
					s2Gp = 2.00 * Integer.parseInt(clg.getSubject_II_CH());
				} else {
					clg.setSubject_II_GL("F");
					clg.setSubject_II_GP("0.00");
					s2Gp = 0.00 * Integer.parseInt(clg.getSubject_II_CH());
				}
			} else {
				clg.setSubject_II_GL("");
			}

			// comparing for third Subject
			if (sub2Number != 0) {
				if (s3Fm >= 80) {
					clg.setSubject_III_GL("A+");
					clg.setSubject_III_GP("4.00");
					s3Gp = 4.00 * Integer.parseInt(clg.getSubject_III_CH());
				}

				else if (s3Fm >= 75 && s3Fm < 80) {
					clg.setSubject_III_GL("A");
					clg.setSubject_III_GP("3.75");
					s3Gp = 3.75 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 70 && s3Fm < 75) {
					clg.setSubject_III_GL("A-");
					clg.setSubject_III_GP("3.50");
					s3Gp = 3.50 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 65 && s3Fm < 70) {
					clg.setSubject_III_GL("B+");
					clg.setSubject_III_GP("3.25");
					s3Gp = 3.25 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 60 && s3Fm < 65) {
					clg.setSubject_III_GL("B");
					clg.setSubject_III_GP("3.00");
					s3Gp = 3.00 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 55 && s3Fm < 60) {
					clg.setSubject_III_GL("B-");
					clg.setSubject_III_GP("2.75");
					s3Gp = 2.75 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 50 && s3Fm < 55) {
					clg.setSubject_III_GL("C+");
					clg.setSubject_III_GP("2.50");
					s3Gp = 2.50 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 45 && s3Fm < 50) {
					clg.setSubject_III_GL("C");
					clg.setSubject_III_GP("2.25");
					s3Gp = 2.25 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 40 && s3Fm < 45) {
					clg.setSubject_III_GL("D");
					clg.setSubject_III_GP("2.00");
					s3Gp = 2.00 * Integer.parseInt(clg.getSubject_III_CH());
				} else {
					clg.setSubject_III_GL("F");
					clg.setSubject_III_GP("0.00");
					s3Gp = 0.00 * Integer.parseInt(clg.getSubject_III_CH());
				}
			} else {
				clg.setSubject_III_GL("");
			}

			// comparing for fourth Subject
			if (sub4Number != 0) {
				if (s4Fm >= 80) {
					clg.setSubject_IV_GL("A+");
					clg.setSubject_IV_GP("4.00");
					s4Gp = 4.00 * Integer.parseInt(clg.getSubject_IV_CH());
				}

				else if (s4Fm >= 75 && s4Fm < 80) {
					clg.setSubject_IV_GL("A");
					clg.setSubject_IV_GP("3.75");
					s4Gp = 3.75 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 70 && s4Fm < 75) {
					clg.setSubject_IV_GL("A-");
					clg.setSubject_IV_GP("3.50");
					s4Gp = 3.50 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 65 && s4Fm < 70) {
					clg.setSubject_IV_GL("B+");
					clg.setSubject_IV_GP("3.25");
					s4Gp = 3.25 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 60 && s4Fm < 65) {
					clg.setSubject_IV_GL("B");
					clg.setSubject_IV_GP("3.00");
					s4Gp = 3.00 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 55 && s4Fm < 60) {
					clg.setSubject_IV_GL("B-");
					clg.setSubject_IV_GP("2.75");
					s4Gp = 2.75 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 50 && s4Fm < 55) {
					clg.setSubject_IV_GL("C+");
					clg.setSubject_IV_GP("2.50");
					s4Gp = 2.50 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 45 && s4Fm < 50) {
					clg.setSubject_IV_GL("C");
					clg.setSubject_IV_GP("2.25");
					s4Gp = 2.25 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 40 && s4Fm < 45) {
					clg.setSubject_IV_GL("D");
					clg.setSubject_IV_GP("2.00");
					s4Gp = 2.00 * Integer.parseInt(clg.getSubject_IV_CH());
				} else {
					clg.setSubject_IV_GL("F");
					clg.setSubject_IV_GP("0.00");
					s4Gp = 0.00 * Integer.parseInt(clg.getSubject_IV_CH());
				}
			} else {
				clg.setSubject_IV_GL("");
			}

			// comparing for fifth Subject
			if (sub5Number != 0) {
				if (s5Fm >= 80) {
					clg.setSubject_V_GL("A+");
					clg.setSubject_V_GP("4.00");
					s5Gp = 4.00 * Integer.parseInt(clg.getSubject_V_CH());
				}

				else if (s5Fm >= 75 && s5Fm < 80) {
					clg.setSubject_V_GL("A");
					clg.setSubject_V_GP("3.75");
					s5Gp = 3.75 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 70 && s5Fm < 75) {
					clg.setSubject_V_GL("A-");
					clg.setSubject_V_GP("3.50");
					s5Gp = 3.50 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 65 && s5Fm < 70) {
					clg.setSubject_V_GL("B+");
					clg.setSubject_V_GP("3.25");
					s5Gp = 3.25 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 60 && s5Fm < 65) {
					clg.setSubject_V_GL("B");
					clg.setSubject_V_GP("3.00");
					s5Gp = 3.00 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 55 && s5Fm < 60) {
					clg.setSubject_V_GL("B-");
					clg.setSubject_V_GP("2.75");
					s5Gp = 2.75 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 50 && s5Fm < 55) {
					clg.setSubject_V_GL("C+");
					clg.setSubject_V_GP("2.50");
					s5Gp = 2.50 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 45 && s5Fm < 50) {
					clg.setSubject_V_GL("C");
					clg.setSubject_V_GP("2.25");
					s5Gp = 2.25 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 40 && s5Fm < 45) {
					clg.setSubject_V_GL("D");
					clg.setSubject_V_GP("2.00");
					s5Gp = 2.00 * Integer.parseInt(clg.getSubject_V_CH());
				} else {
					clg.setSubject_V_GL("F");
					clg.setSubject_V_GP("0.00");
					s5Gp = 0.00 * Integer.parseInt(clg.getSubject_V_CH());
				}
			} else {
				clg.setSubject_V_GL("");
			}

			// comparing for Sixth Subject
			if (sub6Number != 0) {
				if (s6Fm >= 80) {
					clg.setSubject_VI_GL("A+");
					clg.setSubject_VI_GP("4.00");
					s6Gp = 4.00 * Integer.parseInt(clg.getSubject_VI_CH());
				}

				else if (s6Fm >= 75 && s6Fm < 80) {
					clg.setSubject_VI_GL("A");
					clg.setSubject_VI_GP("3.75");
					s6Gp = 3.75 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 70 && s6Fm < 75) {
					clg.setSubject_VI_GL("A-");
					clg.setSubject_VI_GP("3.50");
					s6Gp = 3.50 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 65 && s6Fm < 70) {
					clg.setSubject_VI_GL("B+");
					clg.setSubject_VI_GP("3.25");
					s6Gp = 3.25 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 60 && s6Fm < 65) {
					clg.setSubject_VI_GL("B");
					clg.setSubject_VI_GP("3.00");
					s6Gp = 3.00 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 55 && s6Fm < 60) {
					clg.setSubject_VI_GL("B-");
					clg.setSubject_VI_GP("2.75");
					s6Gp = 2.75 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 50 && s6Fm < 55) {
					clg.setSubject_VI_GL("C+");
					clg.setSubject_VI_GP("2.50");
					s6Gp = 2.50 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 45 && s6Fm < 50) {
					clg.setSubject_VI_GL("C");
					clg.setSubject_VI_GP("2.25");
					s6Gp = 2.25 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 40 && s6Fm < 45) {
					clg.setSubject_VI_GL("D");
					clg.setSubject_VI_GP("2.00");
					s6Gp = 2.00 * Integer.parseInt(clg.getSubject_VI_CH());
				} else {
					clg.setSubject_VI_GL("F");
					clg.setSubject_VI_GP("0.00");
					s6Gp = 0.00 * Integer.parseInt(clg.getSubject_VI_CH());
				}
			} else {
				clg.setSubject_VI_GL("");
			}

			// comparing for Seventh Subject
			if (sub7Number != 0) {
				if (s7Fm >= 80) {
					clg.setSubject_VII_GL("A+");
					clg.setSubject_VII_GP("4.00");
					s7Gp = 4.00 * Integer.parseInt(clg.getSubject_VII_CH());
				}

				else if (s7Fm >= 75 && s7Fm < 80) {
					clg.setSubject_VII_GL("A");
					clg.setSubject_VII_GP("3.75");
					s7Gp = 3.75 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 70 && s7Fm < 75) {
					clg.setSubject_VII_GL("A-");
					clg.setSubject_VII_GP("3.50");
					s7Gp = 3.50 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 65 && s7Fm < 70) {
					clg.setSubject_VII_GL("B+");
					clg.setSubject_VII_GP("3.25");
					s7Gp = 3.25 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 60 && s7Fm < 65) {
					clg.setSubject_VII_GL("B");
					clg.setSubject_VII_GP("3.00");
					s7Gp = 3.00 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 55 && s7Fm < 60) {
					clg.setSubject_VII_GL("B-");
					clg.setSubject_VII_GP("2.75");
					s7Gp = 2.75 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 50 && s7Fm < 55) {
					clg.setSubject_VII_GL("C+");
					clg.setSubject_VII_GP("2.50");
					s7Gp = 2.50 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 45 && s7Fm < 50) {
					clg.setSubject_VII_GL("C");
					clg.setSubject_VII_GP("2.25");
					s7Gp = 2.25 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 40 && s7Fm < 45) {
					clg.setSubject_VII_GL("D");
					clg.setSubject_VII_GP("2.00");
					s7Gp = 2.00 * Integer.parseInt(clg.getSubject_VII_CH());
				} else {
					clg.setSubject_VII_GL("F");
					clg.setSubject_VII_GP("0.00");
					s7Gp = 0.00 * Integer.parseInt(clg.getSubject_VII_CH());
				}
			} else {
				clg.setSubject_VII_GL("");
			}

			// comparing for Eighth Subject
			if (sub8Number != 0) {
				if (s8Fm >= 80) {
					clg.setSubject_VIII_GL("A+");
					clg.setSubject_VIII_GP("4.00");
					s8Gp = 4.00 * Integer.parseInt(clg.getSubject_VIII_CH());
				}

				else if (s8Fm >= 75 && s8Fm < 80) {
					clg.setSubject_VIII_GL("A");
					clg.setSubject_VIII_GP("3.75");
					s8Gp = 3.75 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 70 && s8Fm < 75) {
					clg.setSubject_VIII_GL("A-");
					clg.setSubject_VIII_GP("3.50");
					s8Gp = 3.50 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 65 && s8Fm < 70) {
					clg.setSubject_VIII_GL("B+");
					clg.setSubject_VIII_GP("3.25");
					s8Gp = 3.25 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 60 && s8Fm < 65) {
					clg.setSubject_VIII_GL("B");
					clg.setSubject_VIII_GP("3.00");
					s8Gp = 3.00 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 55 && s8Fm < 60) {
					clg.setSubject_VIII_GL("B-");
					clg.setSubject_VIII_GP("2.75");
					s8Gp = 2.75 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 50 && s8Fm < 55) {
					clg.setSubject_VIII_GL("C+");
					clg.setSubject_VIII_GP("2.50");
					s8Gp = 2.50 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 45 && s8Fm < 50) {
					clg.setSubject_VIII_GL("C");
					clg.setSubject_VIII_GP("2.25");
					s8Gp = 2.25 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 40 && s8Fm < 45) {
					clg.setSubject_VIII_GL("D");
					clg.setSubject_VIII_GP("2.00");
					s8Gp = 2.00 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else {
					clg.setSubject_VIII_GL("F");
					clg.setSubject_VIII_GP("0.00");
					s8Gp = 0.00 * Integer.parseInt(clg.getSubject_VIII_CH());
				}
			} else {
				clg.setSubject_VIII_GL("");
			}

			// comparing for Ninth Subject
			if (sub9Number != 0) {
				if (s9Fm >= 80) {
					clg.setSubject_IX_GL("A+");
					clg.setSubject_IX_GP("4.00");
					s9Gp = 4.00 * Integer.parseInt(clg.getSubject_IX_CH());
				}

				else if (s9Fm >= 75 && s9Fm < 80) {
					clg.setSubject_IX_GL("A");
					clg.setSubject_IX_GP("3.75");
					s9Gp = 3.75 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 70 && s9Fm < 75) {
					clg.setSubject_IX_GL("A-");
					clg.setSubject_IX_GP("3.50");
					s9Gp = 3.50 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 65 && s9Fm < 70) {
					clg.setSubject_IX_GL("B+");
					clg.setSubject_IX_GP("3.25");
					s9Gp = 3.25 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 60 && s9Fm < 65) {
					clg.setSubject_IX_GL("B");
					clg.setSubject_IX_GP("3.00");
					s9Gp = 3.00 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 55 && s9Fm < 60) {
					clg.setSubject_IX_GL("B-");
					clg.setSubject_IX_GP("2.75");
					s9Gp = 2.75 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 50 && s9Fm < 55) {
					clg.setSubject_IX_GL("C+");
					clg.setSubject_IX_GP("2.50");
					s9Gp = 2.50 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 45 && s9Fm < 50) {
					clg.setSubject_IX_GL("C");
					clg.setSubject_IX_GP("2.25");
					s9Gp = 2.25 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 40 && s9Fm < 45) {
					clg.setSubject_IX_GL("D");
					clg.setSubject_IX_GP("2.00");
					s9Gp = 2.00 * Integer.parseInt(clg.getSubject_IX_CH());
				} else {
					clg.setSubject_IX_GL("F");
					clg.setSubject_IX_GP("0.00");
					s9Gp = 0.00 * Integer.parseInt(clg.getSubject_IX_CH());
				}
			} else {
				clg.setSubject_IX_GL("");
			}

			// comparing for Tenth Subject
			if (sub10Number != 0) {
				if (s10Fm >= 80) {
					clg.setSubject_X_GL("A+");
					clg.setSubject_X_GP("4.00");
					s10Gp = 4.00 * Integer.parseInt(clg.getSubject_X_CH());
				}

				else if (s10Fm >= 75 && s10Fm < 80) {
					clg.setSubject_X_GL("A");
					clg.setSubject_X_GP("3.75");
					s10Gp = 3.75 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 70 && s10Fm < 75) {
					clg.setSubject_X_GL("A-");
					clg.setSubject_X_GP("3.50");
					s10Gp = 3.50 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 65 && s10Fm < 70) {
					clg.setSubject_X_GL("B+");
					clg.setSubject_X_GP("3.25");
					s10Gp = 3.25 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 60 && s10Fm < 65) {
					clg.setSubject_X_GL("B");
					clg.setSubject_X_GP("3.00");
					s10Gp = 3.00 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 55 && s10Fm < 60) {
					clg.setSubject_X_GL("B-");
					clg.setSubject_X_GP("2.75");
					s10Gp = 2.75 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 50 && s10Fm < 55) {
					clg.setSubject_X_GL("C+");
					clg.setSubject_X_GP("2.50");
					s10Gp = 2.50 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 45 && s10Fm < 50) {
					clg.setSubject_X_GL("C");
					clg.setSubject_X_GP("2.25");
					s10Gp = 2.25 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 40 && s10Fm < 45) {
					clg.setSubject_X_GL("D");
					clg.setSubject_X_GP("2.00");
					s10Gp = 2.00 * Integer.parseInt(clg.getSubject_X_CH());
				} else {
					clg.setSubject_X_GL("F");
					clg.setSubject_X_GP("0.00");
					s10Gp = 0.00 * Integer.parseInt(clg.getSubject_X_CH());
				}
			} else {
				clg.setSubject_X_GL("");
			}

			totalGp = s1Gp + s2Gp + s3Gp + s4Gp + s5Gp + s6Gp + s7Gp + s8Gp + s9Gp + s10Gp;
			totalCredit = sub1ch + sub2ch + sub3ch + sub4ch + sub5ch + sub6ch + sub7ch + sub8ch + sub9ch + sub10ch;

			/*
			 * System.out.println(s1Gp); System.out.println(s2Gp); System.out.println(s3Gp);
			 * System.out.println(s4Gp); System.out.println(s5Gp); System.out.println(s6Gp);
			 * System.out.println(s7Gp); System.out.println(s8Gp); System.out.println(s9Gp);
			 * System.out.println(s10Gp); System.out.println("\n"+"\n"+totalGp);
			 * 
			 * System.out.println("\n"+"\n"+totalCredit);
			 */
			/*
			 * System.out.println(clg.getSubject_I_GL());
			 * System.out.println(clg.getSubject_II_GL());
			 * System.out.println(clg.getSubject_III_GL());
			 * System.out.println(clg.getSubject_IV_GL());
			 * System.out.println(clg.getSubject_V_GL());
			 * System.out.println(clg.getSubject_VI_GL());
			 * System.out.println(clg.getSubject_VII_GL());
			 * System.out.println(clg.getSubject_VIII_GL());
			 * System.out.println(clg.getSubject_IX_GL());
			 * System.out.println(clg.getSubject_X_GL());
			 */
			if (clg.getSubject_I_GL().equals("F") || clg.getSubject_II_GL().equals("F")
					|| clg.getSubject_III_GL().equals("F") || clg.getSubject_IV_GL().equals("F")
					|| clg.getSubject_V_GL().equals("F") || clg.getSubject_VI_GL().equals("F")
					|| clg.getSubject_VII_GL().equals("F") || clg.getSubject_VIII_GL().equals("F")
					|| clg.getSubject_IX_GL().equals("F") || clg.getSubject_X_GL().equals("F")) {

				clg.setGrade("0.00");

			} else {
				DecimalFormat formatter = new DecimalFormat("#0.00");

				totalGp = totalGp / totalCredit;
				/* System.out.println(totalGp); */

				// String.format("%.4s", grade)
				clg.setGrade(formatter.format(totalGp));

			}
		} catch (Exception e) {
			System.out.println(e);
			return "/add";
		}
		Model clgm = service.save(clg);

		return "redirect:/list";
	}

	// delete mapping
	@RequestMapping(value = "/delete/{stuId}")
	public ModelAndView removeEmployee(@PathVariable("stuId") Integer id) {

		Model e = service.getObject(id);
		service.delete(e);
		return new ModelAndView("redirect:/list");
	}

	// save mapping
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@Valid @ModelAttribute("College") Model clg, BindingResult result, ModelMap m, Model model) {

		if (result.hasErrors()) {
			System.out.println(result);
			return "/add";
		}
		if (clg.getType() == null) {
			clg.setType("");
		}
		// Calculations
		double constant = 100, totalGp = 0.00, totalCredit = 0.00;

		// GPA
		String grade = "";
		// subjects number variables
		int sub1Number = 0, sub2Number = 0, sub3Number = 0, sub4Number = 0, sub5Number = 0, sub6Number = 0,
				sub7Number = 0, sub8Number = 0, sub9Number = 0, sub10Number = 0;

		// Subject Credits
		int sub1ch = 0, sub2ch = 0, sub3ch = 0, sub4ch = 0, sub5ch = 0, sub6ch = 0, sub7ch = 0, sub8ch = 0, sub9ch = 0,
				sub10ch = 0;
		// Subject Grade points
		double s1Gp = 0.00, s2Gp = 0.00, s3Gp = 0.00, s4Gp = 0.00, s5Gp = 0.00, s6Gp = 0.00, s7Gp = 0.00, s8Gp = 0.00,
				s9Gp = 0.00, s10Gp = 0.00;

		// Subject Full Marks
		double s1Fm = 0.00, s2Fm = 0.00, s3Fm = 0.00, s4Fm = 0.00, s5Fm = 0.00, s6Fm = 0.00, s7Fm = 0.00, s8Fm = 0.00,
				s9Fm = 0.00, s10Fm = 0.00;

		try {

			if (!clg.getSubject_I_OB().equals("")) {
				sub1Number = Integer.parseInt(clg.getSubject_I_OB());// clg.getSubject_I_GL() returning obtained marks
			}
			if (!clg.getSubject_II_OB().equals("")) {
				sub2Number = Integer.parseInt(clg.getSubject_II_OB());
			}
			if (!clg.getSubject_III_OB().equals("")) {
				sub3Number = Integer.parseInt(clg.getSubject_III_OB());
			}
			if (!clg.getSubject_IV_OB().equals("")) {
				sub4Number = Integer.parseInt(clg.getSubject_IV_OB());
			}
			if (!clg.getSubject_V_OB().equals("")) {
				sub5Number = Integer.parseInt(clg.getSubject_V_OB());
			}
			if (!clg.getSubject_VI_OB().equals("")) {
				sub6Number = Integer.parseInt(clg.getSubject_VI_OB());
			}
			if (!clg.getSubject_VII_OB().equals("")) {
				sub7Number = Integer.parseInt(clg.getSubject_VII_OB());
			}
			if (!clg.getSubject_VIII_OB().equals("")) {
				sub8Number = Integer.parseInt(clg.getSubject_VIII_OB());
			}
			if (!clg.getSubject_IX_OB().equals("")) {
				sub9Number = Integer.parseInt(clg.getSubject_IX_OB());
			}
			if (!clg.getSubject_X_OB().equals("")) {
				sub10Number = Integer.parseInt(clg.getSubject_X_OB());
			}

			// getting credits

			if (!clg.getSubject_I_CH().equals("")) {
				sub1ch = Integer.parseInt(clg.getSubject_I_CH());// clg.getSubject_I_CH() returning Credit Hours
			}
			if (!clg.getSubject_II_CH().equals("")) {
				sub2ch = Integer.parseInt(clg.getSubject_II_CH());
			}
			if (!clg.getSubject_III_CH().equals("")) {
				sub3ch = Integer.parseInt(clg.getSubject_III_CH());
			}
			if (!clg.getSubject_IV_CH().equals("")) {
				sub4ch = Integer.parseInt(clg.getSubject_IV_CH());
			}
			if (!clg.getSubject_V_CH().equals("")) {
				sub5ch = Integer.parseInt(clg.getSubject_V_CH());
			}
			if (!clg.getSubject_VI_CH().equals("")) {
				sub6ch = Integer.parseInt(clg.getSubject_VI_CH());
			}
			if (!clg.getSubject_VII_CH().equals("")) {
				sub7ch = Integer.parseInt(clg.getSubject_VII_CH());
			}
			if (!clg.getSubject_VIII_CH().equals("")) {
				sub8ch = Integer.parseInt(clg.getSubject_VIII_CH());
			}
			if (!clg.getSubject_IX_CH().equals("")) {
				sub9ch = Integer.parseInt(clg.getSubject_IX_CH());
			}
			if (!clg.getSubject_X_CH().equals("")) {
				sub10ch = Integer.parseInt(clg.getSubject_X_CH());
			}

			// getting Full marks

			if (!clg.getSubject_I_FM().equals("")) {
				s1Fm = Double.parseDouble(clg.getSubject_I_FM());// clg.getSubject_I_FM() returning Full Marks
			}
			if (!clg.getSubject_II_FM().equals("")) {
				s2Fm = Double.parseDouble(clg.getSubject_II_FM());
			}
			if (!clg.getSubject_III_FM().equals("")) {
				s3Fm = Double.parseDouble(clg.getSubject_III_FM());
			}
			if (!clg.getSubject_IV_FM().equals("")) {
				s4Fm = Double.parseDouble(clg.getSubject_IV_FM());
			}
			if (!clg.getSubject_V_FM().equals("")) {
				s5Fm = Double.parseDouble(clg.getSubject_V_FM());
			}
			if (!clg.getSubject_VI_FM().equals("")) {
				s6Fm = Double.parseDouble(clg.getSubject_VI_FM());
			}
			if (!clg.getSubject_VII_FM().equals("")) {
				s7Fm = Double.parseDouble(clg.getSubject_VII_FM());
			}
			if (!clg.getSubject_VIII_FM().equals("")) {
				s8Fm = Double.parseDouble(clg.getSubject_VIII_FM());
			}
			if (!clg.getSubject_IX_FM().equals("")) {
				s9Fm = Double.parseDouble(clg.getSubject_IX_FM());
			}
			if (!clg.getSubject_X_FM().equals("")) {
				s10Fm = Double.parseDouble(clg.getSubject_X_FM());
			}

			/*
			 * double s1Credit, s2Credit, s3Credit, s4Credit, s5Credit, s6Credit, s7Credit,
			 * s8Credit, s9Credit, s10Credit;
			 * 
			 * s1Credit = Double.parseDouble(clg.getSubject_I_CH()); s2Credit =
			 * Double.parseDouble(clg.getSubject_II_CH()); s3Credit =
			 * Double.parseDouble(clg.getSubject_III_CH()); s4Credit =
			 * Double.parseDouble(clg.getSubject_IV_CH()); s5Credit =
			 * Double.parseDouble(clg.getSubject_V_CH()); s6Credit =
			 * Double.parseDouble(clg.getSubject_VI_CH()); s7Credit =
			 * Double.parseDouble(clg.getSubject_VII_CH()); s8Credit =
			 * Double.parseDouble(clg.getSubject_VIII_CH()); s9Credit =
			 * Double.parseDouble(clg.getSubject_IX_CH()); s10Credit =
			 * Double.parseDouble(clg.getSubject_X_CH());
			 */

			s1Fm = (constant / s1Fm) * sub1Number;

			s2Fm = (constant / s2Fm) * sub2Number;

			s3Fm = (constant / s3Fm) * sub3Number;
			s4Fm = (constant / s4Fm) * sub4Number;
			s5Fm = (constant / s5Fm) * sub5Number;
			s6Fm = (constant / s6Fm) * sub6Number;
			s7Fm = (constant / s7Fm) * sub7Number;
			s8Fm = (constant / s8Fm) * sub8Number;
			s9Fm = (constant / s9Fm) * sub9Number;
			s10Fm = (constant / s10Fm) * sub10Number;

			// comparing for First Subject
			if (sub1Number != 0) {
				if (s1Fm >= 80) {
					clg.setSubject_I_GL("A+");
					clg.setSubject_I_GP("4.00");
					s1Gp = 4.00 * Integer.parseInt(clg.getSubject_I_CH());
				}

				else if (s1Fm >= 75 && s1Fm < 80) {
					clg.setSubject_I_GL("A");
					clg.setSubject_I_GP("3.75");
					s1Gp = 3.75 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 70 && s1Fm < 75) {
					clg.setSubject_I_GL("A-");
					clg.setSubject_I_GP("3.50");
					s1Gp = 3.50 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 65 && s1Fm < 70) {
					clg.setSubject_I_GL("B+");
					clg.setSubject_I_GP("3.25");
					s1Gp = 3.25 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 60 && s1Fm < 65) {
					clg.setSubject_I_GL("B");
					clg.setSubject_I_GP("3.00");
					s1Gp = 3.00 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 55 && s1Fm < 60) {
					clg.setSubject_I_GL("B-");
					clg.setSubject_I_GP("2.75");
					s1Gp = 2.75 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 50 && s1Fm < 55) {
					clg.setSubject_I_GL("C+");
					clg.setSubject_I_GP("2.50");
					s1Gp = 2.50 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 45 && s1Fm < 50) {
					clg.setSubject_I_GL("C");
					clg.setSubject_I_GP("2.25");
					s1Gp = 2.25 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm >= 40 && s1Fm < 45) {
					clg.setSubject_I_GL("D");
					clg.setSubject_I_GP("2.00");
					s1Gp = 2.00 * Integer.parseInt(clg.getSubject_I_CH());
				} else if (s1Fm < 40) {
					clg.setSubject_I_GL("F");
					clg.setSubject_I_GP("0.00");
					s1Gp = 0.00 * Integer.parseInt(clg.getSubject_I_CH());
				}
			} else {
				clg.setSubject_I_GL("");
			}

			// comparing for second Subject
			if (sub2Number != 0) {
				if (s2Fm >= 80) {
					clg.setSubject_II_GL("A+");
					clg.setSubject_II_GP("4.00");
					s2Gp = 4.00 * Integer.parseInt(clg.getSubject_II_CH());
				}

				else if (s2Fm >= 75 && s2Fm < 80) {
					clg.setSubject_II_GL("A");
					clg.setSubject_II_GP("3.75");
					s2Gp = 3.75 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 70 && s2Fm < 75) {
					clg.setSubject_II_GL("A-");
					clg.setSubject_II_GP("3.50");
					s2Gp = 3.50 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 65 && s2Fm < 70) {
					clg.setSubject_II_GL("B+");
					clg.setSubject_II_GP("3.25");
					s2Gp = 3.25 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 60 && s2Fm < 65) {
					clg.setSubject_II_GL("B");
					clg.setSubject_II_GP("3.00");
					s2Gp = 3.00 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 55 && s2Fm < 60) {
					clg.setSubject_II_GL("B-");
					clg.setSubject_II_GP("2.75");
					s2Gp = 2.75 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 50 && s2Fm < 55) {
					clg.setSubject_II_GL("C+");
					clg.setSubject_II_GP("2.50");
					s2Gp = 2.50 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 45 && s2Fm < 50) {
					clg.setSubject_II_GL("C");
					clg.setSubject_II_GP("2.25");
					s2Gp = 2.25 * Integer.parseInt(clg.getSubject_II_CH());
				} else if (s2Fm >= 40 && s2Fm < 45) {
					clg.setSubject_II_GL("D");
					clg.setSubject_II_GP("2.00");
					s2Gp = 2.00 * Integer.parseInt(clg.getSubject_II_CH());
				} else {
					clg.setSubject_II_GL("F");
					clg.setSubject_II_GP("0.00");
					s2Gp = 0.00 * Integer.parseInt(clg.getSubject_II_CH());
				}
			} else {
				clg.setSubject_II_GL("");
			}

			// comparing for third Subject
			if (sub2Number != 0) {
				if (s3Fm >= 80) {
					clg.setSubject_III_GL("A+");
					clg.setSubject_III_GP("4.00");
					s3Gp = 4.00 * Integer.parseInt(clg.getSubject_III_CH());
				}

				else if (s3Fm >= 75 && s3Fm < 80) {
					clg.setSubject_III_GL("A");
					clg.setSubject_III_GP("3.75");
					s3Gp = 3.75 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 70 && s3Fm < 75) {
					clg.setSubject_III_GL("A-");
					clg.setSubject_III_GP("3.50");
					s3Gp = 3.50 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 65 && s3Fm < 70) {
					clg.setSubject_III_GL("B+");
					clg.setSubject_III_GP("3.25");
					s3Gp = 3.25 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 60 && s3Fm < 65) {
					clg.setSubject_III_GL("B");
					clg.setSubject_III_GP("3.00");
					s3Gp = 3.00 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 55 && s3Fm < 60) {
					clg.setSubject_III_GL("B-");
					clg.setSubject_III_GP("2.75");
					s3Gp = 2.75 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 50 && s3Fm < 55) {
					clg.setSubject_III_GL("C+");
					clg.setSubject_III_GP("2.50");
					s3Gp = 2.50 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 45 && s3Fm < 50) {
					clg.setSubject_III_GL("C");
					clg.setSubject_III_GP("2.25");
					s3Gp = 2.25 * Integer.parseInt(clg.getSubject_III_CH());
				} else if (s3Fm >= 40 && s3Fm < 45) {
					clg.setSubject_III_GL("D");
					clg.setSubject_III_GP("2.00");
					s3Gp = 2.00 * Integer.parseInt(clg.getSubject_III_CH());
				} else {
					clg.setSubject_III_GL("F");
					clg.setSubject_III_GP("0.00");
					s3Gp = 0.00 * Integer.parseInt(clg.getSubject_III_CH());
				}
			} else {
				clg.setSubject_III_GL("");
			}

			// comparing for fourth Subject
			if (sub4Number != 0) {
				if (s4Fm >= 80) {
					clg.setSubject_IV_GL("A+");
					clg.setSubject_IV_GP("4.00");
					s4Gp = 4.00 * Integer.parseInt(clg.getSubject_IV_CH());
				}

				else if (s4Fm >= 75 && s4Fm < 80) {
					clg.setSubject_IV_GL("A");
					clg.setSubject_IV_GP("3.75");
					s4Gp = 3.75 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 70 && s4Fm < 75) {
					clg.setSubject_IV_GL("A-");
					clg.setSubject_IV_GP("3.50");
					s4Gp = 3.50 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 65 && s4Fm < 70) {
					clg.setSubject_IV_GL("B+");
					clg.setSubject_IV_GP("3.25");
					s4Gp = 3.25 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 60 && s4Fm < 65) {
					clg.setSubject_IV_GL("B");
					clg.setSubject_IV_GP("3.00");
					s4Gp = 3.00 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 55 && s4Fm < 60) {
					clg.setSubject_IV_GL("B-");
					clg.setSubject_IV_GP("2.75");
					s4Gp = 2.75 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 50 && s4Fm < 55) {
					clg.setSubject_IV_GL("C+");
					clg.setSubject_IV_GP("2.50");
					s4Gp = 2.50 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 45 && s4Fm < 50) {
					clg.setSubject_IV_GL("C");
					clg.setSubject_IV_GP("2.25");
					s4Gp = 2.25 * Integer.parseInt(clg.getSubject_IV_CH());
				} else if (s4Fm >= 40 && s4Fm < 45) {
					clg.setSubject_IV_GL("D");
					clg.setSubject_IV_GP("2.00");
					s4Gp = 2.00 * Integer.parseInt(clg.getSubject_IV_CH());
				} else {
					clg.setSubject_IV_GL("F");
					clg.setSubject_IV_GP("0.00");
					s4Gp = 0.00 * Integer.parseInt(clg.getSubject_IV_CH());
				}
			} else {
				clg.setSubject_IV_GL("");
			}

			// comparing for fifth Subject
			if (sub5Number != 0) {
				if (s5Fm >= 80) {
					clg.setSubject_V_GL("A+");
					clg.setSubject_V_GP("4.00");
					s5Gp = 4.00 * Integer.parseInt(clg.getSubject_V_CH());
				}

				else if (s5Fm >= 75 && s5Fm < 80) {
					clg.setSubject_V_GL("A");
					clg.setSubject_V_GP("3.75");
					s5Gp = 3.75 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 70 && s5Fm < 75) {
					clg.setSubject_V_GL("A-");
					clg.setSubject_V_GP("3.50");
					s5Gp = 3.50 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 65 && s5Fm < 70) {
					clg.setSubject_V_GL("B+");
					clg.setSubject_V_GP("3.25");
					s5Gp = 3.25 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 60 && s5Fm < 65) {
					clg.setSubject_V_GL("B");
					clg.setSubject_V_GP("3.00");
					s5Gp = 3.00 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 55 && s5Fm < 60) {
					clg.setSubject_V_GL("B-");
					clg.setSubject_V_GP("2.75");
					s5Gp = 2.75 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 50 && s5Fm < 55) {
					clg.setSubject_V_GL("C+");
					clg.setSubject_V_GP("2.50");
					s5Gp = 2.50 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 45 && s5Fm < 50) {
					clg.setSubject_V_GL("C");
					clg.setSubject_V_GP("2.25");
					s5Gp = 2.25 * Integer.parseInt(clg.getSubject_V_CH());
				} else if (s5Fm >= 40 && s5Fm < 45) {
					clg.setSubject_V_GL("D");
					clg.setSubject_V_GP("2.00");
					s5Gp = 2.00 * Integer.parseInt(clg.getSubject_V_CH());
				} else {
					clg.setSubject_V_GL("F");
					clg.setSubject_V_GP("0.00");
					s5Gp = 0.00 * Integer.parseInt(clg.getSubject_V_CH());
				}
			} else {
				clg.setSubject_V_GL("");
			}

			// comparing for Sixth Subject
			if (sub6Number != 0) {
				if (s6Fm >= 80) {
					clg.setSubject_VI_GL("A+");
					clg.setSubject_VI_GP("4.00");
					s6Gp = 4.00 * Integer.parseInt(clg.getSubject_VI_CH());
				}

				else if (s6Fm >= 75 && s6Fm < 80) {
					clg.setSubject_VI_GL("A");
					clg.setSubject_VI_GP("3.75");
					s6Gp = 3.75 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 70 && s6Fm < 75) {
					clg.setSubject_VI_GL("A-");
					clg.setSubject_VI_GP("3.50");
					s6Gp = 3.50 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 65 && s6Fm < 70) {
					clg.setSubject_VI_GL("B+");
					clg.setSubject_VI_GP("3.25");
					s6Gp = 3.25 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 60 && s6Fm < 65) {
					clg.setSubject_VI_GL("B");
					clg.setSubject_VI_GP("3.00");
					s6Gp = 3.00 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 55 && s6Fm < 60) {
					clg.setSubject_VI_GL("B-");
					clg.setSubject_VI_GP("2.75");
					s6Gp = 2.75 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 50 && s6Fm < 55) {
					clg.setSubject_VI_GL("C+");
					clg.setSubject_VI_GP("2.50");
					s6Gp = 2.50 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 45 && s6Fm < 50) {
					clg.setSubject_VI_GL("C");
					clg.setSubject_VI_GP("2.25");
					s6Gp = 2.25 * Integer.parseInt(clg.getSubject_VI_CH());
				} else if (s6Fm >= 40 && s6Fm < 45) {
					clg.setSubject_VI_GL("D");
					clg.setSubject_VI_GP("2.00");
					s6Gp = 2.00 * Integer.parseInt(clg.getSubject_VI_CH());
				} else {
					clg.setSubject_VI_GL("F");
					clg.setSubject_VI_GP("0.00");
					s6Gp = 0.00 * Integer.parseInt(clg.getSubject_VI_CH());
				}
			} else {
				clg.setSubject_VI_GL("");
			}

			// comparing for Seventh Subject
			if (sub7Number != 0) {
				if (s7Fm >= 80) {
					clg.setSubject_VII_GL("A+");
					clg.setSubject_VII_GP("4.00");
					s7Gp = 4.00 * Integer.parseInt(clg.getSubject_VII_CH());
				}

				else if (s7Fm >= 75 && s7Fm < 80) {
					clg.setSubject_VII_GL("A");
					clg.setSubject_VII_GP("3.75");
					s7Gp = 3.75 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 70 && s7Fm < 75) {
					clg.setSubject_VII_GL("A-");
					clg.setSubject_VII_GP("3.50");
					s7Gp = 3.50 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 65 && s7Fm < 70) {
					clg.setSubject_VII_GL("B+");
					clg.setSubject_VII_GP("3.25");
					s7Gp = 3.25 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 60 && s7Fm < 65) {
					clg.setSubject_VII_GL("B");
					clg.setSubject_VII_GP("3.00");
					s7Gp = 3.00 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 55 && s7Fm < 60) {
					clg.setSubject_VII_GL("B-");
					clg.setSubject_VII_GP("2.75");
					s7Gp = 2.75 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 50 && s7Fm < 55) {
					clg.setSubject_VII_GL("C+");
					clg.setSubject_VII_GP("2.50");
					s7Gp = 2.50 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 45 && s7Fm < 50) {
					clg.setSubject_VII_GL("C");
					clg.setSubject_VII_GP("2.25");
					s7Gp = 2.25 * Integer.parseInt(clg.getSubject_VII_CH());
				} else if (s7Fm >= 40 && s7Fm < 45) {
					clg.setSubject_VII_GL("D");
					clg.setSubject_VII_GP("2.00");
					s7Gp = 2.00 * Integer.parseInt(clg.getSubject_VII_CH());
				} else {
					clg.setSubject_VII_GL("F");
					clg.setSubject_VII_GP("0.00");
					s7Gp = 0.00 * Integer.parseInt(clg.getSubject_VII_CH());
				}
			} else {
				clg.setSubject_VII_GL("");
			}

			// comparing for Eighth Subject
			if (sub8Number != 0) {
				if (s8Fm >= 80) {
					clg.setSubject_VIII_GL("A+");
					clg.setSubject_VIII_GP("4.00");
					s8Gp = 4.00 * Integer.parseInt(clg.getSubject_VIII_CH());
				}

				else if (s8Fm >= 75 && s8Fm < 80) {
					clg.setSubject_VIII_GL("A");
					clg.setSubject_VIII_GP("3.75");
					s8Gp = 3.75 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 70 && s8Fm < 75) {
					clg.setSubject_VIII_GL("A-");
					clg.setSubject_VIII_GP("3.50");
					s8Gp = 3.50 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 65 && s8Fm < 70) {
					clg.setSubject_VIII_GL("B+");
					clg.setSubject_VIII_GP("3.25");
					s8Gp = 3.25 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 60 && s8Fm < 65) {
					clg.setSubject_VIII_GL("B");
					clg.setSubject_VIII_GP("3.00");
					s8Gp = 3.00 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 55 && s8Fm < 60) {
					clg.setSubject_VIII_GL("B-");
					clg.setSubject_VIII_GP("2.75");
					s8Gp = 2.75 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 50 && s8Fm < 55) {
					clg.setSubject_VIII_GL("C+");
					clg.setSubject_VIII_GP("2.50");
					s8Gp = 2.50 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 45 && s8Fm < 50) {
					clg.setSubject_VIII_GL("C");
					clg.setSubject_VIII_GP("2.25");
					s8Gp = 2.25 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else if (s8Fm >= 40 && s8Fm < 45) {
					clg.setSubject_VIII_GL("D");
					clg.setSubject_VIII_GP("2.00");
					s8Gp = 2.00 * Integer.parseInt(clg.getSubject_VIII_CH());
				} else {
					clg.setSubject_VIII_GL("F");
					clg.setSubject_VIII_GP("0.00");
					s8Gp = 0.00 * Integer.parseInt(clg.getSubject_VIII_CH());
				}
			} else {
				clg.setSubject_VIII_GL("");
			}

			// comparing for Ninth Subject
			if (sub9Number != 0) {
				if (s9Fm >= 80) {
					clg.setSubject_IX_GL("A+");
					clg.setSubject_IX_GP("4.00");
					s9Gp = 4.00 * Integer.parseInt(clg.getSubject_IX_CH());
				}

				else if (s9Fm >= 75 && s9Fm < 80) {
					clg.setSubject_IX_GL("A");
					clg.setSubject_IX_GP("3.75");
					s9Gp = 3.75 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 70 && s9Fm < 75) {
					clg.setSubject_IX_GL("A-");
					clg.setSubject_IX_GP("3.50");
					s9Gp = 3.50 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 65 && s9Fm < 70) {
					clg.setSubject_IX_GL("B+");
					clg.setSubject_IX_GP("3.25");
					s9Gp = 3.25 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 60 && s9Fm < 65) {
					clg.setSubject_IX_GL("B");
					clg.setSubject_IX_GP("3.00");
					s9Gp = 3.00 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 55 && s9Fm < 60) {
					clg.setSubject_IX_GL("B-");
					clg.setSubject_IX_GP("2.75");
					s9Gp = 2.75 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 50 && s9Fm < 55) {
					clg.setSubject_IX_GL("C+");
					clg.setSubject_IX_GP("2.50");
					s9Gp = 2.50 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 45 && s9Fm < 50) {
					clg.setSubject_IX_GL("C");
					clg.setSubject_IX_GP("2.25");
					s9Gp = 2.25 * Integer.parseInt(clg.getSubject_IX_CH());
				} else if (s9Fm >= 40 && s9Fm < 45) {
					clg.setSubject_IX_GL("D");
					clg.setSubject_IX_GP("2.00");
					s9Gp = 2.00 * Integer.parseInt(clg.getSubject_IX_CH());
				} else {
					clg.setSubject_IX_GL("F");
					clg.setSubject_IX_GP("0.00");
					s9Gp = 0.00 * Integer.parseInt(clg.getSubject_IX_CH());
				}
			} else {
				clg.setSubject_IX_GL("");
			}

			// comparing for Tenth Subject
			if (sub10Number != 0) {
				if (s10Fm >= 80) {
					clg.setSubject_X_GL("A+");
					clg.setSubject_X_GP("4.00");
					s10Gp = 4.00 * Integer.parseInt(clg.getSubject_X_CH());
				}

				else if (s10Fm >= 75 && s10Fm < 80) {
					clg.setSubject_X_GL("A");
					clg.setSubject_X_GP("3.75");
					s10Gp = 3.75 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 70 && s10Fm < 75) {
					clg.setSubject_X_GL("A-");
					clg.setSubject_X_GP("3.50");
					s10Gp = 3.50 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 65 && s10Fm < 70) {
					clg.setSubject_X_GL("B+");
					clg.setSubject_X_GP("3.25");
					s10Gp = 3.25 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 60 && s10Fm < 65) {
					clg.setSubject_X_GL("B");
					clg.setSubject_X_GP("3.00");
					s10Gp = 3.00 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 55 && s10Fm < 60) {
					clg.setSubject_X_GL("B-");
					clg.setSubject_X_GP("2.75");
					s10Gp = 2.75 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 50 && s10Fm < 55) {
					clg.setSubject_X_GL("C+");
					clg.setSubject_X_GP("2.50");
					s10Gp = 2.50 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 45 && s10Fm < 50) {
					clg.setSubject_X_GL("C");
					clg.setSubject_X_GP("2.25");
					s10Gp = 2.25 * Integer.parseInt(clg.getSubject_X_CH());
				} else if (s10Fm >= 40 && s10Fm < 45) {
					clg.setSubject_X_GL("D");
					clg.setSubject_X_GP("2.00");
					s10Gp = 2.00 * Integer.parseInt(clg.getSubject_X_CH());
				} else {
					clg.setSubject_X_GL("F");
					clg.setSubject_X_GP("0.00");
					s10Gp = 0.00 * Integer.parseInt(clg.getSubject_X_CH());
				}
			} else {
				clg.setSubject_X_GL("");
			}

			totalGp = s1Gp + s2Gp + s3Gp + s4Gp + s5Gp + s6Gp + s7Gp + s8Gp + s9Gp + s10Gp;
			totalCredit = sub1ch + sub2ch + sub3ch + sub4ch + sub5ch + sub6ch + sub7ch + sub8ch + sub9ch + sub10ch;

			/*
			 * System.out.println(clg.getSubject_I_GL());
			 * System.out.println(clg.getSubject_II_GL());
			 * System.out.println(clg.getSubject_III_GL());
			 * System.out.println(clg.getSubject_IV_GL());
			 * System.out.println(clg.getSubject_V_GL());
			 * System.out.println(clg.getSubject_VI_GL());
			 * System.out.println(clg.getSubject_VII_GL());
			 * System.out.println(clg.getSubject_VIII_GL());
			 * System.out.println(clg.getSubject_IX_GL());
			 * System.out.println(clg.getSubject_X_GL());
			 */
			if (clg.getSubject_I_GL().equals("F") || clg.getSubject_II_GL().equals("F")
					|| clg.getSubject_III_GL().equals("F") || clg.getSubject_IV_GL().equals("F")
					|| clg.getSubject_V_GL().equals("F") || clg.getSubject_VI_GL().equals("F")
					|| clg.getSubject_VII_GL().equals("F") || clg.getSubject_VIII_GL().equals("F")
					|| clg.getSubject_IX_GL().equals("F") || clg.getSubject_X_GL().equals("F")) {

				clg.setGrade("0.00");

			} else {
				DecimalFormat formatter = new DecimalFormat("#0.00");

				totalGp = totalGp / totalCredit;

				// String.format("%.4s", grade)
				clg.setGrade(formatter.format(totalGp));

			}
		} catch (Exception e) {
			System.out.println(e);
			return "/add";
		}
		Model clgm = service.save(clg);

		return "redirect:/list";
	}

	// error handling
	@RequestMapping({ "/error" })
	public String notFound() {
		return "/error/404";
	}

	@RequestMapping({ "/405" })
	public String methodNotFound() {
		return "/error/405";
	}

	@RequestMapping("/about")
	public String about() {
		return "/about";
	}

}
