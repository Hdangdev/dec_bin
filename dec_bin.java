import java.util.*;

// Dangdeveloper_FPT
public class dec_bin {
    public static void main(String[] args) {
        // int oct = 112;
        System.out.print("Nhap vao day thap phan: ");
        Scanner in = new Scanner(System.in);
        int dec = in.nextInt();
        String bin = "";
        while (dec > 0) {
            bin = String.valueOf(dec % 2) + bin;
            dec = dec / 2;
        }
        System.out.println("Sau khi chuyen thanh so nhi phan: " + bin);

    }
}