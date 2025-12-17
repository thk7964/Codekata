import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
 
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bf.readLine());

        Set<String> set=new HashSet<>();//중복을 잡아줌

        for (int i = 0; i < a; i++) {
            String b = bf.readLine();
            set.add(b);
        }

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            return s1.compareTo(s2);
        });

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i)+"\n");
        }
        bw.flush(); // 출력 밀어내기
        bw.close();
        bf.close();
    }
}