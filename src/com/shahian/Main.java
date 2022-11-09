package com.shahian;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        stringBuffer();
        System.out.println("**********StringBuilder vs StringBuffer Performance**********");
        stringBuilder();

    }

    private static void stringBuilder() {
        System.gc();
        long startTime=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<10000000;i++){
            stringBuilder.append(":").append(i);
        }
        long endTime=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("time Taken for StringBuilder:" + (endTime - startTime));
        System.out.println("memory Used for StringBuilder:" + (endMemory - startMemory));
    }

    private static void stringBuffer() {
        System.gc();
        long startTime=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<10000000;i++){
            stringBuffer.append(":").append(i);
        }
        long endTime=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("time Taken for StringBuffer:" + (endTime - startTime));
        System.out.println("memory Used for StringBuffer:" + (endMemory - startMemory));
    }
}
