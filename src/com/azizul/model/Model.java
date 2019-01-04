package com.azizul.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="student_markshit")
public class Model {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int reportId;
	
	
	@Column(name="Type")
	private String type;
	
	@Column(name="Faculties")
	private String faculty;
	
	@Column(name="serial")
	private String serialNo;
	
	@Column(name="Semester")
	private String semester;
	
	@Column(name="Stu_Name")
	private String name;
	
	@Column(name="father_Name")
	private String fatherName;
	
	@Column(name="mother_Name")
	private String motherName;
	
	@Column(name="roll")
	private String roll;
	
	@Column(name="reg")
	private String reg;
	
	@Column(name="sessions")
	private String session;
	
	@Column(name="exam_Name")
	private String examName;
	
	@Column(name="exam_date")
	private String examDate;
	
	@Column(name="Grade")
	private String grade;
	
	
	@Column(name="Year")
	private String year;
	
	
	
	
	
	
	//sub one
	@Column(name="subject_I")
	private String subject_I;
	
	@Column(name="subject_I_CH")
	private String subject_I_CH;
	
	@Column(name="subject_I_SC")
	private String subject_I_SC;

	@Column(name="subject_I_GL")
	private String subject_I_GL;

	@Column(name="subject_I_GP")
	private String subject_I_GP;
	
	@Column(name="subject_I_FM")
	private String subject_I_FM;
	
	@Column(name="subject_I_OB")
	private String subject_I_OB;
	
	//sub two
	
	@Column(name="subject_II")
	private String subject_II;
	
	@Column(name="subject_II_CH")
	private String subject_II_CH;

	@Column(name="subject_II_GL")
	private String subject_II_GL;

	@Column(name="subject_II_GP")
	private String subject_II_GP;
	
	@Column(name="subject_II_SC")
	private String subject_II_SC;
	
	@Column(name="subject_II_FM")
	private String subject_II_FM;
	
	@Column(name="subject_II_OB")
	private String subject_II_OB;
	
	
	//sub three
	
	
	@Column(name="subject_III")
	private String subject_III;
	
	@Column(name="subject_III_CH")
	private String subject_III_CH;

	@Column(name="subject_III_GL")
	private String subject_III_GL;

	@Column(name="subject_III_GP")
	private String subject_III_GP;
	
	@Column(name="subject_III_SC")
	private String subject_III_SC;

	
	@Column(name="subject_III_FM")
	private String subject_III_FM;
	
	@Column(name="subject_III_OB")
	private String subject_III_OB;
	//sub four
	
	@Column(name="subject_IV")
	private String subject_IV;
	
	@Column(name="subject_IV_CH")
	private String subject_IV_CH;

	@Column(name="subject_IV_GL")
	private String subject_IV_GL;

	@Column(name="subject_IV_GP")
	private String subject_IV_GP;
	@Column(name="subject_IV_SC")
	private String subject_IV_SC;
	
	@Column(name="subject_IV_FM")
	private String subject_IV_FM;
	
	@Column(name="subject_IV_OB")
	private String subject_IV_OB;
	
	//sub five
	@Column(name="subject_V")
	private String subject_V;
	
	@Column(name="subject_V_CH")
	private String subject_V_CH;

	@Column(name="subject_V_GL")
	private String subject_V_GL;

	@Column(name="subject_V_GP")
	private String subject_V_GP;
	
	@Column(name="subject_V_SC")
	private String subject_V_SC;
	
	@Column(name="subject_V_FM")
	private String subject_V_FM;
	
	@Column(name="subject_V_OB")
	private String subject_V_OB;
	
	//sub six
	
	@Column(name="subject_VI")
	private String subject_VI;
	
	@Column(name="subject_VI_CH")
	private String subject_VI_CH;

	@Column(name="subject_VI_GL")
	private String subject_VI_GL;

	@Column(name="subject_VI_GP")
	private String subject_VI_GP;
	
	@Column(name="subject_VI_SC")
	private String subject_VI_SC;
	
	@Column(name="subject_VI_FM")
	private String subject_VI_FM;
	
	@Column(name="subject_VI_OB")
	private String subject_VI_OB;
	
	//sub seven
	@Column(name="subject_VII")
	private String subject_VII;
	
	@Column(name="subject_VII_CH")
	private String subject_VII_CH;

	@Column(name="subject_VII_GL")
	private String subject_VII_GL;

	@Column(name="subject_VII_GP")
	private String subject_VII_GP;
	
	@Column(name="subject_VII_SC")
	private String subject_VII_SC;
	

	@Column(name="subject_VII_FM")
	private String subject_VII_FM;
	
	@Column(name="subject_VII_OB")
	private String subject_VII_OB;
	
	//sub eight
	
	@Column(name="subject_VIII")
	private String subject_VIII;
	
	@Column(name="subject_VIII_CH")
	private String subject_VIII_CH;

	@Column(name="subject_VIII_GL")
	private String subject_VIII_GL;

	@Column(name="subject_VIII_GP")
	private String subject_VIII_GP;
	
	@Column(name="subject_VIII_SC")
	private String subject_VIII_SC;


	@Column(name="subject_VIII_FM")
	private String subject_VIII_FM;
	
	@Column(name="subject_VIII_OB")
	private String subject_VIII_OB;
	
	 //sub nine
	
	@Column(name="subject_IX")
	private String subject_IX;
	
	@Column(name="subject_IX_CH")
	private String subject_IX_CH;

	@Column(name="subject_IX_GL")
	private String subject_IX_GL;

	@Column(name="subject_IX_GP")
	private String subject_IX_GP;
	
	@Column(name="subject_IX_SC")
	private String subject_IX_SC;
	


	@Column(name="subject_IX_FM")
	private String subject_IX_FM;
	
	@Column(name="subject_IX_OB")
	private String subject_IX_OB;
	//sub ten
	
	
	@Column(name="subject_X")
	private String subject_X;
	
	@Column(name="subject_X_CH")
	private String subject_X_CH;

	@Column(name="subject_X_GL")
	private String subject_X_GL;

	@Column(name="subject_X_GP")
	private String subject_X_GP;
	
	@Column(name="subject_X_SC")
	private String subject_X_SC;
	
	@Column(name="subject_X_FM")
	private String subject_X_FM;
	
	@Column(name="subject_X_OB")
	private String subject_X_OB;
	
	
	
	
	
	//getter setters 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getExamDate() {
		return examDate;
	}
	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	public String getSubject_I() {
		return subject_I;
	}
	public void setSubject_I(String subject_I) {
		this.subject_I = subject_I;
	}
	public String getSubject_II() {
		return subject_II;
	}
	public void setSubject_II(String subject_II) {
		this.subject_II = subject_II;
	}
	public String getSubject_III() {
		return subject_III;
	}
	public void setSubject_III(String subject_III) {
		this.subject_III = subject_III;
	}
	public String getSubject_IV() {
		return subject_IV;
	}
	public void setSubject_IV(String subject_IV) {
		this.subject_IV = subject_IV;
	}
	public String getSubject_V() {
		return subject_V;
	}
	public void setSubject_V(String subject_V) {
		this.subject_V = subject_V;
	}
	public String getSubject_VI() {
		return subject_VI;
	}
	public void setSubject_VI(String subject_VI) {
		this.subject_VI = subject_VI;
	}
	public String getSubject_VII() {
		return subject_VII;
	}
	public void setSubject_VII(String subject_VII) {
		this.subject_VII = subject_VII;
	}
	public String getSubject_VIII() {
		return subject_VIII;
	}
	public void setSubject_VIII(String subject_VIII) {
		this.subject_VIII = subject_VIII;
	}
	

	public String getSubject_IX() {
		return subject_IX;
	}
	public void setSubject_IX(String subject_IX) {
		this.subject_IX = subject_IX;
	}
	public String getSubject_X() {
		return subject_X;
	}
	public void setSubject_X(String subject_X) {
		this.subject_X = subject_X;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSubject_I_CH() {
		return subject_I_CH;
	}
	public void setSubject_I_CH(String subject_I_CH) {
		this.subject_I_CH = subject_I_CH;
	}
	public String getSubject_I_GL() {
		return subject_I_GL;
	}
	public void setSubject_I_GL(String subject_I_GL) {
		this.subject_I_GL = subject_I_GL;
	}
	public String getSubject_I_GP() {
		return subject_I_GP;
	}
	public void setSubject_I_GP(String subject_I_GP) {
		this.subject_I_GP = subject_I_GP;
	}
	public String getSubject_II_CH() {
		return subject_II_CH;
	}
	public void setSubject_II_CH(String subject_II_CH) {
		this.subject_II_CH = subject_II_CH;
	}
	public String getSubject_II_GL() {
		return subject_II_GL;
	}
	public void setSubject_II_GL(String subject_II_GL) {
		this.subject_II_GL = subject_II_GL;
	}
	public String getSubject_II_GP() {
		return subject_II_GP;
	}
	public void setSubject_II_GP(String subject_II_GP) {
		this.subject_II_GP = subject_II_GP;
	}
	public String getSubject_III_CH() {
		return subject_III_CH;
	}
	public void setSubject_III_CH(String subject_III_CH) {
		this.subject_III_CH = subject_III_CH;
	}
	public String getSubject_III_GL() {
		return subject_III_GL;
	}
	public void setSubject_III_GL(String subject_III_GL) {
		this.subject_III_GL = subject_III_GL;
	}
	public String getSubject_III_GP() {
		return subject_III_GP;
	}
	public void setSubject_III_GP(String subject_III_GP) {
		this.subject_III_GP = subject_III_GP;
	}
	public String getSubject_IV_CH() {
		return subject_IV_CH;
	}
	public void setSubject_IV_CH(String subject_IV_CH) {
		this.subject_IV_CH = subject_IV_CH;
	}
	public String getSubject_IV_GL() {
		return subject_IV_GL;
	}
	public void setSubject_IV_GL(String subject_IV_GL) {
		this.subject_IV_GL = subject_IV_GL;
	}
	public String getSubject_IV_GP() {
		return subject_IV_GP;
	}
	public void setSubject_IV_GP(String subject_IV_GP) {
		this.subject_IV_GP = subject_IV_GP;
	}
	public String getSubject_V_CH() {
		return subject_V_CH;
	}
	public void setSubject_V_CH(String subject_V_CH) {
		this.subject_V_CH = subject_V_CH;
	}
	public String getSubject_V_GL() {
		return subject_V_GL;
	}
	public void setSubject_V_GL(String subject_V_GL) {
		this.subject_V_GL = subject_V_GL;
	}
	public String getSubject_V_GP() {
		return subject_V_GP;
	}
	public void setSubject_V_GP(String subject_V_GP) {
		this.subject_V_GP = subject_V_GP;
	}
	public String getSubject_VI_CH() {
		return subject_VI_CH;
	}
	public void setSubject_VI_CH(String subject_VI_CH) {
		this.subject_VI_CH = subject_VI_CH;
	}
	public String getSubject_VI_GL() {
		return subject_VI_GL;
	}
	public void setSubject_VI_GL(String subject_VI_GL) {
		this.subject_VI_GL = subject_VI_GL;
	}
	public String getSubject_VI_GP() {
		return subject_VI_GP;
	}
	public void setSubject_VI_GP(String subject_VI_GP) {
		this.subject_VI_GP = subject_VI_GP;
	}
	public String getSubject_VII_CH() {
		return subject_VII_CH;
	}
	public void setSubject_VII_CH(String subject_VII_CH) {
		this.subject_VII_CH = subject_VII_CH;
	}
	public String getSubject_VII_GL() {
		return subject_VII_GL;
	}
	public void setSubject_VII_GL(String subject_VII_GL) {
		this.subject_VII_GL = subject_VII_GL;
	}
	public String getSubject_VII_GP() {
		return subject_VII_GP;
	}
	public void setSubject_VII_GP(String subject_VII_GP) {
		this.subject_VII_GP = subject_VII_GP;
	}
	public String getSubject_VIII_CH() {
		return subject_VIII_CH;
	}
	public void setSubject_VIII_CH(String subject_VIII_CH) {
		this.subject_VIII_CH = subject_VIII_CH;
	}
	public String getSubject_VIII_GL() {
		return subject_VIII_GL;
	}
	public void setSubject_VIII_GL(String subject_VIII_GL) {
		this.subject_VIII_GL = subject_VIII_GL;
	}
	public String getSubject_VIII_GP() {
		return subject_VIII_GP;
	}
	public void setSubject_VIII_GP(String subject_VIII_GP) {
		this.subject_VIII_GP = subject_VIII_GP;
	}
	public String getSubject_IX_CH() {
		return subject_IX_CH;
	}
	public void setSubject_IX_CH(String subject_IX_CH) {
		this.subject_IX_CH = subject_IX_CH;
	}
	public String getSubject_IX_GL() {
		return subject_IX_GL;
	}
	public void setSubject_IX_GL(String subject_IX_GL) {
		this.subject_IX_GL = subject_IX_GL;
	}
	public String getSubject_IX_GP() {
		return subject_IX_GP;
	}
	public void setSubject_IX_GP(String subject_IX_GP) {
		this.subject_IX_GP = subject_IX_GP;
	}
	public String getSubject_X_CH() {
		return subject_X_CH;
	}
	public void setSubject_X_CH(String subject_X_CH) {
		this.subject_X_CH = subject_X_CH;
	}
	public String getSubject_X_GL() {
		return subject_X_GL;
	}
	public void setSubject_X_GL(String subject_X_GL) {
		this.subject_X_GL = subject_X_GL;
	}
	public String getSubject_X_GP() {
		return subject_X_GP;
	}
	public void setSubject_X_GP(String subject_X_GP) {
		this.subject_X_GP = subject_X_GP;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getSubject_I_SC() {
		return subject_I_SC;
	}
	public void setSubject_I_SC(String subject_I_SC) {
		this.subject_I_SC = subject_I_SC;
	}
	public String getSubject_II_SC() {
		return subject_II_SC;
	}
	public void setSubject_II_SC(String subject_II_SC) {
		this.subject_II_SC = subject_II_SC;
	}
	public String getSubject_III_SC() {
		return subject_III_SC;
	}
	public void setSubject_III_SC(String subject_III_SC) {
		this.subject_III_SC = subject_III_SC;
	}
	public String getSubject_IV_SC() {
		return subject_IV_SC;
	}
	public void setSubject_IV_SC(String subject_IV_SC) {
		this.subject_IV_SC = subject_IV_SC;
	}
	public String getSubject_V_SC() {
		return subject_V_SC;
	}
	public void setSubject_V_SC(String subject_V_SC) {
		this.subject_V_SC = subject_V_SC;
	}
	public String getSubject_VI_SC() {
		return subject_VI_SC;
	}
	public void setSubject_VI_SC(String subject_VI_SC) {
		this.subject_VI_SC = subject_VI_SC;
	}
	public String getSubject_VII_SC() {
		return subject_VII_SC;
	}
	public void setSubject_VII_SC(String subject_VII_SC) {
		this.subject_VII_SC = subject_VII_SC;
	}
	public String getSubject_VIII_SC() {
		return subject_VIII_SC;
	}
	public void setSubject_VIII_SC(String subject_VIII_SC) {
		this.subject_VIII_SC = subject_VIII_SC;
	}
	public String getSubject_IX_SC() {
		return subject_IX_SC;
	}
	public void setSubject_IX_SC(String subject_IX_SC) {
		this.subject_IX_SC = subject_IX_SC;
	}
	public String getSubject_X_SC() {
		return subject_X_SC;
	}
	public void setSubject_X_SC(String subject_X_SC) {
		this.subject_X_SC = subject_X_SC;
	}
	public String getSubject_I_FM() {
		return subject_I_FM;
	}
	public void setSubject_I_FM(String subject_I_FM) {
		this.subject_I_FM = subject_I_FM;
	}
	public String getSubject_II_FM() {
		return subject_II_FM;
	}
	public void setSubject_II_FM(String subject_II_FM) {
		this.subject_II_FM = subject_II_FM;
	}
	public String getSubject_III_FM() {
		return subject_III_FM;
	}
	public void setSubject_III_FM(String subject_III_FM) {
		this.subject_III_FM = subject_III_FM;
	}
	public String getSubject_IV_FM() {
		return subject_IV_FM;
	}
	public void setSubject_IV_FM(String subject_IV_FM) {
		this.subject_IV_FM = subject_IV_FM;
	}
	public String getSubject_V_FM() {
		return subject_V_FM;
	}
	public void setSubject_V_FM(String subject_V_FM) {
		this.subject_V_FM = subject_V_FM;
	}
	public String getSubject_VI_FM() {
		return subject_VI_FM;
	}
	public void setSubject_VI_FM(String subject_VI_FM) {
		this.subject_VI_FM = subject_VI_FM;
	}
	public String getSubject_VII_FM() {
		return subject_VII_FM;
	}
	public void setSubject_VII_FM(String subject_VII_FM) {
		this.subject_VII_FM = subject_VII_FM;
	}
	public String getSubject_VIII_FM() {
		return subject_VIII_FM;
	}
	public void setSubject_VIII_FM(String subject_VIII_FM) {
		this.subject_VIII_FM = subject_VIII_FM;
	}
	public String getSubject_IX_FM() {
		return subject_IX_FM;
	}
	public void setSubject_IX_FM(String subject_IX_FM) {
		this.subject_IX_FM = subject_IX_FM;
	}
	public String getSubject_X_FM() {
		return subject_X_FM;
	}
	public void setSubject_X_FM(String subject_X_FM) {
		this.subject_X_FM = subject_X_FM;
	}
	public String getSubject_I_OB() {
		return subject_I_OB;
	}
	public void setSubject_I_OB(String subject_I_OB) {
		this.subject_I_OB = subject_I_OB;
	}
	public String getSubject_II_OB() {
		return subject_II_OB;
	}
	public void setSubject_II_OB(String subject_II_OB) {
		this.subject_II_OB = subject_II_OB;
	}
	public String getSubject_III_OB() {
		return subject_III_OB;
	}
	public void setSubject_III_OB(String subject_III_OB) {
		this.subject_III_OB = subject_III_OB;
	}
	public String getSubject_IV_OB() {
		return subject_IV_OB;
	}
	public void setSubject_IV_OB(String subject_IV_OB) {
		this.subject_IV_OB = subject_IV_OB;
	}
	public String getSubject_V_OB() {
		return subject_V_OB;
	}
	public void setSubject_V_OB(String subject_V_OB) {
		this.subject_V_OB = subject_V_OB;
	}
	public String getSubject_VI_OB() {
		return subject_VI_OB;
	}
	public void setSubject_VI_OB(String subject_VI_OB) {
		this.subject_VI_OB = subject_VI_OB;
	}
	public String getSubject_VII_OB() {
		return subject_VII_OB;
	}
	public void setSubject_VII_OB(String subject_VII_OB) {
		this.subject_VII_OB = subject_VII_OB;
	}
	public String getSubject_VIII_OB() {
		return subject_VIII_OB;
	}
	public void setSubject_VIII_OB(String subject_VIII_OB) {
		this.subject_VIII_OB = subject_VIII_OB;
	}
	public String getSubject_IX_OB() {
		return subject_IX_OB;
	}
	public void setSubject_IX_OB(String subject_IX_OB) {
		this.subject_IX_OB = subject_IX_OB;
	}
	public String getSubject_X_OB() {
		return subject_X_OB;
	}
	public void setSubject_X_OB(String subject_X_OB) {
		this.subject_X_OB = subject_X_OB;
	}
	
	
	
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	
	
	
	
	
	
	

}
