package com.github.hcsp.objectbasic;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        System.out.println(new Date().getTime());
        double[] d = new double[1000000000];
        List<Object> array = new ArrayList<>();
        try{
            while (true) {
            array.add(d);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}

