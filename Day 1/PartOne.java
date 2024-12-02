import java.util.*;
import java.io.*;

public class PartOne {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int distance = 0;

        // Read in file
        String fileName = "inputs.txt";
        File file = new File(fileName);
        Scanner fileIn = new Scanner(file);

        // Add elements into the first list
        while(fileIn.hasNext()) {
            String num = fileIn.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(num + " ");

            list1.add(Integer.parseInt(tokenizer.nextToken()));
            list2.add(Integer.parseInt(tokenizer.nextToken()));
        }

        list1.sort(Collections.reverseOrder());
        list2.sort(Collections.reverseOrder());


        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) > list2.get(i)) {
                distance += list1.get(i) - list2.get(i);
            }
            else if(Objects.equals(list1.get(i), list2.get(i))) {
                distance += 0;
            } else {
                distance += list2.get(i) - list1.get(i);
            }
        }

        fileIn.close();
        System.out.println("ANSWER: " + distance);
    }
}
