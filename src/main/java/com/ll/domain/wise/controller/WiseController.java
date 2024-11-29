package com.ll.domain.wise.controller;

import com.ll.domain.wise.entitiy.WiseSaying;
import com.ll.domain.wise.service.WiseService;

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

        WiseSaying wises = wiseService.add(wise,author);

        System.out.println(wises.getId() + "번 명언이 등록되었습니다.");
    }

    public void actionList() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");

        List<WiseSaying> wiseSayings = wiseService.findAll();

        for (WiseSaying wiseSaying : wiseSayings.reversed()) {
            System.out.println(wiseSaying.getId() + " / " + wiseSaying.getAuthor() + " / " + wiseSaying.getWise());
        }


    }

    public void actionDelete(String cmd) {
        String[] cmds = null;
        int id = 0;
        try{
            cmds = cmd.split("\\? ");
            id = Integer.parseInt(cmds[1].split("=")[1]);
       }
       catch (Exception e){
           System.out.println("명령어를 잘못 입력하셨습니다.");
           return;
       }

        boolean removed = wiseService.deleteById(id);

        /*if(!removed){
            System.out.println(id+"번 명언은 존재하지 않습니다.");
        }*/

        System.out.println(id+"번 명언이 삭제되었습니다.");
    }
}
