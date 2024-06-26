package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("\n=== TEST 1: department insert ===");
//        Department department = new Department(null, "Clothes");
//        departmentDao.insert(department);
//        System.out.println("Inserted! New id = " + department.getId());
//
//        System.out.println("=== TEST 2: department findById ===");
//        Department department1 = departmentDao.findById(5);
//        System.out.println(department1);
//
//        System.out.println("\n=== TEST 3: department update ===");
//        department1 = departmentDao.findById(5);
//        department1.setName("Game");
//        departmentDao.update(department1);
//        System.out.println("Update completed!");

        System.out.println("\n=== TEST 4: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department department2 : list) {
            System.out.println(department2);
        }

        System.out.println("\n=== TEST 5: department delete ===");
        System.out.println("Enter id to delete: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");




        sc.close();
    }
}
