package dev.syntax.step02datatypes;

public class Basic2IntegerType {
    public static void main(String[] args) {
        // Data type 총 정리
        // 2. 정수형(양의 정수, 0, 음의 정수)

        // 2-1. 정수형 타입의 종류, 왼쪽부터 값을 담을 수 있는 크기가 작음
        // byte, short, int(주로 사용, 사용 권장), long

        byte a = 127; // 허용되는 가장 큰 값 할당, 허용 범위 : ~128 ~ 127, 2의 8제곱(256)
        short b = -32768; // 허용되는 가장 작은 값 할당, 허용 범위 : -32768 ~ 32767
        int c = 0; // 0 할당, 허용 범위 : 약 20억, ☆ 정수형을 사용할 때 주로, 기본으로 사용하는 타입
//        long d = 20000000000; // 허용 범위 : 2의 약 63제곱,
//         error : Integer number too large
        // 2의 63제곱이면 200억은 허용해야 하는데, 에러가 발생한다. 왜 그럴까?
        // -> int가 정수형에서 기본 타입으로 사용되기 때문에 작성한 200억은 int형으로 인식되지만, int의 값을 벗어났기 때문에 발생.
        // 참조 링크 : https://stackoverflow.com/questions/36372709/why-dont-we-need-suffix-on-long-in-java
        long d = 20000000000L; // long 타입임을 의미하는 접미사(suffix) l 혹은 L을 작성해야함.
        // 소문자 l은 숫자 1과 혼동될 수 있어서, 대문자 L 사용을 권장.
        long e = 20_000_000_000L; // Java 7버전 부터 리터럴 중간에 구분자 _(Underbar) 작성 가능, 가독성 향상

        // 2-2. 각각의 값들을 출력
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        // 2-3. 특정 타입이 허용할 수 있는 값의 범위보다 큰 값을 할당할 경우 어떻게 될까? 오버플로우와 언더플로우

        // 2-4. Q. 현실에서 정수형의 기본 타입 int의 허용 범위인 20억을 넘는 숫자를 사용하는 케이스가 있을까?

    }
}
