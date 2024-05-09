/* set functions :-
1. adding elements -> myset.add("apple")
2. removing elements -> myset.remive("apple")
3. checking if set contains an element -> boolean containsApple = myset.contains("apple")
4. size of set -> int n = myset.size()
5. checking if set is empty -> boolean setEmpty = myset.isEmpty()
6. iterate over elements -> for (Integer element: myset)
                                System.out.println(element)
7. clear/reset a set -> myset.clear()
8. set union -> create set1, create set2
                Set<String> unionset = new HashSet<>(set1)
                unionset.addAll(set2)
9. set intersection -> create set1, create set2
                        Set<Integer> intersectionset = new HashSet<>(set1)
                        intersectionset.retainAll(set2)
10. set difference -> create set1, create set2
                        Set<Integer> differenceset = new HashSet<>(set2)
                        differenceset.removeAll(set2)
*/
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
