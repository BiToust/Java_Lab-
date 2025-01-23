package task_1197;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

    public String[] getKnightTests() throws IOException {
        input.nextToken();
        int N = (int) input.nval;

        String[] cells = new String[N];
        for (int i=0; i<N; i++){
            input.nextToken();
            cells[i] = input.sval;
        }
        return cells;
    }

    int attacked_cells(String cell){
        final int[][] points = {{-1, -2},{-2, -1},{-2, 1},{-1, 2},{1, 2},{2, 1},{2, -1},{1, -2}};
        char[] verticals = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] v_h = cell.toCharArray();
        char letter = v_h[0];
        int v = Arrays.binarySearch(verticals, v_h[0]);
        int h = Character.getNumericValue(v_h[1]) - 1;
        int sum_cells = 0;
        for(int[] point: points){
            int nv = v + point[0];
            int nh = h + point[1];
            if(0 <= nv && nv < 8 && 0 <= nh && nh < 8){
                sum_cells += 1;
            }
        }
        return  sum_cells;
    }

    void solve() throws IOException {
        String[] tests = getKnightTests();
        for(String test: tests){
            int sum_cells = attacked_cells(test);
            output.print(sum_cells);
            output.print("\n");
        }
    }
}
