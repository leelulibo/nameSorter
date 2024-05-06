package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: name-sorter <input-file>");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = "src\\main\\java\\org\\example\\sorted-names-list.txt";

        SortNames sorter = new SortNames();
        List<String> names = SortNames.readNamesFromFile(inputFileName);

        if (names.isEmpty()) {
            System.err.println("Error: No names found in the input file.");
            return;
        }

        sorter.sortNames(names);
        SortNames.writeNamesToFile(names, outputFileName);
    }
}// java
