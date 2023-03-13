package com.elsie.Assignment;

public class SuperDepartment {
	public String departmentName() {
		String departmentName="Super Department";
		System.out.println("Department name:"+departmentName);
		return departmentName;
	}
	public String getTodaysWork() {
		String TodaysWork ="No work as of today";
		System.out.println("Today's work:"+TodaysWork);
		return TodaysWork;
	}
	public String getWorkDeadline() {
		String Deadline="Nil";
		System.out.println("Work's deadline:"+Deadline);
		return Deadline;

	}
	public String isTodayaHoliday() {
		String HolidayStatus="Today is not a holiday";
		System.out.println("Holiday status:"+HolidayStatus);
		return HolidayStatus;
		
	}

}
