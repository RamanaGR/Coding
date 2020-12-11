package com.edu.interview;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.Arrays;

public class DataDriven {
    private static final String CSV_PATH = "C://Users//chinn//OneDrive//Desktop//DataCSV.csv";

    public static void main(String[] args) throws IOException {
        DataDriven dd = new DataDriven();
        dd.executeTXT();
        //dd.executeCSV();
    }

    public void executeTXT() {
        BufferedReader in = null;
        InputStreamReader inputStream = null;
        try {
            inputStream = new InputStreamReader(new FileInputStream("C://Users//chinn//OneDrive//Desktop//Partially.txt"));
            in = new BufferedReader(inputStream);
            String line = null;
            StringBuffer sb = new StringBuffer();;
            while ((line = in.readLine()) != null) {
                String[] data = line.split(" ");
                if (data.length >= 1) {
                    if ((!data[0].equals("DEVICE_MARKETING_NAME")) && (!data[0].equals("----------------------"))) {
                        for(int i = 0; i < data[0].length();i++){
                            //System.out.println(data[i]);
                            sb.append(data[i]);
                        }
                        System.out.println(sb);

//                        for (String actualValue : data) {
//                            System.out.print(Arrays.toString(actualValue.split(" ")));
//                        }
                    }
                    System.out.println();
                    //expectedvalue = data[1];
                    // System.out.println("Actual : " + actualvalue);
                    //System.out.println("Expected : " + expectedvalue);
//                    // for (int i = 0; i < 10; i++) { // same action multiple
//                    // times
//                    // Your CODE here
//                    driver.get(baseUrl + "/");
//                    driver.findElement(By.id("gbqfq")).sendKeys(actualvalue);
//                    driver.findElement(By.id("gbqfq")).sendKeys(Keys.RETURN);
//                    boolean b = driver.getPageSource().contains(expectedvalue);
//                    Assert.assertTrue(b);
//                    // }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void executeCSV() throws IOException {
        CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
        String[] csvCell;
        //while loop will be executed till the last line In CSV.
        while ((csvCell = reader.readNext()) != null) {
            String FName = csvCell[0];
            System.out.println(FName);
            //String LName = csvCell[1];
            //String Email = csvCell[2];
            //String Mob = csvCell[3];

        }
    }

}
