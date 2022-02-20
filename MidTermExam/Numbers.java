package MidTermExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split( " "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("Finish")){
            String[] cmd = input.split(" ");
            input = scanner.nextLine();

            switch (cmd[0]){
                case"Add":
                    int addNum = Integer.parseInt(cmd[1]);
                    numbers.add(Integer.parseInt(cmd[1]));
                    break;
                case"Remove":
                    int removeNum = Integer.parseInt(cmd[1]);
                    numbers.remove(Integer.valueOf(removeNum));

                   // numbers.remove(removeNum);
                    break;
                case"Replace":
                    int numToReplace = Integer.parseInt(cmd[1]);
                    int replacement = Integer.parseInt(cmd[2]);
                    numbers.replaceAll(numToReplace->numToReplace.equals(replacement));

                    break;
                case"Collapse":
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",
                ""));
    }
}
