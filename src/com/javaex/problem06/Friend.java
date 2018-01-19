//java.util.Scanner 클래스를 이용하여 친구정보를 입력받아 Friend 객체를 생성하고
//이들을 Friend 객체 배열에 저장
package com.javaex.problem06;

public class Friend {

    private String name;
    private String hp;
    private String school;

    public Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
	static public Friend getInstance(String info) {

		String infos[] = info.split(" ");

		Friend result = new Friend(infos[0], infos[1], infos[2]);
		return result;
	}
    public void showInfo() {
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }
}
