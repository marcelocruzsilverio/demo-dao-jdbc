package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: seller insert ===");
        Department department = new Department(null, "Music");
        departmentDao.insert(department);
        System.out.println("Inserted! New id = " + department.getId());










        sc.close();
    }
}
