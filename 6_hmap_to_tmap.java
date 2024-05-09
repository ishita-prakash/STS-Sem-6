import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        HashMap<Character, Double> hmap = new HashMap<>();
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            hmap.put(sc.next().charAt(0), sc.nextDouble());
        }
        
        System.out.println(hmap);
        
        TreeMap<Character, Double> tmap = new TreeMap<>();
        
        tmap.putAll(hmap);
        
        System.out.println(tmap);
    }
}
