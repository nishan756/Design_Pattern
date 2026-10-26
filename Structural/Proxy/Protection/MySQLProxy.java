package Structural.Proxy.Protection;

public class MySQLProxy implements DB {

    private final String username;

    private final DB db;

    public MySQLProxy(String username){
        this.username = username;
        this.db = new MySQL();
    }


    @Override 
    public void delete(String tableName){


        if( ! this.username.equals("nishan")){
            System.out.println("OOPS! Access Denied");
        }
        else{
            db.delete(tableName);
        }

    }
    
}