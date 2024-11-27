package com.ll;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //lab1();
        //lab2();
        lab3();
    }

    public static void lab1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("명령) ");
        String cmd= scanner.nextLine().trim();

        System.out.println("입력한 명령: "+cmd);
    }

    public static void lab2() {
        InputStream in = new ByteArrayInputStream("메롱".getBytes());
        Scanner scanner = new Scanner(in);

        System.out.print("명령) ");
        String cmd= scanner.nextLine().trim();
        System.out.println("입력한 명령: "+cmd);
    }

    public static void lab3() {
        System.out.println("==시작==");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        System.out.println("안녕하세요");
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        out.toString();
        System.out.println("끝");
        System.out.println("출력: "+out.toString());
        try {
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}