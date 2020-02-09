import java.util.*;
public class RemDuplicates {   
    public static void main(String[] args) {  
        List<String> l = new ArrayList<String>();  
        l.add("M");  
        l.add("B");  
        l.add("M");  
        l.add("A");  
        l.add("A");  
        l.add("B");  
        System.out.println(l.toString());  
        Set<String> s = new LinkedHashSet<String>(l);  
        System.out.println(s);  
    }  
} 