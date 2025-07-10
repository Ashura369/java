// delete a part of the string

public class a_9_10_deleteAPartOfTheString {
    public static void main(String[] args) {
        String sc = "I am a good boy.";

        StringBuilder sb = new StringBuilder(sc); // cna't directly use delete method over String, bcoz strings are immutable
        sb.delete(12, 15);
        System.out.println(sb);
    }
}
