import java.util.*;

public class Day_28_RegEx_Patterns_and_intro_to_Databases {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            
            if(emailID.substring(emailID.length() - 10, emailID.length()).equals("@gmail.com"))
                insert(names, firstName);
        }
        
        for(String s : names)
            System.out.println(s);
        
        in.close();
    }
    
    public static void insert(ArrayList<String> names, String firstName) {
        int index = names.size();
        
        while(index > 0 && names.get(index - 1).compareTo(firstName) > 0)
            index--;
        
        names.add(index, firstName);
    }
}

