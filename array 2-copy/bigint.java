import java.util.ArrayList;
import java.util.Arrays;
class bigint{
     public static void main (String[] args) {
      ArrayList<Integer>b1= new ArrayList<Integer>();
      ArrayList<Integer>b2= new ArrayList<Integer>();
      ArrayList<Integer>fin= new ArrayList<Integer>();
       b1.add(1);
       b1.add(4);
       b1.add(6);
       b1.add(2);
       b2.add(3);
       b2.add(1);
       b2.add(9);
       b2.add(5);
       b2.add(7);
       add(fin,b1,b2);
       System.out.println(fin);
        }
        
     public static ArrayList<Integer>  add(ArrayList<Integer> myList,ArrayList<Integer> b1,ArrayList<Integer> b2 ) {
         int a=b1.size();
         int b=b2.size();
         int i=0;
         if(a>=b) {
             System.out.println("a");
             for(i=0; i<b2.size(); i++) {
                 int Aadd=b1.get(i);
                 int Badd=b2.get(i);
                 myList.add(Aadd+Badd);
                }
                System.out.println("a2");
             while(i<b1.size()) {
                 myList.add(b1.get(i));
                 i++;
             }
         }
          else if(a<=b) {
              System.out.println("b");
              for(i=0; i<b1.size(); i++) {
                 int Aadd=b1.get(i);
                 int Badd=b2.get(i);
                 myList.add(Aadd+Badd);
                }
                System.out.println("b2");
             while(i<b2.size()) {
                 myList.add(b2.get(i));
                 i++;
             }
            }
         return(myList);
        }
}