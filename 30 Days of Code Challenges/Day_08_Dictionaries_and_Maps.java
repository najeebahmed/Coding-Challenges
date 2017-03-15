import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> directory = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            directory.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (directory.get(s) != null)
                System.out.println(s + "=" + directory.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}

