package dev.syntax.step01variables;

public class Practice {

    public static void main(String[] args) {
        // 쿠팡에서 사과(값) 7개를 주문했다. 주문한 사과를 냉장고(메모리)에 보관해보자

        // 1. 먼저 사과를 담을 박스(변수) apples를 만든다.
        int apples;
        // 2. 박스에 사과를 담는다.
        apples = 7;

        // 3. 프로그램을 실행하여 냉장고 내부의 사과의 개수를 확인해보자 -> 변수 apples를 출력하는 코드를 작성합니다.
        System.out.println(apples);

        // 생각해 볼 문제
        // 아래 두 줄의 코드는 서로 어떤 차이가 있을까?
        System.out.println(apples);
        System.out.println(7);
    }
}
