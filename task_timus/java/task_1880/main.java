package task_1880;

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

    public HashSet<Integer> nextParticipiantNumbers() throws IOException {
        input.nextToken();
        int N = (int) input.nval;
        HashSet<Integer> numbers = new HashSet<>();
        for (int i=0; i<N; i++){
            input.nextToken();
            numbers.add((int) input.nval);
        }
        return numbers;
    }

    void solve() throws IOException {
        HashSet<Integer> fp = nextParticipiantNumbers();
        HashSet<Integer> sp = nextParticipiantNumbers();
        HashSet<Integer> intersection = nextParticipiantNumbers();
        intersection.retainAll(fp);
        intersection.retainAll(sp);
        output.print(intersection.size());
        output.print("\n");
    }
}