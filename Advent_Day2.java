import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Advent_Day2 {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/Day1Input");
        int count = 0;
        for(int i = 0; i < fileData.size(); i++){
            String x = fileData.get(i);
            for(int j = 0; j < fileData.get(i).length(); j++){
                int one = Integer.parseInt(x.substring(i, i++));
                int two = Integer.parseInt(x.substring(i++, i+2));
                if(one - two == 1 || one - two == 2 || one - two == 3){
                    count++;
                }
                else if () {
                    
                }
            }
        }
        System.out.println(fileData.get(0));
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