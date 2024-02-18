package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Find By Id ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== Find By Department ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        sellers.forEach(System.out::println);

        System.out.println("=== Find All ===");
        sellers = sellerDao.findAll();
        sellers.forEach(System.out::println);

        System.out.println("=== Insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id = " + newSeller.getId());

        System.out.println("=== Update ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("update Completed");

        System.out.println("=== Delete ===");
        System.out.print("Enter de id for delete: ");
        int id = scanner.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Deleted completed");

        scanner.close();

    }

}
