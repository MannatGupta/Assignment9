import java.util.*;
class Que1{  
        public static void main(String[] args) {   
        List<String> carList = new ArrayList<>();  
          
        fruitList.add("Swift");  
        fruitList.add("Civic");  
        fruitList.add("Verna");  
        fruitList.add("Polo");  
        fruitList.add("Acord");  
        String[] item = carList.toArray(new String[carList.size()]);  
        for(String s : item){  
            System.out.print(s+"  ");  
        }  
        int a=item.length;
        System.out.print("\nSize of First Array: "+a);
        int b= (a*15)/10;
        String[] arr = Arrays.copyOf(item, b);
        System.out.print("\n");
        System.out.print("\n");        
        for(String s1 : arr){  
            System.out.print(s1+"  ");  
        }  
        System.out.print("\nNew array size : "+arr.length);   
    }  
}  