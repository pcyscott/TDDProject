package com.ll.domain.wise.controller;

import com.ll.domain.wise.entitiy.Wise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseController {
    private final Scanner scanner;
    private int lastId;
    private List<Wise> wiseList;

    public WiseController(Scanner scanner) {
        this.scanner = scanner;
        this.lastId = 0;
        this.wiseList = new ArrayList<>();
    }

    public void actionAdd(){
        System.out.println("명언 : ");
        String wise = scanner.nextLine();
        System.out.println("작가 : ");
        String author  = scanner.nextLine();

        int id = ++lastId;
        Wise wises = new Wise(id, wise, author);
        wiseList.add(wises);

        System.out.println(id + "번 명언이 등록되었습니다.");
    }

    public void actionList() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");
        for (Wise wise : wiseList.reversed()) {
            System.out.println(wise.getId() + " / " + wise.getAuthor() + " / " + wise.getWise());
        }


    }
}
