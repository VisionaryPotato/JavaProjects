import java.util.ArrayList;
import java.lang.Number;

public class Polymorph{

    public static double max(ArrayList<?extends Number > as){
        double max = as.get(0).doubleValue();
        return max;
    }

    public class TwoGenerics<T, C>{
        T al;
        C sl;



    }


    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(new Integer(3));
        System.out.println(max(al));

    }
}