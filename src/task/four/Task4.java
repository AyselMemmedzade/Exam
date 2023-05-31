package task.four;

    import java.util.*;
    public class Task4 {
        public static <T> Collection<T> getUniqueElements(Collection<T> elements) {
            return new HashSet<>(elements);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> elements = new ArrayList<>();
            System.out.println("Enter the elements (one element per line, enter 'done' to finish):");
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                elements.add(input);
            }
            Collection<String> uniqueElements = getUniqueElements(elements);
            System.out.println("Unique elements: " + uniqueElements);
        }
    }
