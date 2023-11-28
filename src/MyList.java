import java.util.ArrayList;

public class MyList<T extends Number & Comparable<? super T>>{
    private ArrayList<T> values = new ArrayList<>();

    public void add(T value){
       values.add(value);
}
    public T largest(){
        T max = values.get(0);
        for(T t : values)
            if(t.compareTo(max) > 0)
                max = t;
            return max;
    }
    public T smallest(){
        T min = values.get(0);
        for(T t : values)
            if(t.compareTo(min) < 0)
                min = t;
            return min;
}
@Override
public String toString() { 
    return values.toString(); }

}