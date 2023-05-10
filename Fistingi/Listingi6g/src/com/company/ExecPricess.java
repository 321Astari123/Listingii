package com.company;
import java.io.IOException;

public class ExecPricess {
    public static void main(String[] args) {
        try{
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}