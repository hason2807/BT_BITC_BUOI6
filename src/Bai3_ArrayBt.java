public class Bai3_ArrayBt {
    public void CountOccurrences(int[] array, int elementToFind) {
        int count = 0;
        for (int element : array) {
            if (element == elementToFind) {
                count++;
            }
        }
        System.out.println("Output: Phan tu " + elementToFind + " xuat hien " + count + " lan trong mang");
    }

    public static void main(String[] args) {
        Bai3_ArrayBt arrayBT = new Bai3_ArrayBt();
         
        arrayBT.CountOccurrences(new int[] {5,1,6,7,5,6,10,5,21}, 5);
        arrayBT.CountOccurrences(new int[] {5,1,6,7,5,6,10,5,21}, 6);
    }
}
