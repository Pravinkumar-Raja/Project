package com.ust.ocs.dao;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.ust.ocs.bean.AppointmentBean;
import com.ust.ocs.bean.DoctorBean;
import com.ust.ocs.bean.PatientBean;
import com.ust.ocs.service.Administrator;

public class AdministratorDao implements Administrator{

	@Override
	public String addDoctor(DoctorBean doctoerBean) {
		
		return null;
	}

	@Override
	public Boolean modifyDoctor(DoctorBean doctorBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DoctorBean> viewAllDoctors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeDoctor(String doctorID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<DoctorBean> suggestDoctors(String patientId, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<PatientBean, AppointmentBean> viewPatientsByDate(Date appointmentDate) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		AdministratorDao a=new AdministratorDao();
		DoctorBean d=new DoctorBean();
		
		String id=JOptionPane.showInputDialog("Enter the Doctor Id");
		d.setDoctorID(id);
		String name=JOptionPane.showInputDialog("Enter the name of the Doctor");
		d.setDoctorName(name);
//		Date dob,joining;
//		try {
//			dob = new SimpleDateFormat("dd-mm-yyyy").parse(JOptionPane.showInputDialog("Enter the Date of Birth (DD-MM-YYYY"));
//			d.setDateOfBirth(dob);
//			joining = new SimpleDateFormat("dd-mm-yyyy").parse(JOptionPane.showInputDialog("Enter the Date of Birth (DD-MM-YYYY"));
//			d.setDateOfJoining(joining);
//
//		} catch (HeadlessException | ParseException e) {
//			
//			e.printStackTrace();
//		}
		String dob = JOptionPane.showInputDialog("Enter the Date Of Birth (DD/MM/YYYY)");
		d.setDateOfBirth(dob);
		String join = JOptionPane.showInputDialog("Enter the Date of Joining");
		d.setDateOfJoining(join);
		String gender = JOptionPane.showInputDialog("Enter the Gender");
		d.setGender(gender);
		String q=JOptionPane.showInputDialog("Enter the Qualification");
		d.setQualification(q);
		String special=JOptionPane.showInputDialog("Enter the Specialization");
		d.setSpecialization(special);
		int yoe=Integer.parseInt(JOptionPane.showInputDialog("Enter the Years of Experience"));
		d.setYearsOfExperience(yoe);
		String street=JOptionPane.showInputDialog("Enter the Street");
		d.setStreet(street);
		String loc=JOptionPane.showInputDialog("Enter the location");
		d.setLocation(loc);
		String city=JOptionPane.showInputDialog("Enter the City");
		d.setCity(city);
		String state=JOptionPane.showInputDialog("Enter the State");
		d.setState(state);
		String pin=JOptionPane.showInputDialog("Enter the Pincode");
		d.setPincode(pin);
		String contact=JOptionPane.showInputDialog("Enter the contact No");
		d.setContactNumber(contact);
		String email=JOptionPane.showInputDialog("Enter the Email Id");
		d.setEmailID(email);
		
		System.out.println(d);
		
		
		
		
		
	}

}
