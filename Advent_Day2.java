import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Advent_Day2 {
    public static void main(String[] args) {
        ArrayList<String> fileData = getFileData("src/Day1Input");
        int Tcount = 0;
        for (int i = 0; i < fileData.size(); i++) {
            String[] x = fileData.get(i).split(" ");
            boolean increase = false;
            boolean decrease = false;
            boolean safe = false;
            boolean first = false;
            int count = 0;
            for (int j = 0; j < x.length-1; j++) {
                int one = Integer.parseInt(x[j]);
                int two = Integer.parseInt(x[j + 1]);
                if (one - two < 0 && !first) {
                    increase = true;
                    first = true;
                }
                else if (one - two > 0 && !first) {
                    decrease = true;
                    first = true;
                }
                if (increase && (one - two < 0) && (one - two >= -3)) {
                    safe = true;
                }
                else if (decrease && (one - two > 0) && (one - two <= 3)) {
                    safe = true;
                }
                if(safe){
                    count++;

                }
                safe = false;
            }
            if (count == x.length-1) {
                System.out.println(fileData.get(i));
                Tcount++;
            }
        }
        System.out.println(Tcount);
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
