public class Bai1_ArrayBT {
    public int SumEvenNumberArrays(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {  // Kiểm tra số chẵn
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Bai1_ArrayBT arrayBT = new Bai1_ArrayBT();
        int[] numbers = {5,1,6,7,8,3,10,15,21};
        int result = arrayBT.SumEvenNumberArrays(numbers);
        System.out.println("Output: Sum = " + result);
}
}
