package lk.ijse;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws ClassNotFoundException {
        Employee employee = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Employee class not found");
            throw new RuntimeException(e);
        }

        System.out.println("Deserialized Employee..");
        System.out.println("Id :" + employee.id);
        System.out.println("Name :" + employee.name);
        System.out.println("Address :" + employee.address);
        System.out.println("Age :" + employee.age);
    }
}
