class car {
    String name;
    String model;
    String color;
    int maxSpeed;

    // Normal constructor
    car(String name, String model, String color, int maxSpeed){ // remember whenever you are calling a "constructor class", you must not mention it as the "PSUV" statement, bcoz it will be turned into a "method class"
        this.name = name;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // Copy constructor
    car(car copyCar){
        this.name = copyCar.name;
        this.model = copyCar.model;
        this.color = copyCar.color;
        this.maxSpeed = copyCar.maxSpeed;
    }

    // Copy with new model + maxSpeed, but keep name and color same
    car(car copyCar, String model, int maxSpeed){
        this.name = copyCar.name;     // keep same as c2
        this.color = copyCar.color;   // keep same as c2
        this.model = model;           // overwrite only model
        this.maxSpeed = maxSpeed;     // overwrite only speed
    }

    void print(){
        System.out.println();
        System.out.println("The car is " + name + ", of model " + model + " which is of color " + color + ", along with the max speed of " + maxSpeed);
    }

    void print2(){
        System.out.println();
        System.out.println("This car is a copy from " + name + " but with updated model " + model + " and max speed " + maxSpeed + " (color remains " + color + ")");
    }

    // Print comparison of two cars in one statement
    static void printBoth(car c2, car c3){
        System.out.println();
        System.out.println("Car 2 -- Name: " + c2.name + ", Model: " + c2.model + ", Color: " + c2.color + ", Speed: " + c2.maxSpeed +
                           "\nCar 3 -- Name: " + c3.name + ", Model: " + c3.model + ", Color: " + c3.color + ", Speed: " + c3.maxSpeed);
    }
} // ✅ closing car class properly
 

public class a_18_2_print {
    public static void main(String[] args) {  // ✅ FIX: Added main method

        car c1 = new car("Rolls Royce", "01", "white", 450);
        c1.print();

        car c2 = new car("BMW", "02", "black", 400);
        c2.print();

        // here i have made some changes into the c3, i wanted to keep the car name and color same as the c2. so i made the changes accordingly. (PLZ BE MINDFUL OF IT)
        // c3 will keep name+color from c2, but model=03 and speed=450
        car c3 = new car(c2, "03", 450); // here i have taken c2 as a single unit for name and color
        c3.print2();

        // Printing the values of the c2 and c3
        car.printBoth(c2, c3);
    }
}
