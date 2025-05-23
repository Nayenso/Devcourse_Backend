package com.back;

//명언 문제
public class Main {
    public static void main(String[] args) {
        //1단계
//        Scanner sc = new Scanner(System.in);
//        System.out.println("== 명언 앱 ==");
//        System.out.print("명령) ");
//
//
//        while(true){
//            String wd = sc.next();
//            if(wd.equals("종료")){
//                System.out.println("명령) "+ wd);
//                return;
//            }
//        }

        //2단계
//        Scanner sc = new Scanner(System.in);
//        sc = new Scanner(System.in);
//
//        System.out.println("== 명언 앱 ==");
//        System.out.print("명령) ");
//        String op = sc.nextLine();
//
//        if(op.equals("등록")){
//            System.out.print("명언 : ");
//            String word = sc.next();
//            sc.nextLine();
//            System.out.print("작가 : ");
//            String wr = sc.next();
//            sc.nextLine();
//        }
//        System.out.print("명령) ");
//        String op2 = sc.nextLine();
//        if(op2.equals("종료")){
//            return;
//        }

        //3단계
//        Scanner sc = new Scanner(System.in);
//        int cnt = 0;
//        System.out.println("== 명언 앱 ==");
//        while(true){
//            System.out.print("명령) ");
//            String op = sc.nextLine();
//            if(op.equals("등록")){
//                System.out.print("명언 : ");
//                String wd = sc.next();
//                sc.nextLine();
//                System.out.print("작가 : ");
//                String rt = sc.next();
//                sc.nextLine();
//                cnt++;
//            }
//            if(op.equals("종료")){
//                return;
//            }
//            System.out.println(cnt+"번 명언이 등록되었습니다");
//        }

        //4단계
//        Scanner sc = new Scanner(System.in);
//        System.out.println("== 명언 앱 ==");
//        int index = 0;
//
//        while(true){
//            System.out.print("명령) ");
//            String op = sc.next();
//            sc.nextLine();
//            if(op.equals("등록")){
//                System.out.print("명언 : ");
//                String wd = sc.next();
//                sc.nextLine();
//                System.out.print("작가 : ");
//                String rt = sc.next();
//                sc.nextLine();
//                index++;
//                System.out.println(index+"번 명언이 등록되었습니다.");
//            }else if(op.equals("종료")){
//                return;
//            }
//        }

        //5단계
//        Scanner sc = new Scanner(System.in);
//        System.out.println("== 명언 앱 ==");
//        wordclass[] p = new wordclass[100];
//        int indexlast = -1;
//
//        while(true){
//            System.out.print("명령) ");
//            String op = sc.nextLine().trim();
//            if(op.equals("목록")){
//                if(indexlast==-1){
//                    System.out.println("등록된 명언이 없습니다.");
//                    continue;
//                }
//                System.out.println("번호 / 작가 / 명언");
//                for(int i=indexlast; i>=0; i--){
//                    System.out.println(p[i].id + " / " + p[i].author + " / " + p[i].writer);
//                }
//            }else if(op.equals("등록")){
//                System.out.print("명언 : ");
//                String wd = sc.nextLine().trim();
//                System.out.print("작가 : ");
//                String at = sc.nextLine().trim();
//                wordclass wc = new wordclass();
//                p[++indexlast] = wc;
//
//                wc.id = indexlast+1;
//                wc.author = at;
//                wc.writer = wd;
//                System.out.println((indexlast+1)+"번 명언이 등록되었습니다.");
//            }else if(op.equals("종료")){
//                return;
//            }
//        }

        //6단계
//        Scanner sc = new Scanner(System.in);
//        System.out.println("== 명언 앱 ==");
//        int index = 0;
//        wordclass[] p = new wordclass[100];
//
//        while(true){
//            System.out.print("명령) ");
//            String op = sc.nextLine().trim();
//
//            if(op.equals("종료")){
//                return;
//            }else if(op.equals("목록")){
//                if(index==0){
//                    System.out.println("등록된 명언이 없습니다.");
//                    continue;
//                }
//                System.out.println("번호 / 작가 / 명언");
//                System.out.println("----------------------");
//                for(int i=index-1; i>=0; i--){
//                    System.out.println(p[i].id + " / " + p[i].author + " / " + p[i].writer);
//                }
//
//            }else if(op.equals("등록")){
//                System.out.print("명언 : ");
//                String wd = sc.nextLine().trim();
//                System.out.print("작가 : ");
//                String rt = sc.nextLine().trim();
//
//                wordclass temp = new wordclass();
//                temp.id = index+1;
//                temp.author = rt;
//                temp.writer = wd;
//
//                p[index++] = temp;
//                System.out.println(index+"번 명언이 등록되었습니다.");
//            }else if(op.substring(0,2).equals("삭제")){
//                int idx = Integer.parseInt(op.substring(6));
//                for(int i=0; i<index; i++){
//                    if(p[i].id ==idx){
//                        for(int j=i; j<index-1; j++){
//                            p[j] = p[j+1];
//                        }
//                        index--;
//                        System.out.println(idx+"번 명언이 삭제되었습니다.");
//                        break;
//                    }
//                }
//            }
//        }
    }
}