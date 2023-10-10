package com.greatlearninga.servicea;

import java.util.Random;

import com.greatlearninga.model.Employeea;

public class EmpCredentialsAImplA implements EmpCredentialsA{

	@Override
	public String generateEmailId(String fname, String lname, String dept) {
		
		return fname+ lname +"@" + dept +".gl.com";
		
	
	}

	@Override
	public String generatePassword() {
		
	 String lower="abcdefghijklmnopqrstuvwxyz";
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String nums="1234567890";
		String splchars="!@#$%^&*()";
		String combined=caps+lower+nums+splchars; 
		String pass="";
		Random random=new Random();
		for(int i=0;i<8;i++)
		{
		pass=pass+String.valueOf(combined.charAt(random.nextInt(combined.length()))); 
		}
		return pass;




	}

	@Override
	public void showDetails(Employeea e) {
		System.out.println(e.getFname());
		System.out.println(e.getLname());
		System.out.println(e.getEmailid());
		System.out.println(e.getPassword());
	


		
	}

}
