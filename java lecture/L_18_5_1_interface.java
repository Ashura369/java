// here it is same like abstraction   ✅
// (Correct: interface is similar to abstraction — it also provides a blueprint)

// here if you try to declare it, will throw error bcoz once you declare "interface" in your class, 
// then every method declared inside it wil be invalid and will throw error. 
// The error will happen while calling the object  ❌
// (methods inside an interface are NOT invalid. They are valid but are **implicitly abstract**.  
// The error happens only when you try to instantiate the interface directly.)

interface animal { // when using interface you can't write (interface class animal) ✅
// (Correct: you just write "interface animal", not "interface class animal")
    
    void walk();   // ✅ (Valid, implicitly abstract & public in interface) // MAKE SURE IT MUST NOT HAVE A BODY

    animal(){      // ❌ ERROR
                   // You CANNOT write constructors inside an interface.
                   // Interfaces cannot have constructors because they cannot be instantiated.
    }
}


public class L_18_5_1_interface {
    public static void main(String[] args) {
        animal a1 = new animal();
        
    }
}
