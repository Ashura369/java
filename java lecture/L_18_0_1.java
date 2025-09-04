class Demo{
    Demo(){}
    
    int max(int a, int b){
        return (a > b) ? a : b; // this here is a simple if else statement
    }
}


public class L_18_0_1 {
    public static void main(String[] args) {
        int x = new Demo().max(12, 23);
        System.out.println(x);

        Demo y = new Demo();
        System.out.println(y.max(52, 25));
    }
}
