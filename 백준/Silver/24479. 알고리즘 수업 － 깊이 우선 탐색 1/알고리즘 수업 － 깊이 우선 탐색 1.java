import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] order;   // 방문 순서 저장
    static int cnt = 1;   // 방문 번호

    public static void dfs(int x) {
        visited[x] = true;
        order[x] = cnt++;   // 방문 순서 기록

        for (int next : graph[x]) {
            if (!visited[next]) {
                dfs(next);  // 끝까지 들어감
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); 
        int r = Integer.parseInt(st.nextToken()); 
        
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        order = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        dfs(r);
        
        for (int i = 1; i <= n; i++) {
            System.out.println(order[i]);
        }
    }
}
