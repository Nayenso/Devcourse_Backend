package com.back;

import java.util.Scanner;
//명언 1번 문제
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        System.out.print("명령) ");


        while(true){
            String wd = sc.next();
            if(wd.equals("종료")){
                System.out.println("명령) "+ wd);
                return;
            }
        }

    }
}