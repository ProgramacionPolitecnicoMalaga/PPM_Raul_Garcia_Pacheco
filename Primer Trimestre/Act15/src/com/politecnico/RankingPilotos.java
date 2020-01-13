package com.politecnico;

import java.io.*;
import java.util.ArrayList;

public class RankingPilotos {

public static ArrayList<String[]> pilotos = new ArrayList<>();

    public static void readData() throws IOException {
        int count = 0;
        String file = "Pilotos.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {

                pilotos.add(line.split(","));

                String[][] v = (String[][]) pilotos.toArray(new String[pilotos.size())]]];

            }
        } catch (FileNotFoundException e) {

        }
    }

    public static void main(String[] args) throws IOException {
       readData();
        System.out.println(pilotos.toString());
    }
}
