package array;

/**
 * ArrayList 的简易实现
 */
public class MyArrayList {

    /**
     * 实际存储的数据
     */
    private int[] data;

    /**
     * 数组长度
     */
    private int n;

    /**
     * 实际存储数目
     */
    private int count;

    /**
     * 初始构造方法
     *
     * @param capacity
     */
    public MyArrayList(int capacity) {
        data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    public void insert() {

    }

    public boolean delete(int index) {

        return false;
    }

    /**
     * 查找指定索引的值
     *
     * @param index
     * @return
     */
    public int find(int index) {
        if (index < 0 || index >= count) {
            return -1;
        }
        return data[index];
    }

    /**
     * 打印所有元素
     */
    public void printAll() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
