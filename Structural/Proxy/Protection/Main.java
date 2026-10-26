package Structural.Proxy.Protection;

public class Main {

    public static void main(String[] args) {

        DB newDB = new MySQLProxy("Nabil");

        newDB.delete("Student");
    }
    
}