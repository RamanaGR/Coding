package com.edu.tmobile;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TmobileTest {
    private static final String SHEET_NAME = "Sheet1";
    private static String TESTDATA_SHEET_PATH = System.getProperty("user.dir") + "/src/main/resources/Partially.xlsx";
    private static Workbook book;
    private static Sheet sheet;

    private static Object[][] getTestData(String sheetName) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            //Workbook
            assert file != null;
            book = WorkbookFactory.create(file);
        } catch (InvalidFormatException | IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet("Sheet1");
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        // System.out.println(sheet.getLastRowNum() + "--------" +
        // sheet.getRow(0).getLastCellNum());
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                //System.out.println(data[i][k]);
            }
        }
        //System.out.println(data);
        return data;
    }

    @DataProvider
    public Object[][] getContactTestData() {
        return TmobileTest.getTestData(SHEET_NAME);
    }
    //csv - comma seperated values- abu,mondal,inno -- OpenCSV lib

    @Test(dataProvider = "getContactTestData")
    public void method(String device, String tac, String volte, String lte_fdd, String lte) {
        System.out.println(device + " - " + tac + " - " + volte + " - " + lte_fdd + " - " + lte);
    }

//    public static void main(String[] args) {
//        TmobileTest.getTestData("Sheet1");
//    }
}
