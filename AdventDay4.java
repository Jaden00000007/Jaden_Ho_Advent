import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdventDay4 {
    public static void main(String[] args) {
        ArrayList<String> fileData = getFileData("src/Day1Input");
        int count = 0;
        for(int i = 0; i < fileData.size(); i++){
            String row = fileData.get(i);
            for(int j = 0; j < row.length(); j++){
                if(row.charAt(j) == 'X'){
                    if(row.length() - j > 4){
                        if(row.charAt(j+1) == 'M' && row.charAt(j+2) == 'A' && row.charAt(j+3) == 'S'){
                            count++;
                        }
                    }
                    if(j > 4){
                        if(row.charAt(j-1) == 'M' && row.charAt(j-2) == 'A' && row.charAt(j-3) == 'S'){
                            count++;
                        }
                    }
                    if(fileData.size() - i > ){
                        if(row.charAt(i+1) == 'M' && row.charAt(i+2) == 'A' && row.charAt(i+3) == 'S'){
                            count++;
                        }
                    }
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
