
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Advent_Day1 {
    public static void main(String[] args) {
        ArrayList<String> fileData = getFileData("src/Day1Input");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int distance = 0;
        for (int i = 0; i < fileData.size(); i++){
            String input = (fileData.get(i));
            String[] split_input = input.split("   ");
            String one = split_input[0];
            String two = split_input[1];
            list1.add(Integer.valueOf(one));
            list2.add(Integer.valueOf(two));
        }
        for (int i = 0; i < fileData.size(); i++){
            Collections.sort(list1);
            Collections.sort(list2);
            distance += Math.abs(list1.get(i) - list2.get(i));
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(distance);
    }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}