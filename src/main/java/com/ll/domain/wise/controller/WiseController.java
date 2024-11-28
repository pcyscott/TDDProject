package com.ll.domain.wise.controller;

import java.util.Scanner;

public class WiseController {
    private final Scanner scanner;
    public WiseController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void actionAdd(){
        System.out.println("명언 : ");
        System.out.println("작가 : ");
        System.out.println("1번 명언이 등록되었습니다.");
    }
}
