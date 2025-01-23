package task_2001;

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

    int[][] getAandB() throws IOException{
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i=0; i<3; i++){
            input.nextToken();
            a[i] = (int) input.nval;
            input.nextToken();
            b[i] = (int) input.nval;
        }
        int[][] result = new int[2][3];
        result[0] = a;
        result[1] = b;
        return  result;
    }

    void solve() throws IOException {
        int[][] weights = getAandB();
        int[] a = weights[0];
        int[] b = weights[1];

        int berries_weights_a = a[0] - a[2];
        int berries_weights_b = b[0] - b[1];

        output.print(berries_weights_a);
        output.print(" ");
        output.print(berries_weights_b);
        output.print("\n");
    }
}