package task_1313;

import java.io.*;
import java.util.ArrayList;

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

    int getN() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    int[][] getLines(int N) throws IOException{
        int[][] lines = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                input.nextToken();
                lines[i][j] = (int) input.nval;
            }
        }
        return lines;
    }

    void solve() throws IOException {
        int N = getN();
        int[][] lines = getLines(N);

        ArrayList<Integer> result = new ArrayList<>();

        for (int d = 0; d < N * 2 - 1; d++) {
            int r;
            int c;
            if (d < N) {
                r = d;
                c = 0;
            } else {
                r = N - 1;
                c = d - N + 1;
            }

            while (r >= 0 && c < N) {
                result.add(lines[r][c]);
                r--;
                c++;
            }
        }
        for (int pixel : result) {
            output.print(pixel);
            output.print(" ");}
        output.print("\n");
    }
}
