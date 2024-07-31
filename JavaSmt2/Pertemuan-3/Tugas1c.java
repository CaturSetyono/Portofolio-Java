public class Tugas1c{
	public static void main (String[]args){
	int [] bilGanjil = new int[8];
	int j= 0;
		for (int i=1;i<=15;i++){
			if (i % 2 != 0){
			bilGanjil[j]=i;
			j++;
			}
		}
			for (int k = 0; k < bilGanjil.length; k++) {
            	System.out.println( bilGanjil[k]+" Kuadarat = " +(bilGanjil[k] * bilGanjil[k]));
			}
	}
}