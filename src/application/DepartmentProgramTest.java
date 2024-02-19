package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class DepartmentProgramTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Find By Id ===");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("=== Find All ===");
        List<Department> departments = departmentDao.findAll();
        departments.forEach(System.out::println);

        System.out.println("=== Insert ===");
        Department newDdepartment = new Department(null, "Bikes");
        departmentDao.insert(newDdepartment);

        System.out.println("=== Update ===");
        department = departmentDao.findById(5);
        department.setName("Motorcycles");
        departmentDao.update(department);
        System.out.println("Update Completed");

        System.out.println("=== Delete ===");
        System.out.print("Enter de id for delete: ");
        int id = scanner.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deleted completed");

    }
}
