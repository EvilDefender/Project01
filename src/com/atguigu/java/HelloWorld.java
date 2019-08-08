package com.atguigu.java;

public class HelloWorld {

    private static int num;
    public static final int NUM = 1;

    /**
     * asdf
     */
    private int as;
/**
 * asdf
 */
private String asdf;




    public static void main(String[] args) {
        //region Description
        num = 10;

        try {
            getPrintln();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //endregion

    }

    public static void getPrintln() {
        System.out.println("Hello World!");
    }
}
