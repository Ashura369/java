public class primitivaAndNonPrimitive {
    public static void main(String[] args) {
        int age = 25; // primitive type (int)
        char grade = 'A'; // primitive type (char)
        boolean isPassed = true; // primitive type (boolean)
        float temperature = 36.6f; // Note the 'f' at the end

        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);
        System.out.println("Body Temperature: " + temperature);
        System.err.println();

        String name = "Alice"; // non-primitive type (String)
        int[] scores = { 90, 85, 78 }; // non-primitive type (Array)

        System.out.println("Name: " + name);
        System.out.println("Scores: ");
        for (int score : scores) {
            System.out.println(score);
        }

    }
}
