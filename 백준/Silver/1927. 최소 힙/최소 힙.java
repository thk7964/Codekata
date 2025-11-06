import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        ArrayList<Integer>a=new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(bf.readLine());
            if (x > 0) {
                pq.add(x);
            } else if (x == 0) {
                if (pq.isEmpty()) {
                    a.add(0);
                }
                else {
                    a.add(pq.poll());
                }
            }
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}