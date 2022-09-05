package com.raiseup.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewFeatures {



    public static List<String>fileToList(String filepath) throws FileNotFoundException {
        List<String> output= new ArrayList<>();
        try(BufferedReader br= new BufferedReader(new FileReader(filepath))){
            String line;
            while ((line=br.readLine())!=null){
                List<String> strings = Arrays.stream(line.split(",")).toList();
                strings.forEach(output::add);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return output;
    }

}
