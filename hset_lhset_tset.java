import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Set<String> hset = new HashSet<>();
        Set<String> lhset = new LinkedHashSet<>();
        Set<String> tset = new TreeSet<>();
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            hset.add(sc.next());
            lhset.add(sc.next());
            tset.add(sc.next());
        }
        
        // lhset.addAll(hset);
        // tset.addAll(hset);
        
        System.out.println(hset);
        System.out.println(lhset);
        System.out.println(tset);
    }
}
