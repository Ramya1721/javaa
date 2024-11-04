

public class Prg1 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int count = 1;  // Start count at 1
            if (!args[i].equals(" ")) {  // Check if the argument has not already been processed
                for (int j = i + 1; j < args.length; j++) {
                    if (args[i].equals(args[j])) {
                        count++;  // Increment count if a duplicate is found
                        args[j] = " ";  // Mark the duplicate as processed
                    }
                }
                System.out.println(args[i] + ":" + count);  // Print the element and its count
            }
        }
    }
}
