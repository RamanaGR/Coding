package com.edu.interview;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JSONParseJH {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParseJH jsonParseJH = new JSONParseJH();

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\Data.json"));
        JSONObject jsonObject = (JSONObject) obj;
        //System.out.println(jsonObject.toJSONString());

        String region = (String) jsonObject.get("region");
        System.out.println(region);
        String metro = (String) jsonObject.get("metro");
        System.out.println(metro);
        JSONObject ibx = (JSONObject) jsonObject.get("ibx");
        System.out.println(ibx.size());//AM3, AM4
//        Iterator iterator = ibx.iterator();
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//        }
        for(Iterator iterator = ibx.keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();
            JSONArray arr = (JSONArray) ibx.get(key);
            jsonParseJH.jsonParseMeth(arr);
        }
//        JSONArray am3 = (JSONArray) ibx.get("AM3");
//       // jsonParseJH.jsonParseMeth(am3);
//        JSONArray am4 = (JSONArray) ibx.get("AM4");
//       // jsonParseJH.jsonParseMeth(am4);

        // System.out.println(am3);

    }


    //JSONArray subjects = (JSONArray)jsonObject.get("Subjects");
    public void jsonParseMeth(JSONArray am3) {
        for (int i = 0; i <= am3.size() - 1; i++) {
            JSONObject obj1 = (JSONObject) am3.get(i);
            System.out.println(((JSONObject) am3.get(i)).toJSONString());
            System.out.println((String) obj1.get("ibx"));
            System.out.println((String) obj1.get("switchName"));
            System.out.println((String) obj1.get("cspName"));
            System.out.println(obj1.get("vlanCount"));
            System.out.println(obj1.get("usedBandwidth"));
            System.out.println((String) obj1.get("portName"));
            System.out.println((String) obj1.get("portPriority"));
            System.out.println(obj1.get("percentageAvailableBandwidth"));
            System.out.println(obj1.get("totalBandwidth"));
            System.out.println(obj1.get("availableBandwidth"));
            JSONArray physical = (JSONArray) obj1.get("physicalPortNames");
            for (Object phy : physical) {
                System.out.println(phy.toString());
            }
        }

    }
}

