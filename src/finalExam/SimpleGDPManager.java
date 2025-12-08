package finalExam;

import java.util.*;
public class SimpleGDPManager {
    public static void main(String[] args){
        Map<String,String> gdp=new HashMap<>();
        gdp.put("中国","14.14万亿");
        gdp.put("美国","21.43万亿");
        gdp.put("日本","5,15万亿");
        gdp.put("德国","3.86万亿");
        gdp.put("法国","2.71万亿");
        System.out.println("(1)初始GDP数据：");
        for(String country: gdp.keySet()){
            System.out.println(country +" " + gdp.get(country));

        }
        gdp.put("英国","2.83万亿");
        System.out.println("\n(2)已添加英国");
        System.out.println("\n(3)所有国家GDP：");
        for(String country: gdp.keySet()){
            System.out.println(country+""+gdp.get(country));
        }
    }
}
