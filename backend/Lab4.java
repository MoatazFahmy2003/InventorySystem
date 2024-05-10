package backend;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lab4 {

    public static void main(String[] args) {
        TestClass t= new TestClass();
        t.testAdminRole();
        t.testEmployeeRole();
/*      Our testing for the code.
        EmployeeUser employee1 = new EmployeeUser("E2", "Adham", "Adham@mm.com", "Alexandria", "01234566");
        EmployeeUser employee2 = new EmployeeUser("E1", "Mohamedd", "mohamed@mm.com", "Cairo", "0125841");

        String filePath = "Employees.txt";
        System.out.println(employee1.lineRepresentation());
        EmployeeUserDatabase employeeDatabase1 = new EmployeeUserDatabase(filePath);
        employeeDatabase1.insertRecord(employee1);
        employeeDatabase1.insertRecord(employee2);
        System.out.println(employeeDatabase1.createRecordFrom("E3,Ramy,Ramy@mmm,Alexandria,01999999").lineRepresentation());

        employeeDatabase1.saveToFile();
        AdminRole adminRole = new AdminRole();
        adminRole.addEmployee("E4", "Mohamed", "Moahamed1@mm.com", "Cairo", "0147777");
        adminRole.removeEmployee("E1");
        adminRole.logout();
        String filePath1 = "Products.txt";

        String filepath2 = "CustomersProducts.txt";
        Product product1 = new Product("P88", "Nameproduct1", "Manufacturer1", "supplier1", 10, 2);
        Product product2 = new Product("P77", "Nameproduct2", "Manufacturer1", "supplier2", 20, 4);
        Product product3 = new Product("P66", "Nameproduct3", "Manufacturer1", "supplier3", 30, 12);
        Product product4 = new Product("P55", "Nameproduct4", "Manufacturer1", "supplier4", 40, 71);
        System.out.println(product1.lineRepresentation());
        
        ProductDatabase productDatabase = new ProductDatabase(filePath1);
        productDatabase.insertRecord(product1);
        productDatabase.insertRecord(product2);
        productDatabase.insertRecord(product3);
        productDatabase.insertRecord(product4);
        System.out.println(productDatabase.createRecordFrom("P44,Nameproduct5,Manufacturer5,supplier5,50,91").lineRepresentation());
        System.out.println(productDatabase.getRecord("P88").lineRepresentation());

        LocalDate date1 = LocalDate.of(2023, 10, 26);
        LocalDate date2 = LocalDate.of(2016, 11, 7);
        LocalDate date3 = LocalDate.of(2001, 1, 24);
        LocalDate date4 = LocalDate.of(1997, 9, 1);
        LocalDate date5 = LocalDate.of(2016, 11, 14);
        CustomerProduct customerProduct1 = new CustomerProduct("S123", "P88", date1);
        CustomerProduct customerProduct2 = new CustomerProduct("S456", "P77", date2);
        CustomerProduct customerProduct3 = new CustomerProduct("S789", "P66", date3);
        CustomerProduct customerProduct4 = new CustomerProduct("S321", "P55", date4);
        System.out.println(customerProduct3.lineRepresentation());

        CustomerProductDatabase customerProductDatabase = new CustomerProductDatabase(filepath2);

        customerProductDatabase.insertRecord(customerProduct1);
        customerProductDatabase.insertRecord(customerProduct2);
        customerProductDatabase.insertRecord(customerProduct3);
        customerProductDatabase.insertRecord(customerProduct4);
        System.out.println(customerProductDatabase.returnAllRecords().size());
        System.out.println(customerProductDatabase.createRecordFrom("S917,P10,17-10-2012").lineRepresentation());
        
        System.out.println(customerProductDatabase.getRecord("S456").lineRepresentation());

        customerProductDatabase.saveToFile();
        EmployeeRole employeeRole = new EmployeeRole();
        employeeRole.addProduct("P78", "Nameproduct6", "Manufacturer6", "supplier6", 59, 777);
        employeeRole.logout();
        if(employeeRole.purchaseProduct("S654", "55", date5))
        {
            System.out.println("done");
        }
        System.out.print(employeeRole.returnProduct("S456", "P77", date2, date5));*/

    }
}
