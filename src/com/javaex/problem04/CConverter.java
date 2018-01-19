package com.javaex.problem04;

public class CConverter {
    
    public static double rate;
    
    public static void setRate(double r){ //달러환율값을 지정
        CConverter.rate = r;
    }
    public static double toDoller(double won){ //더블형으로 won을 받아 dollar로 계산
        return won / rate;
    }
    public static double toKWR(double dollar){ //더블형으로 dollar를 받아 won으로 계산
        return dollar * rate;
    }
}
