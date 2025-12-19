import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
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
            if (bx[0] == by[0]) {
                return bx[1] - by[1];
            }
            return bx[0] - by[0];
        });
        
        for (int i = 0; i < a; i++) {
            bw.write(b[i][0]+" "+ b[i][1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
