
import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;


class Day7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
            
        int siz = arr.size();
        for(int i=siz-1;i>=0;i--){
            if(i!=0)
            System.out.print(arr.get(i)+" ");
            else
            System.out.print(arr.get(i));
        }

        bufferedReader.close();
    }
}
