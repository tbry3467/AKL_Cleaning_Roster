/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akl_cleaning_roster;

import java.io.*;
import java.util.*;

/**
 *
 * @author S537321
 */
public class AKL_Cleaning_Roster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // var establishment
        ArrayList<String> Members = new ArrayList<>();
        
        File inFile = new File("C:\\Users\\S537321\\Documents\\School\\Personal Projects\\AKLMemberNames.txt");
        Scanner scanIn = new Scanner(inFile);
        
        FileWriter outFile = new FileWriter("C:\\Users\\S537321\\Documents\\School\\Personal Projects\\ houseCleaningJobs.txt");
        
        Random rando = new Random();
        
        ArrayList<String> firstBathroom = new ArrayList<>();
        ArrayList<String> secondBathroom = new ArrayList<>();
        ArrayList<String> sanitize = new ArrayList<>();
        ArrayList<String> kitchen = new ArrayList<>();
        ArrayList<String> trash = new ArrayList<>();
        ArrayList<String> attic = new ArrayList<>();
        ArrayList<String> eagleNest = new ArrayList<>();
        ArrayList<String> chapterRoom = new ArrayList<>();
        ArrayList<String> oddJobs = new ArrayList<>();
        ArrayList<String> noJob = new ArrayList<>();
        ArrayList<String> firstFloorSweep = new ArrayList<>();
        ArrayList<String> firstFloorSwiffer = new ArrayList<>();
        ArrayList<String> secondFloorSweep = new ArrayList<>();
        ArrayList<String> secondFloorSwiffer = new ArrayList<>();

        // read from inFile, add all names to ArrayList
        while (scanIn.hasNext()){
            String line = scanIn.next();
            Members.add(line);
        }
        
        // go thru each item in Members, assign them to job
        for (String item : Members){
            
            int randoNum = rando.nextInt(13) + 1;
           
            for (int x = 0; x < 2; x++){
                
                if (randoNum == 1)
                    if (firstBathroom.size() == 3)
                        randoNum+=1;
                    else {  
                        firstBathroom.add(item);
                        break; 
                    }
            
                if (randoNum == 2)
                    if (secondBathroom.size() == 3)
                            randoNum+=1;
                    else {
                        secondBathroom.add(item);
                        break;
                    }

                if (randoNum == 3)
                    if (sanitize.size() == 3)
                        randoNum+=1;
                    else {
                        sanitize.add(item);
                        break;
                    }

                if (randoNum == 4)
                    if (kitchen.size() == 4)
                        randoNum+=1;
                    else {
                        kitchen.add(item);
                        break;
                    }

                if (randoNum == 5)
                    if (trash.size() == 3)
                        randoNum+=1;
                    else {
                        trash.add(item);
                        break;
                    }

                if (randoNum == 6)
                    if (attic.size() == 3)
                        randoNum+=1;
                    else {
                        attic.add(item); 
                        break;
                    }

                if (randoNum == 7)
                    if (eagleNest.size() == 2)
                        randoNum+=1;
                    else {
                        eagleNest.add(item);
                        break;
                    }

                if (randoNum == 8)
                    if (chapterRoom.size() == 1)
                        randoNum+=1;
                    else {
                        chapterRoom.add(item);
                        break;
                    }

                if (randoNum == 9)
                    if (oddJobs.size() == 5)
                        randoNum+=1;
                    else {
                        oddJobs.add(item);
                        break;
                    }
                
                if (randoNum == 10)
                    if (firstFloorSweep.size() == 1)
                        randoNum+=1;
                    else {
                        firstFloorSweep.add(item);
                        break;
                    }
                
                if (randoNum == 11)
                    if (firstFloorSwiffer.size() == 1)
                        randoNum+=1;
                    else {
                        firstFloorSwiffer.add(item);
                        break;
                    }
                
                if (randoNum == 12)
                    if (secondFloorSweep.size() == 1)
                        randoNum+=1;
                    else {
                        secondFloorSweep.add(item);
                        break;
                    }
                
                if (randoNum == 13)
                    if (secondFloorSwiffer.size() == 1)
                        randoNum = 1;
                    else {
                        secondFloorSwiffer.add(item);
                        break;
                    }
                
                if (x == 1)
                    noJob.add(item);
                }
        }
        
        // writing the jobs to the outFile
        outFile.write("1st floor bathroom (3 people recommended):\n");
        for (String item : firstBathroom)
            outFile.write(item + "\n");
        
        outFile.write("\n2st floor bathroom (3 people recommended):\n");
        for (String item : secondBathroom)
            outFile.write(item + "\n");
        
        outFile.write("\nSanitize job (3 people recommended):\n");
        for (String item : sanitize)
            outFile.write(item + "\n");
        
        outFile.write("\nKitchen (4 people recommended):\n");
        for (String item : kitchen)
            outFile.write(item + "\n");
        
        outFile.write("\nTake the trash out (3 people recommended):\n");
        for (String item : trash)
            outFile.write(item + "\n");
        
        outFile.write("\nAttic (3 people recommended):\n");
        for (String item : attic)
            outFile.write(item + "\n");
        
        outFile.write("\nEagles Nest: (2 people recommended):\n");
        for (String item : eagleNest)
            outFile.write(item + "\n");
        
        outFile.write("\nChapter room (1-man job):\n");
        for (String item : chapterRoom)
            outFile.write(item + "\n");
        
        outFile.write("\nFirst floor hallway - sweep (1-man job):\n");
        for (String item : firstFloorSweep)
            outFile.write(item + "\n");
        
        outFile.write("\nFirst floor hallway - swiffer (1-man job)\n");
        for (String item : firstFloorSwiffer)
            outFile.write(item + "\n");
        
        outFile.write("\nSecond floor hallway - sweep (1-man job):\n");
        for (String item : secondFloorSweep)
            outFile.write(item + "\n");
        
        outFile.write("\nSecond floor hallway - swiffer (1-man job)\n");
        for (String item : secondFloorSwiffer)
            outFile.write(item + "\n");
        
        outFile.write("\nOdd jobs (5 people recommended):\n");
        for (String item : oddJobs)
            outFile.write(item + "\n");
        
        outFile.write("\nThese people don't have jobs - assign them at your discretion\n");
        for (String item : noJob)
            outFile.write(item + "\n");
        
        outFile.close();
    }
}
