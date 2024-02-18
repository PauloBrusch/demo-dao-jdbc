package application;

import model.entities.Department;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Program {

    public static void main(String[] args) {

        Department department = new Department(3, "Books");
        System.out.println(department);
    }

}
