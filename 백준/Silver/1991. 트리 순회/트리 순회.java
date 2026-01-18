import java.io.*;
import java.util.*;

public class Main {
    static int[] left = new int[26];
    static int[] right = new int[26];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Arrays.fill(left, -1);
        Arrays.fill(right, -1);

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char p = st.nextToken().charAt(0);
            char l = st.nextToken().charAt(0);
            char r = st.nextToken().charAt(0);

            int parent = p - 'A';
            if (l != '.') left[parent] = l - 'A';
            if (r != '.') right[parent] = r - 'A';
        }

        preorder(0);
        sb.append('\n');
        inorder(0);
        sb.append('\n');
        postorder(0);

        System.out.println(sb);
    }

    static void preorder(int node) {
        // A -> B -> D -> C -> E -> F -> G
        if (node == -1) return;

        sb.append((char)(node + 'A'));
        preorder(left[node]);
        preorder(right[node]);
    }

    static void inorder(int node) {
        if (node == -1) return;

        inorder(left[node]);
        sb.append((char)(node + 'A'));
        inorder(right[node]);
    }

    static void postorder(int node) {
        if (node == -1) return;

        postorder(left[node]);
        postorder(right[node]);
        sb.append((char)(node + 'A'));
    }
}
