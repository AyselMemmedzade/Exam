package task.five;

    import java.util.*;

    public class Task5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> numbers = new ArrayList<>();
            System.out.println("Enter the numbers (one number per line, enter 'done' to finish):");
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                try {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Please try again.");
                }
            }
            int sum = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println("Sum of numbers: " + sum);
        }
    }
