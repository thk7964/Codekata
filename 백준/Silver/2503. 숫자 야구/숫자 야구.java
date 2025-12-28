import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] question = new int[N];
        int[] strike = new int[N];
        int[] ball = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            question[i] = Integer.parseInt(st.nextToken());
            strike[i] = Integer.parseInt(st.nextToken());
            ball[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        for (int num = 123; num <= 987; num++) {
            String cand = String.valueOf(num);

            if (cand.contains("0")) continue;

            if (cand.charAt(0) == cand.charAt(1) ||
                cand.charAt(0) == cand.charAt(2) ||
                cand.charAt(1) == cand.charAt(2)) continue;

            boolean possible = true;

            for (int i = 0; i < N; i++) {
                String q = String.valueOf(question[i]);

                int s = 0;
                int b = 0;

                for (int j = 0; j < 3; j++) {
                    if (cand.charAt(j) == q.charAt(j)) {
                        s++;
                    }
                }

                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (j != k && cand.charAt(j) == q.charAt(k)) {
                            b++;
                        }
                    }
                }

                if (s != strike[i] || b != ball[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) answer++;
        }

        System.out.println(answer);
    }
}
