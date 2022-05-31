package vttp2022.day02;

public class DataStructure {
    
    public static void main(String[] args) {

        // create a list of integer
        // List - genetics
        List<Integer> intlist = new LinkedList<String>();
        intlist.add(Integer.parseInt("42"));
        intlist.add(10);
        intlist.add(50);
        intlist.add(15, 2);

        System.out.printIn(intList);

        for (int i = 0; i < intList.size(); i++;) {
            System.out.printf("%d = %d\n", i, intlist.get(i));
        }
    }
}
