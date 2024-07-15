import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_ArrayBT {
    public void SumOfSquaresElements(ArrayList<Integer> list) {
        int sum = 0;
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Moi ban nhap gia tri cho mang: ");
                int value = scanner.nextInt();
                list.add(value);
                
                System.out.print("Ban co muon tiep tuc them gia tri cho mang, y/n: ");
                String choice = scanner.next();
                if (choice.equalsIgnoreCase("n")) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Co loi xay ra khi nhap lieu: " + e.getMessage());
            return;
        }
        
        for (int num : list) {
            sum += num * num;
        }
        
        System.out.println("Tong cac so binh phuong trong mang la: " + sum);
    }

    public static void main(String[] args) {
        Bai4_ArrayBT arrayBT = new Bai4_ArrayBT();
        arrayBT.SumOfSquaresElements(new ArrayList<>());
    } 
}