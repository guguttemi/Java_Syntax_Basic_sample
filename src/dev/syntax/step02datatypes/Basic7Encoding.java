package dev.syntax.step02datatypes;

public class Basic7Encoding {
    public static void main(String[] args) {
        // 컴퓨터에서 모든 값들은 결국 0과 1인 byte로 처리되는데, 문자는 어떻게 처리되는 것일까?
        // Java에서 작성한 char 타입은?
        char firstLetter = 'A';
        System.out.println(firstLetter);

        // 저장된 문자는 메모리 상에 결국 숫자(정수)로 변환됨
        int castedValue = (int)firstLetter;
        System.out.println(castedValue); // 문자 A의 ASCII코드는 65

        // ASCII코드 값인 65를 직접 저장해도 결과값은 동일
        char sameWithCastedValue = 65;
        System.out.println(sameWithCastedValue); // A가 출력됨

        // 7.
    }
}