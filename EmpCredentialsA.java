package com.greatlearninga.servicea;

import com.greatlearninga.model.Employeea;

public interface EmpCredentialsA {
	String generateEmailId(String fname,String lname,String dept);
	String generatePassword();
	void showDetails(Employeea e);


}
