package bank;

class account {
    public String name;
    String mail; // even if you dont write "public" here, it will have no affect on the output
    private String password;


    void print() {
        System.out.println(name+", "+mail);
    }

    // as we have used "private" in password, to access and assign the password to it, we have to use getters and setters using a function

        // getter
        String getPassword(){
            return this.password;
        }

        // setter
        void setPassword(String password){
            this.password = password;
        }

    void printPassword() {
        System.out.println(password);
    }
    
}

public class a_18_4_1 {

}
