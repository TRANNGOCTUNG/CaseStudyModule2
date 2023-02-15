package test;

import java.io.Serializable;

public class Student implements  Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String address;
    private int age;

    public void Student() {}

    public Student(int id, String name, String address, int age) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
