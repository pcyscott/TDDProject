package com.ll;

import com.ll.domain.system.controller.SystemController.SystemController;
import com.ll.domain.wise.controller.WiseController;

import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private final SystemController systemController;
    private final WiseController wiseController;
    public App(Scanner scanner) {
        this.scanner = scanner;
        this.systemController = new SystemController();
        this.wiseController = new WiseController(scanner);
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                systemController.actionExit();
                break;
            }
            else if(cmd.equals("등록")){
                wiseController.actionAdd();

            }
        }

    }
}
