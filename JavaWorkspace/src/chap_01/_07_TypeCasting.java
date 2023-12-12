package chap_01;

import java.util.SplittableRandom;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형 -> 실수형
        // 살수형 -> 정수형

        // 예시
        // int score =  93 + 98.9; //에러 발생

        // int -> float or double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0


        // float and double -> int
        float score_f = 93.3F;
        double score_d = 98.8;

        System.out.println(score_f); //93.3
        System.out.println((int)score_f); //93
        System.out.println(score_d); //98.8
        System.out.println((int)score_d); //98

        // 정수 + 실수 연선
        score = 93 + (int)98.8;
        System.out.println(score); //191

        score_d = (double)93 + 98.8; //191.8
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어 넣기
        double convertedScoreDouble = score;
        // int -> long -> float -> double (자동 형변환)
        int convertedScoreInt = (int)score_d;
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println(s1); //93
        s1 = Integer.toString(93);
        System.out.println(s1); //93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        int error = Integer.parseInt("Java");
        System.out.println(error);
    }
}
