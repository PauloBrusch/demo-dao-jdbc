package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department department = new Department(3, "Books");
        System.out.println(department);

        Seller seller = new Seller(21, "Bob","bob@gmail.com", new Date(),3000.0, department);
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();
    }

}
