package ch13_map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_MapBasic {
    public static void main(String[] args) {
        //Key: 정수 (int), Value : String
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "안녕");
        map1.put(2, "hello");

        // map1.put(3, 100); // value 타입 불일치
        // map1.put("4", "안녕하세요"); // key 타입 불일치

        //key가 1인 데이터 꺼내기
        map1.get(1);
        //꺼내고 나타내기까지
        System.out.println(map1.get(1));
        String s1 = map1.get(2);
        System.out.println("s1 = " + s1);
        map1.put(100, "ㅎㅎㅎㅎ");
        //동일한 키에 다른 데이터를 넣는다면?

        map1.put(1, "안녕하십니까");
        System.out.println(map1.get(1));

        //반복문으로 접근

        for(Integer i : map1.keySet()) {
            System.out.println("i = " + i);
        }

        //key String value String
        Map<String, String> map2 = new HashMap<>();
        map2.put("가", "안녕");
        map2.put("아", "ㅎㅎㅎ");
        map2.put("a", "zzz");
        System.out.println(map2.get("a"));

        //반복문

        for(String i2 : map2.keySet()){
            System.out.println("i2 = " + i2);

        }

        Map<Long, String> map3 = new HashMap<>();
        String ss1 = map3.put(1L, "안녕");
        System.out.println("ss1=" + ss1);
        String ss2 = map3.put(2L, "hello");
        System.out.println("ss1=" + ss2);
        String ss3 = map3.put(2L, "곤니찌와");
        System.out.println("ss1=" + ss3);






    }
}
