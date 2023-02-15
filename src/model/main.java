package model;

public class main {
    public static void main(String[] args) {
        Product product = new Product();
        product.displayProduct();
       Company company = new Company();
       company.displayCompany();
       Customer customer = new Customer();
       customer.displayCustomer();
       InputWarehouse inputWarehouse = new InputWarehouse();
       inputWarehouse.displayInputWarehouse();
       OutputWarehouse outputWarehouse = new OutputWarehouse();
       outputWarehouse.displayOutputWarehouse();
       Bill bill = new Bill();
       bill.displayBill();

    }
}
