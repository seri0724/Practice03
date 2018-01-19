//“1.예금” 선택후 금액을 입력하면 예금액이 합산
//“2.출금” 선택후 금액을 입력하면 예금액이 차감
//“3.잔고” 선택시 현재 잔고가 출력
//“4.종료” 선택시 종료
//“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력
package com.javaex.problem07;

import java.util.Scanner;

public class AccountApp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int money;
        
        Account account = new Account("312-89562-123456");
        System.out.println("312-89562-123456 계좌가 개설되었습니다.");
        
        while(run) {
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택>");
            
            int menuNo = sc.nextInt();
            
            switch(menuNo) {
                case 1:
                    System.out.print("예금액>");
                    money = sc.nextInt();
                    account.deposit(money);
                    break;                
                case 2:
                    System.out.print("출금액>");
                    money= sc.nextInt();
                    account.withdraw(money);
                    break;                    
                case 3:
                    System.out.print("잔고액>");
                    account.showBalance();
                    break;                
                case 4:
                    System.out.print("프로그램 종료");
                    run = false;
                    break;                    
                default :
                    System.out.println("다시입력해주세요");
                    break;                    
            } //switch             
        } //while
        sc.close();
    }
}
