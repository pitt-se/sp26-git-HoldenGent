public class CommitCafe {

    private static String barista = "Holden";
    private static String nickname = "Hold"; // nickname for the barista

    private static int cups = 0;

    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        cups++;
        System.out.println(barista + " brewed a cup of " + drink + ". Total cups brewed: " + cups);
        
        // STUDENT_TODO_2B: Add a second brew-related improvement
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " (aka " + nickname + ") brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}