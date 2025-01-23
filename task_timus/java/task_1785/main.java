package task_1785;

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

    int nextInt() throws IOException{
        input.nextToken();
        return  (int) input.nval;
    }

    void solve() throws IOException {
        int N = nextInt();
        String result = "few";
        if(N>=1000){
            result = "legion";
        } else if (N>=500) {
            result = "zounds";
        } else if (N>=250) {
            result = "swarm";}
        else if (N>=100){
            result = "throng";}
        else if (N>=50){
            result = "horde";}
        else if (N>=20) {
            result = "lots";}
        else if (N>=10) {
            result = "pack";}
        else if (N>=5){
            result = "several";}
        else { result = "few";}

        output.print(result);
        output.print("\n");
    }
}