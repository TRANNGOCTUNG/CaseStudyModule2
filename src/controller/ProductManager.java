package controller;

import model.CRUD;
import model.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements CRUD<Product> {
    public static int index = 0;
    private ArrayList<Product> listProducts;
    public ProductManager() {
        listProducts = new ArrayList<>();
    }
    public ArrayList<Product> getListProducts () {
        return listProducts;
    }
    public String pathProduct = "src/fileSave/Production";
    @Override
    public Product create(Scanner scanner) {
//        int number;
//        if (listProducts.isEmpty()) {
//            number = index + 1;
//        } else {
//            number = listProducts.get(listProducts.size() - 1).getNumber() + 1;
//        }
//        System.out.println("Enter product code: ");
//        String code = scanner.nextLine();
        return null;
    }

    @Override
    public void add(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Scanner scanner) {

    }

    @Override
    public void displayAll(List<Product> list) {

    }

    @Override
    public void outputFile(File path) {

    }

    @Override
    public void inputFile(File path) {

    }
}
