package task_1991;

import java.io.*;

public  class main {
    public static void main(String[] args) throws IOException {
        new main().run();
    }

    StreamTokenizer input;
    PrintWriter output;

    void run() throws IOException {
        input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        output = new PrintWriter(System.out);
        solve();
        output.flush();}

    int getInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    int[] getCarts(int N) throws IOException{
        int sections[] = new int[N];
        for (int i=0; i<N; i++){
            input.nextToken();
            sections[i] = (int) input.nval;
        }
        return  sections;
    }

    void solve() throws IOException {
        int N = getInt();
        int K = getInt();

        int carts[] = getCarts(N);

        int livedroids = 0;
        int boombooms = 0;

        for (int i=0; i<N; i++){
            int amount = carts[i] - K;
            if(amount < 0){
                livedroids += Math.abs(amount);
            } else {
                boombooms += amount;
            }
        }

        output.print(boombooms);
        output.print(" ");
        output.print(livedroids);
        output.print("\n");
    }
}