package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findById ===");
		Department dep1 = departmentDao.fidById(2);
		System.out.println(dep1);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		
		
		System.out.println("\n=== TEST 3: department insert ===");

		
		System.out.println("\n=== TEST 4: department update ===");
		
		
		System.out.println("\n=== TEST 5: department delete ===");


		sc.close();
	}


}