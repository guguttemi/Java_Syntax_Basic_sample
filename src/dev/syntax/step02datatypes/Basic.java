package dev.syntax.step02datatypes;

public class Basic {
    public static void main(String[] args) {
        // 1. 값의 타입(Data Types)

        // 1-1. 대표적인 기본(Primitive) 타입들, Primitive Types이라고 함
        int apples = 7;
        float eyesight = 1.5f; // Java float 타입은 뒤에 f를 명시함
        char initialLetter = 'Y'; // 단 한 글자의 '문자' 타입, 홑따옴표만 가능
        String name = "Yoo"; // 두 글자 이상의 문자'열' 타입, 쌍따옴표만 가능
        boolean isChecked = true;

        // 1-2. 각각의 값들을 출력
        System.out.println(apples);
        System.out.println(eyesight);
        System.out.println(initialLetter); // intelliJ 자동완성기능 활용하기
        System.out.println(name);
        System.out.println(isChecked);
    }
}
