import java.util.Scanner; 
public class NilaiUjianSiswa { 
  public static void main(String[] args){ 
    double [][][] nilai = { 
      {{51.58, 89.94}, {60.06, 59.58}, {52.93, 47.63}, {89.98, 77.56}, {45.87, 94.56}}, 
      {{39.46, 58.41}, {71.42, 85.37}, {39.08, 78.21}, {79.03, 80.32}, {45.49, 23.47}}, 
      {{81.09, 32.24}, {51.86, 86.92}, {59.58, 31.69}, {96.18, 26.72}, {28.76, 91.54}} }; 
    for (int i =0; i < nilai.length; i++){ 
      for(int j = 0; j < nilai[0].length; j++){ 
   for(int k = 0; k < nilai[0][0].length; k++ ){ 
	System.out.print("nilai[" +i+ "][" +j+ "][" +k+ "] = " + nilai [i][j][k]+ "\t"); 
		} 
		System.out.println(); 
	      } 
	      System.out.println(); 
	    } 
  } 
}
