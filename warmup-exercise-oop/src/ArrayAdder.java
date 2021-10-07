import java.util.Arrays;

public class ArrayAdder {
    private int[] firstArray;
    private int[] secondArray;

    public void setFirstArray(int[] arr) {
        this.firstArray = arr;
    }

    public void setSecondArray(int[] arr) {
        this.secondArray = arr;
    }

    public int[] getNewArray() throws Exception {
        return Helper.calculateTotal(this.firstArray, this.secondArray);
    }

    public int[] getFirstArray() {
        return firstArray;
    }

    public int[] getSecondArray() {
        return secondArray;
    }

    public static void main(String[] args) throws Exception {
        ArrayAdder arrayAdder = new ArrayAdder();
        arrayAdder.setFirstArray(Helper.getInput());
        arrayAdder.setSecondArray(Helper.getInput());

        try {
            int[] totalArr = arrayAdder.getNewArray();
            System.out.println("Total: " + Arrays.toString(totalArr));
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
