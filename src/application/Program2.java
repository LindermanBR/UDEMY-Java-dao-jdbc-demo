package application;

import java.util.List;
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
		List<Department> departments = departmentDao.findAll();
		for(Department dep : departments) {
			System.out.println(dep);
		}
		
		System.out.println("\n=== TEST 3: department insert ===");
		Department dep2 = new Department(null, "Tools");
		departmentDao.insert(dep2);
		System.out.println("Inserted! new Id = " + dep2.getId());
		
		System.out.println("\n=== TEST 4: department update ===");
		dep1 = departmentDao.fidById(6);
		dep1.setName("Toys");
		departmentDao.update(dep1);
		System.out.println("Update Completed!");
		
		System.out.println("\n=== TEST 5: department delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed");

		sc.close();
	}


}
