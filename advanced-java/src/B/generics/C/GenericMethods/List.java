package B.generics.C.GenericMethods;

public class List {
    private int[] items = new int[10];
    private int count;

    public void add(int item){
        items[count++] = item;
    }

    public int get(int index){
        return items[index];
    }
}
