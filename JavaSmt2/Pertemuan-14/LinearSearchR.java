import java.util.Scanner;

public class LinearSearchR {
	static int data[] = { 12, 20, 14, 9, 34 };

	public static int linearSearch(int kunci, int indeksAwal) {
		if (kunci == data[indeksAwal])
			return indeksAwal;
		if (indeksAwal + 1 < data.length)
			return linearSearch(kunci, indeksAwal + 1);
		return -1;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int i, x;
		System.out.print("Masukan Data yang dicari = ");
		x = input.nextInt();
		i = linearSearch(x, 0);
		if (i != -1)
			System.out.println("Data tersebut ada pada posisi ke-" + i);
		else
			System.out.println("Data tidak ketemu !");
	}
}
