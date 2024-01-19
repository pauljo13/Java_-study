package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 ( 2차원 배열 )

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3 x 5 2차원 배열
        String[][] seat = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
        };
        // B2
        System.out.println(seat[1][1]);
        // C5
        System.out.println(seat[2][4]);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(seat[i][j]+ " ");
            }
            System.out.println();
        }

        // 배열의 크기가 다른 2차원 배열
        String[][] seat2 ={
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // A3
        System.out.println(seat2[0][2]);
        // 없는 것에 접근하면??
        // System.out.println(seat2[0][5]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        //	at chap_05._03_MultiArray.main(_03_MultiArray.java:42)

        // 3차원 ( 세로 x 가로 x 높이 )
        String[][][]  marray = {
                {{"A1"},{"A2"},{"A3"}},
                {{"B1"},{"B2"},{"B3"}},
                {{"C1"},{"C2"},{"C3"}},
        };
        System.out.println(marray[0][1][0]);
    }
}
