package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the story: ");
        String story = scanner.nextLine().trim();

        // created a try catch block for buffer reader
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(story));

            String line;
            int count = 1;
            //add while loop to continue reading the lines in the file
            while((line = fileReader.readLine()) != null){
                System.out.println(count + ". "+ line);
                count++;
            }


        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }

