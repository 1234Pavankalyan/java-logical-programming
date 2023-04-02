/* 1. Write a Java program to get a list of all files/directory names from the given path using File class object.*/
import java.io.*;
public class FilesDirectory {

    public static void main(String args[]) {
String k="/home/runner/Fast-Track-Java-aryanKumar89/FileHandlingUsingByteStreams_Assignment-1234Pavankalyan/Folder";
    File directory = new File(k);
    // Get the list of file and directory names in the directory
    String [] fileList = directory.list();
    // Print the file and directory names
    for (String fileName : fileList) {
      System.out.println(fileName);
}
}
}

