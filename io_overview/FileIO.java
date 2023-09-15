//package io_overview;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args){
        readFile();
        writeFile();
        renameFile();
        deleteFile();
    }

    public static void deleteFile(){
        System.out.println(
            "------------\nDeleting file\n---------------"
        );
        File toDelete = new File("delete.txt");
        if(toDelete.delete()){
            System.out.println("Deleted!");
        } else{
            System.out.println("Couldn't delete");
        }
    }

    public static void renameFile(){
        System.out.println(
            "------------\nRenaming file\n---------------"
        );
        File src = new File("rename.txt");
        File dest = new File("new_name.txt");
        if(src.renameTo(dest)){
            System.out.println("Renamed!");
        } else{
            System.out.println("Couldn't rename");
        }
    }

    public static void writeFile(){
        System.out.println(
            "------------\nWriting file\n---------------"
        );
        Scanner in = new Scanner(System.in);
        FileWriter out = null;
        File file = new File("to_write.txt");
        try{
            file.createNewFile();
            System.out.println("File created!");
        } catch(IOException e){
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("Enter what you want to write");

        try{
            out = new FileWriter(file);
        } catch(IOException e){
            e.printStackTrace();
            System.exit(1);
        }

        while(in.hasNextLine()){
            String line = in.nextLine();
            try{
                out.write(line + "\n");
            } catch(IOException e){
                e.printStackTrace();
                System.exit(1);
            }
        }
        in.close();
        try{
            out.close();
        } catch(IOException e){
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void readFile(){
        Scanner scan = null;
        try{
            scan = new Scanner(new File("input.txt"));
        } catch(FileNotFoundException e){
            e.printStackTrace();
            System.exit(1);
        }
        int lineCount = 0;
        int wordCount = 0;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            lineCount++;
            wordCount += line.split("[\t\n ]+").length;
        }
        System.out.println("Words and lines in input.txt\n----------------");
        System.out.println(
            String.format(
                "%d lines\n%d words",
                lineCount, wordCount
            )
        );
    }
}
