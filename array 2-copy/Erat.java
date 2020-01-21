import java.util.ArrayList;
class Erat{
    public static ArrayList<Integer>  ear(ArrayList<Integer> myList, int n) {
        int p=2;
        int fin=0;
        int p2=0;
        while(fin==0) {
        for(int i=0; i<myList.size(); i++) {
            int y=myList.get(i);
            //System.out.println(y);
            if(y%p==0 && y>p) {
                //System.out.println(y);
                myList.remove(i);
                i--;
            }
        }
        p2++;
        if(p2<myList.size() && p<myList.get(p2)) {p=myList.get(p2);
        } else{fin++; }
         
       }
        return myList;
    }

    public static void main (String[] args) {
        ArrayList<Integer>x= new ArrayList<Integer>();
        int n=100;
        for(int i=2; i<n; i++) {
            x.add(i);
        }
        System.out.println(x);
        ear(x,n);
        System.out.println(x);
    }
}