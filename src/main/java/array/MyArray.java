package array;

/**
 * ArrayList 的简易实现
 */
public class MyArray {

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
    public MyArray(int capacity) {
        data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    /**
     * 插入元素到指定位置
     *
     * @param index
     * @param value
     * @return
     */
    public boolean insert(int index, int value) {
        if (count == n) {
            System.out.println("没有可插入位置");
            return false;
        }
        if (index < 0 || index > count) {
            System.out.println("位置不合法");
        }
        for (int i = count; i > index; --i) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        ++count;
        return true;
    }

    /**
     * 删除指定位置的元素
     *
     * @param index
     * @return
     */
    public boolean delete(int index) {
        if (index < 0 || index >= count) {
            return false;
        }
        for (int i = index + 1; i < count; ++i) {
            data[i - 1] = data[i];
        }
        --count;
        return true;
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
