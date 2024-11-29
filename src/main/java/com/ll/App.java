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

            String[] cmdBits = cmd.split("\\?");
            String actionName = cmdBits[0];
            if ("종료".equals(actionName)) {
                systemController.actionExit();
                break;
            }
            else if("등록".equals(actionName)){
                wiseController.actionAdd();
            }
            else if("목록".equals(actionName)){
                wiseController.actionList();
            }
            else if("삭제".equals(actionName)){
                wiseController.actionDelete(cmd);
            }
        }

    }
}
