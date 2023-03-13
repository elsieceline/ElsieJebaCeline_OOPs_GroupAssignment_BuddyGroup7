package com.elsie.Assignment.Driver;

import com.elsie.Assignment.AdminDepartment;
import com.elsie.Assignment.HrDepartment;
import com.elsie.Assignment.SuperDepartment;
import com.elsie.Assignment.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		HrDepartment obj1=new HrDepartment();
		obj1.departmentName();
		obj1.getTodaysWork();
		obj1.getWorkDeadline();
		obj1.doActivity();
		SuperDepartment obj4=new HrDepartment();
		obj4.isTodayaHoliday();
		System.out.println("------------------------------");
		
		AdminDepartment obj2=new AdminDepartment();
		obj2.departmentName();
		obj2.getTodaysWork();
		obj2.getWorkDeadline();
		SuperDepartment obj5=new AdminDepartment();
		obj5.isTodayaHoliday();
		System.out.println("------------------------------");
		
		TechDepartment obj3=new TechDepartment();
		obj3.departmentName();
		obj3.getTodaysWork();
		obj3.getWorkDeadline();
		obj3.getTechStackInformation();
		SuperDepartment obj6=new TechDepartment();
		obj6.isTodayaHoliday();
		System.out.println("------------------------------");
		
	}

}
