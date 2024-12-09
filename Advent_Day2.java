import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Advent_Day2 {
    public static void main(String[] args) {
        ArrayList<String> fileData = getFileData("src/Day1Example");
        int Tcount = 0;
        for (int i = 0; i < fileData.size(); i++) {
            String[] x = fileData.get(i).split(" ");
            boolean increase = false;
            boolean decrease = false;
            int count = 0;
            int leng = x.length;
            for (int j = 0; j < leng--; j++) {
                int one = Integer.parseInt(x[j]);
                int two = Integer.parseInt(x[j + 1]);
                if (one - two < 0) {
                    increase = true;
                } else if (one - two > 0) {
                    decrease = true;
                }
                if (increase && one - two < 0 && one - two > -3) {
                    count++;
                } else if (decrease && one - two > 0 && one - two < -3) {
                    count++;
                    if (count == 5) {
                        Tcount++;
                    }
                }
            }
            System.out.println(count);
        }
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
