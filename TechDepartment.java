package com.elsie.Assignment;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		String departmentName="Tech department";
		System.out.println("Department name:"+departmentName);
		return departmentName;
	}
	public String getTodaysWork() {
		String todaysWork="Complete coding of module 1";
		System.out.println("Today's work is "+todaysWork);
		return todaysWork;
	}
	public String getWorkDeadline() {
		String Deadline="Complete by EOD";
		System.out.println("Deadline of the work is "+Deadline);
		return Deadline;
	}
	public String getTechStackInformation() {
		String TechStackInformation="Core Java";
		System.out.println("Tech Stack Information:"+TechStackInformation);
		return TechStackInformation;
	}

}
