import java.io.*;




class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
      
            int len = 0;
            int maxlen = 0;
            while(n>0){
                if(n%2==1)
                {
                    len++;
                     maxlen = Math.max(len,maxlen);
                }
                else{
                    len=0;
                }
                n/=2;
            }
            System.out.println(maxlen);
        bufferedReader.close();
    }
}
