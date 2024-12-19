import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Advent_Day5 {
    public static void main(String[] args) {
        ArrayList<String> fileData = getFileData("src/Day1Input");
        ArrayList<String> Vincent = getFileData("src/Day1Example");
        ArrayList<String> nums = new ArrayList<>();
        for(int i = 0; i < fileData.size(); i++){
            nums.add(fileData.get(i).substring(0, fileData.get(i).indexOf("|")));
            nums.add(fileData.get(i).substring(fileData.get(i).indexOf("|") +1));
        }
        System.out.println(nums);
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
