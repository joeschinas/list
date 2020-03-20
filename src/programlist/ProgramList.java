
package programlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ProgramList {


    public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner read = new Scanner(System.in);
     List<String> list = new ArrayList<>();
     
     
     list.add("Joao");
     list.add("Joanna");
     list.add("Pedro");
     list.add("Jairo");
     list.add(1, "Valerio");
     
    
     
     for(String x:list){
    System.out.println(x);
     }
             
     list.remove("joao");
      list.removeIf (x -> x.charAt(0) == 'V');
        System.out.println("----------------------- \n"+ list);
        
       
             List<String> result = list.stream().filter(x -> x.charAt(0)== 'j').collect(Collectors.toList());
             
             System.out.println("---------"+list);
                   
             String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
             System.out.println("------------"+nome);
                     
                     
                     
                 
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
        
     
    }
    
}
