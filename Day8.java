package HackerRank;

//Complete this code or write your own from scratch
import java.util.*;

class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> phoneBHashMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
           phoneBHashMap.put(name, phone);
           
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBHashMap.containsKey(s))
            System.out.println(s+"="+phoneBHashMap.get(s));
            else
            System.out.println("Not found");
        }
        in.close();
    }
}
