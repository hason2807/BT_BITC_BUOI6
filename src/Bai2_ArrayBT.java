public class Bai2_ArrayBT {
    public int maxInArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Mảng rỗng hoặc null");
        }
        
        int max = array[0];  // Giả sử phần tử đầu tiên là lớn nhất
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];  // Cập nhật max nếu tìm thấy phần tử lớn hơn
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Bai2_ArrayBT arrayBT = new Bai2_ArrayBT();
        int[] numbers = {5,1,6,7,8,3,10,15,21};
        int result = arrayBT.maxInArray(numbers);
        System.out.println("Output: Max = " + result);
    }
}

