package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        GeneratePOJO.createPojoFromCsvHeader(new File("D:\\app-of-elements\\app\\src\\main\\res\\model resources\\elements.csv"),
                "D:\\app-of-elements\\app\\src\\main\\java\\com\\example\\periodictable\\model\\Element.java",
                "model",
                "Element");
    }
}
