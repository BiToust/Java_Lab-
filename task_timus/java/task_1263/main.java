package task_1263;

import java.io.*;
import java.util.Map;
import java.util.HashMap;


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

    int[] getNandM() throws IOException{
        input.nextToken();
        int N = (int) input.nval;
        input.nextToken();
        int M = (int) input.nval;
        int[] result = {N, M};
        return  result;
    }

    int[] getVoices(int M) throws IOException{
        int[] voices = new int[M];
        for(int i=0; i<M; i++){
            input.nextToken();
            voices[i] = (int) input.nval;
        }
        return voices;
    }

    Map<Integer, Integer> countVoices(int N, int[] voices){
        Map<Integer, Integer> count = new HashMap<>();
        for(int id=1; id<=N; id++){
            count.put(id, 0);
        }
        for (int id: voices){
            int value = count.get(id);
            value++;
            count.replace(id, value);
        }
        return count;
    }

    void printPercentage(int N, int M, Map<Integer, Integer> count) throws IOException{
        for(int id=1; id<=N; id++){
            float percentage = (count.get(id) * 100.0f )/ M;
            String fmt_percentage = String.format("%.2f%%", percentage);
            output.print(fmt_percentage);
            output.print("\n");
        }
    }

    void solve() throws IOException {
        int[] nandm = getNandM();
        int N = nandm[0];
        int M = nandm[1];
        int[] voices = getVoices(M);
        Map<Integer, Integer> count = countVoices(N, voices);
        printPercentage(N, M, count);
    }
}
