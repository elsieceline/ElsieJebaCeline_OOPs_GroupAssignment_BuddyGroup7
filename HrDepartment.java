package com.elsie.Assignment;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		String departmentName="HR department";
		System.out.println("Department name:"+departmentName);
		return departmentName;
	}
	public String getTodaysWork() {
		String todaysWork="Fill today's timesheet and mark your attendance";
		System.out.println("Today's work is "+todaysWork);
		return todaysWork;
	}
	public String getWorkDeadline() {
		String Deadline="Complete by EOD";
		System.out.println("Deadline of the work is "+Deadline);
		return Deadline;
	}
	public String doActivity() {
		String activity="Team Lunch";
		System.out.println("plan for "+activity);
		return activity;
	}
	
	

}
