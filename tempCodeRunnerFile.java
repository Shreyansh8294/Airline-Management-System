public class CheckProgram {
    boolean x;

    public static void main(String[] args) {
        CheckProgram checkProgram = new CheckProgram(); // Creating an instance of CheckProgram
        if (checkProgram.x == false) {
            System.out.println("CSE");
        } else {
            System.out.println("CGU"); // Changed 'CGU' to "CGU"
        }
    }
}
