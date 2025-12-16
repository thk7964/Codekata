import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(bf.readLine());
            num.add(b);
        }

        Collections.sort(num);
        for (int j = 0; j < num.size(); j++) {
            System.out.println(num.get(j));
        }
    }
}