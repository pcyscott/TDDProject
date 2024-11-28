package com.ll.domain.wise.controller;

import com.ll.domain.wise.entitiy.Wise;
import com.ll.domain.wise.service.WiseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseController {
    private final Scanner scanner;
    private final WiseService wiseService;

    public WiseController(Scanner scanner) {
        this.scanner = scanner;
        this.wiseService = new WiseService();
    }

    public void actionAdd(){
        System.out.println("명언 : ");
        String wise = scanner.nextLine();
        System.out.println("작가 : ");
        String author  = scanner.nextLine();

        Wise wises = wiseService.add(wise,author);

        System.out.println(wises.getId() + "번 명언이 등록되었습니다.");
    }

    public void actionList() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");

        List<Wise> wises = wiseService.finaAll();

        for (Wise wise : wises.reversed()) {
            System.out.println(wise.getId() + " / " + wise.getAuthor() + " / " + wise.getWise());
        }


    }
}
