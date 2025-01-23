package task_1910;

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

    int getN() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    int[] getSections(int N) throws IOException{
        int sections[] = new int[N];
        for (int i=0; i<N; i++){
            input.nextToken();
            sections[i] = (int) input.nval;
        }
        return  sections;
    }

    void solve() throws IOException {
        int N = getN();
        int sections[] = getSections(N);

        int sumOfThree = 0;
        int middleSection = 0;

        for(int i=0; i<N-2; i++){
            int tmp = sections[i] + sections[i+1] + sections[i+2];
            if(tmp > sumOfThree){
                sumOfThree = tmp;
                middleSection = i+2;
            }
        }

        output.print(sumOfThree);
        output.print(" ");
        output.print(middleSection);
        output.print("\n");
    }
}
