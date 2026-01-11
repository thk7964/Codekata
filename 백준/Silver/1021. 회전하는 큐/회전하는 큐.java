import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            dq.addLast(i);
        }

        st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            int a = 0;
            for (int x : dq) {
                if (x == target) break;
                a++;
            }

            if (a <= dq.size() / 2) {
                for (int j = 0; j < a; j++) {
                    dq.addLast(dq.pollFirst());
                    count++;
                }
            } else {
                for (int j = 0; j < dq.size() - a; j++) {
                    dq.addFirst(dq.pollLast());
                    count++;
                }
            }
            dq.pollFirst();
        }
        System.out.println(count);
    }
}
