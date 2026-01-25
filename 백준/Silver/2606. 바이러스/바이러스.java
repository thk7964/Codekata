import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph; // 그래프
    static boolean[] visited;           // 방문 체크
    static int count = 0;

    public static void dfs(int x) {
        visited[x] = true;              // 현재 노드 방문 처리
        count++;

        for (int next : graph[x]) {     // 연결된 노드들 확인
            if (!visited[next]) {       // 아직 방문 안 했으면
                dfs(next);              // 거기로 계속 들어감
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }
        dfs(1);
        System.out.println(count - 1);

    }
}
