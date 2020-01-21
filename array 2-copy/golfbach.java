import java.util.ArrayList;
class golfbach{
    public static void main (String[] args) {
        ArrayList<Integer>x= new ArrayList<Integer>();
        int n=100;
        for(int i=2; i<n; i++) {
            x.add(i);
        }
         int p=2;
        int fin=0;
        int p2=0;
        while(fin==0) {
        for(int i=0; i<x.size(); i++) {
            int y=x.get(i);
            //System.out.println(y);
            if(y%p==0 && y>p) {
                //System.out.println(y);
                x.remove(i);
                i--;
            }
        }
        p2++;
        if(p2<x.size() && p<x.get(p2)) {p=x.get(p2);
        } else{fin++; }
         
       }
        System.out.println(x);
        add(x,30);
        //System.out.println(x);
    }
    public static ArrayList<Integer>  add(ArrayList<Integer> myList, int n) {
         for(int i=0; i<myList.size(); i++) {
             int g=myList.get(i);
             int h=0;
             while(h<myList.size()){
             if(g+myList.get(h)==n) {
                 System.out.println(g +"+"+ myList.get(h));
                 i=myList.size()+1;
                }
                h++;
            }
            }
    
        return(myList);
    }
}
    