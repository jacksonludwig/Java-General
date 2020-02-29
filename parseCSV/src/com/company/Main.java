package com.company;

import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Element> elements = new ArrayList<>();
        ICsvBeanReader beanReader = null;
        try {
            beanReader = new CsvBeanReader(new FileReader("D:\\Java-General\\parseCSV\\src\\com\\company\\elements.csv"), CsvPreference.STANDARD_PREFERENCE);

            List<String> columnsToMap = Arrays.asList("fname", "telephone", "id");

            // read the CSV header (and set any unwanted columns to null)
            final String[] header = beanReader.getHeader(true);

            Element element;
            while ((element = beanReader.read(Element.class, header)) != null) {
                switch (element.getGroup()) {
                    case "1":
                        element.setChargeInCompound("1");
                        break;
                    case "2":
                        element.setChargeInCompound("2");
                        break;
                    case "13":
                        element.setChargeInCompound("3");
                        break;
                    case "15":
                        element.setChargeInCompound("-3");
                        break;
                    case "16":
                        element.setChargeInCompound("-2");
                        break;
                    case "17":
                        element.setChargeInCompound("-1");
                        break;
                    default:
                        element.setChargeInCompound("unknown");
                        break;
                }
                elements.add(element);
            }

        } finally {
            assert beanReader != null;
            beanReader.close();
        }
        elements.forEach(element -> System.out.println(element.getElement() + " " + element.getChargeInCompound()));
        FileOutputStream fos = new FileOutputStream("D:\\Java-General\\parseCSV\\src\\com\\company\\elements.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(elements);
    }
}
