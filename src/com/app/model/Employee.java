package com.app.model;

public class Employee {
private int empNo;
private String empName;
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
@Override
public String toString() {
	return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
}

}
