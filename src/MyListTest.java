public class MyListTest {
    public static void main(String[] args){
        MyList<Integer> integers = new MyList<>();
        MyList<Double> doubles = new MyList<>();
        
        integers.add(9);integers.add(7);
        integers.add(6);integers.add(9);
        integers.add(10);integers.add(70);

        doubles.add(2.7);doubles.add(12.34);
        doubles.add(1.13);doubles.add(15.67);
        doubles.add(0.5);doubles.add(5.65);

        System.out.println("Integer list : " + integers);
        System.out.println("Double list : " + doubles + "\n");

        System.out.println("Smallest of integers : " + integers.smallest());
        System.out.println("Largest of integers : " + integers.largest());
        System.out.println("Smallest of doubles : " + doubles.smallest());
        System.out.println("Largest of doubles : " + doubles.largest());
    }
}