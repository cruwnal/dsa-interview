// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

class StremOne {
    public static void main(String[] args) {
       String s= "ai is the future";
       //find the frequency of the the cononenet
       Map<Character,Long> mp = s.toLowerCase().chars().mapToObj(c->(char)c)
       .filter(d->"aeiou".indexOf(d)!=-1)
       .collect(Collectors.groupingBy(c->c,Collectors.counting()));
       
       
          List<String> li = List.of("usa","china","usa","india","india") ;
          
          li.stream().map(s2->s2.toLowerCase()).collect(Collectors.groupingBy(
              cur->cur,Collectors.counting()
              )).forEach((k,v)->{
              if(v>1){
                  System.out.println(k+" "+v);
              }
              }
              
              );
           
           
           
         
       
    }
}
