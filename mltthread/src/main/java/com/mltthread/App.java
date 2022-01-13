package com.mltthread;

/**
 * Hello world!
 */
public final class App {

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        while(true)
        {
            new Thread1(2).start();           
        }
    }


}
