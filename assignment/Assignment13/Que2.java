import java.util.*;
class Ques2 {
  public static void main(String args[]) {
  HashMap<Integer,String> H1= new HashMap<Integer,String>();
  H1.put(1, "Swift");
  H1.put(2, "Boleno");
  H1.put(3, "Ertiga");
  H1.put(4, "Brezza");

   for(Map.Entry x:H1.entrySet()){
   System.out.println(x.getKey()+" "+x.getValue());
}
}
}