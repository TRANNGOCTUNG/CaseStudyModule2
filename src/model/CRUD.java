package model;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public interface CRUD <E> {
    E create(Scanner scanner);
     void add(E e);
     void update(E e);
     void delete(Scanner scanner);
     void displayAll(List<E> list);
     void outputFile(File path);
     void inputFile(File path);
}
