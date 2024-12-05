import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Advent_Day2 {
    public static void main(String[] args) {
        ArrayList<String> fileData = getFileData("src/Day1Example");
        int count = 0;
        for(int i = 0; i < fileData.size(); i++){
            String[] x = fileData.get(i).split(" ");
            int length = x.length;
            for(int j = 0; j < length--; j++){
                int one = Integer.parseInt(x[j]);
                int two = Integer.parseInt(x[j+1]);
                boolean increasing = false;
                boolean decreasing  = false;
                boolean safe = true;
                if(one > two){
                    decreasing = true;
                }
                else if(two > one){
                    increasing  = true;
                }
                else{
                    safe = false;
                }
                if(decreasing && one - two == 1 || one - two == 2 || one - two == 3){

                }
            }
        }
        System.out.println(count);
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
