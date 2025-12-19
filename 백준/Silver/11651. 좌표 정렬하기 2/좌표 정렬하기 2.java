import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        문제
//        2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
//
//        출력
//        첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int[][] b =new int[a][2];

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            b[i][0]=Integer.parseInt(st.nextToken());
            b[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(b, (bx, by) -> {
            if (bx[1] == by[1]) {
                return bx[0] - by[0];
            }
            return bx[1] - by[1];
        });

        for (int i = 0; i < a; i++) {
            bw.write(b[i][0]+" "+ b[i][1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
