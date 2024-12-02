import java.util.*;
import java.io.*;

public class PartTwo {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        long distance = 0;

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
            long count = 0;
            for(int j = 0; j < list2.size(); j++) {
                if(list1.get(i).equals(list2.get(j))) {
                    count++;
                }
            }
            distance += list1.get(i) * count;
        }

        System.out.println("ANSWER: " + distance);
        fileIn.close();
    }
}
