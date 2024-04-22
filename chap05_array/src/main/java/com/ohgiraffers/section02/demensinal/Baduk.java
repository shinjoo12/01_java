package com.ohgiraffers.section02.demensinal;


import java.util.Scanner;

public class Baduk {
    public static void main(String[] args){
        Baduk baduk = new Baduk();
        baduk.baduck();
    }
    public void baduck(){
        String[][] board = new String[19][19];  //바둑판 만들기 위한 base


        //반복문 (반복을 해서 바둑판 틀 만들기)
        for (int i = 0; i < board.length; i++) { //string[19]까지만 진행
            for (int j = 0; j < board[0].length; j++) { //length는 19만큼
                board[i][j] = "[ ]";
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        //게임하는 로직 짜기
        String play = "";
        Scanner scanner = new Scanner(System.in);
        int[] index = new int[2];   //첫번째 좌표
        int turn = 0;   //turn교체(차례)
        while (!play.equals("exit")){
            System.out.print("첫 번째 좌표를 입력해주세요 : ");
            index[0] = scanner.nextInt();
            System.out.println("두 번째 좌표를 입력해주세요 : ");
            index[1] = scanner.nextInt();

            if(board[index[0]][index[1]].equals("[ ]")){ //비어있는지 확인// 공백이면
                if(turn % 2 == 0){
                    board[index[0]][index[1]] = "[흑]";
                }else{
                    board[index[0]][index[1]] = "[백]";
                }
            }else{
                System.out.println("같은 위치에 바둑돌을 놓을 수 없습니다.");
                turn += 2;   //다시 turn 주기위해
                continue;
            }

            for (int i = 0; i < board.length; i++) {  //바둑돌 둔 위치 보여주기위해
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            turn++;


        }
    }

}
