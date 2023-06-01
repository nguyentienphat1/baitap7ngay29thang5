import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số luong phần tử của mảng: ");
        int n = scanner.nextInt();

//         Khởi tạo mảng có n phần tử
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
countPrimes(arr);
//        System.out.println("Số lượng số nguyên tố trong mảng là: " + countPrimes(arr));
    }

    // Hàm kiểm tra xem một số có phải là số nguyên tố hay không
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Hàm đếm số lượng số nguyên tố trong mảng
    public static void countPrimes(int[] arr) {
        for (int numi : arr) {
            if (isPrime(numi)) {
                System.out.println("cac so nguyen to la :" + numi);
            }
        }
    }
}


