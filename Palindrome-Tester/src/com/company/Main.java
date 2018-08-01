package com.company;
import java.io.*;



public class Main {
    public static void main(String[] args) {

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/MuhammedMagdyTaha/Desktop/input_file.txt"));
            String line;
            while( (line = bufferedReader.readLine()) != null) {
                if(!line.trim().isEmpty())
                    Tokenize_line(line);
            }
        }catch(IOException ioException){
            System.out.println("Error with reading file: " + ioException.getMessage());
        }
    }

    public static void Tokenize_line(String inLine){

        String[] splited = inLine.split("\\s+");
        for( int i = 0 ; i < splited.length ; i++) {
            if (check_palindrome(splited[i])) {
                System.out.println(splited[i] + " is palindrome");
            }
        }
    }

    public static boolean check_palindrome(String checkWord){

        int directIterator = 0;
        int reverseIterator = checkWord.length()-1;

        while( reverseIterator > directIterator){
            if( checkWord.charAt(reverseIterator) != checkWord.charAt(directIterator) ){
                return false;
            }
            reverseIterator--;
            directIterator++;
        }
        return true;
    }
}
