import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] queue = new int[N];
        int front = 0;
        int back = 0;

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                queue[back++] = x;
            }
            else if (command.equals("pop")) {
                if (front == back) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue[front++]).append('\n');
                }
            }
            else if (command.equals("size")) {
                sb.append(back - front).append('\n');
            }
            else if (command.equals("empty")) {
                sb.append(front == back ? 1 : 0).append('\n');
            }
            else if (command.equals("front")) {
                if (front == back) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue[front]).append('\n');
                }
            }
            else if (command.equals("back")) {
                if (front == back) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue[back - 1]).append('\n');
                }
            }
        }

        System.out.print(sb.toString());
    }
}