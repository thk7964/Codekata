import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        문제
//        2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에 N 명의 학생들이 응시했다.
//        이들 중 점수가 가장 높은 k명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.
//        커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.
//
//        입력
//        첫째 줄에는 응시자의 수 N 과 상을 받는 사람의 수 k가 공백을 사이에 두고 주어진다.
//        둘째 줄에는 각 학생의 점수 x 가 공백을 사이에 두고 주어진다.
//
//        출력
//        상을 받는 커트라인을 출력하라.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        Integer[] value = new Integer[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {

            value[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays
                .stream(value)
                .sorted(Comparator.reverseOrder())
                .skip(f-1)
                .findFirst()
                .orElseThrow()
        );

    }
}
