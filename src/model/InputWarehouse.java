package model;

import java.io.Serializable;
import java.util.Date;

public class InputWarehouse implements Serializable {
    private int number;
    private Date date;
    private String code;
    private Company company;
    private int quantity;
    public InputWarehouse(){
        this.number = 0;
        this.date = new Date();
        this.code = "";
        this.company = new Company();
        this.quantity = 0;
    }

    public InputWarehouse(int number, Date date, String code, Company company, int quantity) {
        this.number = number;
        this.date = date;
        this.code = code;
        this.company = company;
        this.quantity = quantity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void displayInputWarehouse() {
        System.out.printf("%-10s%-30s%-20s%-20s%-20s%-30s%-20s%s",number,date,code,company,company.getProduct().getCode(),company.getProduct().getName(),company.getProduct().getType(),quantity +"\n");

    }
}
