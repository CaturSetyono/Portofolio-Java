public class Baris_Tugas1{
	public static void main(String[]args){
	int i=1;
	int j=1;
	while(i<=5){
		while(j<i){
			System.out.print(j +" ");
			j++;
		}
		System.out.println();
		j=1;
		i++;
	}
	while(i>0){
		while(j<i){
			System.out.print(j +" ");
			j++;
			}
		System.out.println();
		j=1;
		i--;
		}
	}
}