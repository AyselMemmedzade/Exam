package task.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    public class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of strings: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            List<String> inputList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                inputList.add(scanner.nextLine());
            }
            List<String> outputList = new ArrayList<>();
            for (String str : inputList) {
                if (str.length() <= 3) {
                    outputList.add(str);
                }
            }
            System.out.println("Output: " + outputList);
        }
    }
