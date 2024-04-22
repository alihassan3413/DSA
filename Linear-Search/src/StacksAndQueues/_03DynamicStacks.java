package StacksAndQueues;

public class _03DynamicStacks extends _02CustomStacks{

    public _03DynamicStacks(int size) {
        super(size);
    }

    public _03DynamicStacks() {
        super();
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            // double the array size
            int[] newArr = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                newArr[i] = data[i];
            }
            data = newArr;
        }

        return super.push(item);
    }
}
