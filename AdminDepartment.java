package com.elsie.Assignment;

public class AdminDepartment extends SuperDepartment{
	public String departmentName() {
		String departmentName="Admin Department";
		System.out.println("Department name:"+departmentName);
		return departmentName;
	}
	public String getTodaysWork() {
		String todaysWork="Complement your document submission";
		System.out.println("Today's work is "+todaysWork);
		return todaysWork;
	}
	public String getWorkDeadline() {
		String deadline="Complete by EOD";
		System.out.println("Deadline of the work is "+deadline);
		return deadline;
	}

}
