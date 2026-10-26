package Structural.Proxy.Protection;

public class MySQL implements DB {


    @Override
    public void delete(String tableName){
        System.out.println("Deleting table "+tableName);
    };

    
}