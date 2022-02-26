

public class Main {
    public static void main(String[] args) {

        MyMap<Integer> map1 = new MyMap<>();


        map1.add(1);
        map1.add(2);
        map1.add(1);
        map1.add(4);
       // map1.add(4);
        System.out.println(map1.getCount(1));  // 2
        System.out.println(map1.getCount(2));
        System.out.println(map1.getCount(3));  // 1
        System.out.println(map1.getCount(4)); // 3

        System.out.println(map1.size()); // 4
    }
}
