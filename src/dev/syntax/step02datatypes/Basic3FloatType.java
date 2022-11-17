package dev.syntax.step02datatypes;

public class Basic3FloatType {
    public static void main(String[] args) {
        // 3. 실수형(부동소수점, floating point)

        // 3-1. 실수형 타입의 종류, 왼쪽부터 값을 담을 수 있는 크기가 작음
        // float, double(주로 사용, 사용 권장)
        // float a = 1.5; // 하단 problems 탭 확인, Incompatible types. Found: 'double', required: 'float'
        // -> 실수형의 기본 타입은 double이기 때문에 양립할 수 없다(?)고 나옴. 형 변환에서 설명 예정.
        float a = 1.5F; // 허용범위 :
        double b = 5.5;


        // Advanced
        // 타입 선택의 기준, 정밀도(Precision)
    }
}
