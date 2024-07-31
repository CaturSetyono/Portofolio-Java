public class DeretPola {
    public static void main(String[] args) {
        int n = 6; // Jumlah suku yang ingin dihasilkan
        int suku1 = 1;
        int suku2 = 2;

        System.out.print("Deret: " + suku1 + ", " + suku2);

        for (int i = 3; i <= n; i++) {
            int suku3 = suku1 + suku2;
            System.out.print(", " + suku3);
            suku1 = suku2;
            suku2 = suku3;
        }

        System.out.println();
    }
}
