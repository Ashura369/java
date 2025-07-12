/* there are 4 major operations in bit manipulation
    1/ get bit
    2/ set bit
    3/ clear bit
    4/ update bit

*/

public class L_11_0_bitManipulation {
    public static void main(String[] args) {
        // getBit

            // get the 3rd bit (position = 2) of a number n. (n = 0101) [here you have to move the numbers by two positon to the left]
            // bit mask: 1 << i 
            // operation: AND
        
        int a = 9;
        int bitMask = 1 << 2;

        if ((a & bitMask) != 0) {
            System.out.println("THE THIRD BIT (POSITION 2) IS 1");
        }else{
            System.out.println("THE THIRD BIT (POSITION 2) IS 0");
        }

        // showing the binary values
        System.out.println("*******************************************************************************************");
        System.out.println("Binary of a:      " + Integer.toBinaryString(a));
        System.out.println("Binary of mask:   " + Integer.toBinaryString(bitMask));
        System.out.println("Binary of result: " + Integer.toBinaryString(a & bitMask));
        System.out.println("*******************************************************************************************");
        
        setBit();
        clearBit();
        updateBit();
    }

    public static void setBit() {
        // setBit
        
        // set the 2nd bit (position = 1) of a number n. 
        // bitMask: 1 << i
        // operation: OR
        
        int n = 9; // Binary: 1001
        int position = 1; // We want to set the 2nd bit (index 1)
        
        int bitMask = 1 << position; // 1 shifted left by 1 → 0010 (binary for 2)
        
        int newNumber = n | bitMask; // Apply OR to set the bit
        
        // Output
        System.out.println("Original number (decimal): " + n);
        System.out.println("Original number (binary):  " + Integer.toBinaryString(n));
        System.out.println("Bitmask (binary):           " + Integer.toBinaryString(bitMask));
        System.out.println("New number (decimal):       " + newNumber);
        System.out.println("New number (binary):        " + Integer.toBinaryString(newNumber));;
        System.out.println("*******************************************************************************************");

    }

    public static void clearBit() {
        // clearBit
            // clear the 3rd bit (position = 2) of a number n. 
            // bitMask: 1 << i
            // operation: AND with NOT(~)
        
        int n = 9;
        int bitMask = n << 2;

        int newNumber = n & ~bitMask;

        System.out.println("Original number (decimal): " + n);
        System.out.println("Original number (binary):  " + Integer.toBinaryString(n));
        System.out.println("Bitmask to clear:           " + Integer.toBinaryString(bitMask));
        System.out.println("Inverted bitmask:           " + Integer.toBinaryString(~bitMask));
        System.out.println("New number (decimal):       " + newNumber);
        System.out.println("New number (binary):        " + Integer.toBinaryString(newNumber));
        System.out.println("*******************************************************************************************");
    }

    public static void updateBit() {
        // updateBit
            // update the 2nd bit (position = 1) of a number n to 1
            // for 1
                // bitMask: 1 << i
                // operation: AND with NOT
            
            // for 0
                // bitMask: 1 << i
                // operation: OR
        
        int n = 8; // Binary: 1000
        int position = 1; // 2nd bit (index = 1)

        // --- Update the bit to 1 ---
        int bitMaskSet = 1 << position;        // 1 << 1 = 0010
        int updatedTo1 = n | bitMaskSet;       // 1000 | 0010 = 1010
        System.out.println("Updated to 1: " + updatedTo1 + " (Binary: " + Integer.toBinaryString(updatedTo1) + ")");

        // --- Update the bit to 0 ---
        int bitMaskClear = 1 << position;      // 1 << 1 = 0010
        int updatedTo0 = n & (~bitMaskClear);  // 1000 & 1101 = 1000
        System.out.println("Updated to 0: " + updatedTo0 + " (Binary: " + Integer.toBinaryString(updatedTo0) + ")");
        System.out.println("*******************************************************************************************");
    

    }
}
