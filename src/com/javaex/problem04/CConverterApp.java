package com.javaex.problem04;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70); //미리 지정되어있는 달러환율값
        
        //백만원을 달러로 출력
        System.out.println("백만원은 "+CConverter.toDoller(1000000)+"달러입니다.");

        //100달려를 원으로 출력
        System.out.println("백달러는 "+CConverter.toKWR(100)+"원입니다.");
    }
}
