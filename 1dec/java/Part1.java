package java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        List<Integer> vals = new ArrayList<>();
        try {
            File myObj = new File("input");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                vals.add(Integer
                .parseInt(myReader.nextLine()));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred,");
            e.printStackTrace();
        }
        

        int previous = vals.get(0);     
        int count = 0;
        for (int v : vals) {
            if (previous < v) {
                count++;
            }
            previous = v;
        }
        System.out.printf("Depth is: %d%n",count);
        
        List<Integer> windows = new ArrayList<>();

        for (int i = 0; i < vals.size() - 2; i++) {
            windows.add(vals.get(i)
                    + vals.get(i + 1)
                    + vals.get(i + 2));
        }
        
        previous = windows.get(0);     
        count = 0;
        for (int v : windows) {
            if (previous < v) {
                count++;
            }
            previous = v;
        }
        System.out.println(count);
    }










}