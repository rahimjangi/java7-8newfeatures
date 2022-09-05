package com.raiseup;

import com.raiseup.utils.NewFeatures;

import java.io.IOException;

public class RaiseUpApplication {
    public static void main(String[] args) throws IOException {
        String filePath="C:\\Users\\pc\\Desktop\\columns.csv";
        System.out.println(NewFeatures.fileToList(filePath));

    }


}
