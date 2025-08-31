/*

Q1. Private Constructor

Create a class "DatabaseConnection" with a private constructor so that no one can directly create its object.
Instead, provide a static method "getInstance()" that returns only one object (Singleton design).

Expected behavior : -

DatabaseConnection d1 = DatabaseConnection.getInstance();
DatabaseConnection d2 = DatabaseConnection.getInstance();
System.out.println(d1 == d2);  // should print true


*/

class DatabaseConnection{

    private static DatabaseConnection instance;
    
    private DatabaseConnection(){
        System.out.println("Database connection created");
    }

    static DatabaseConnection getInstane(){
        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    
}


public class a_18_4 {
    public static void main(String[] args) {
        DatabaseConnection d1 = DatabaseConnection.getInstane();
        DatabaseConnection d2 = DatabaseConnection.getInstane();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1 == d2);
    }
}
