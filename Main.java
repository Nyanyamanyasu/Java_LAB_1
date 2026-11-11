import java.util.Random;

public class Main {
	public static double calcE(long e, double x){
		if (e == 16) {
			return Math.asin((1.0 / 3.0) * Math.sin(x));
		}
		if (e == 2 || e == 10 || e == 12 || e == 18 || e == 20) {
			return Math.pow(Math.pow(Math.cos(x) / 2, 3), 3*Math.cos(Math.tan(x)));
		}
		return Math.cbrt(Math.sin(Math.cos(Math.atan((x - 1) / 18))));
	}

	public static void printMx(double [][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%.5f ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Random random = new Random();
		long[] e = new long[11];
		for (int i = 0; i < e.length; i++) {
			e[i] = 2 + i*2;
		}
		float[] x = new float[16];
		for (int i = 0; i < x.length; i++) {
			x[i] = -10 + random.nextFloat() * 18;
		}
		double[][] b = new double[11][16];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
			b[i][j] = calcE(e[i], x[j]);
			}
		}
		System.out.println("МАССИВ E");
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");
		}
		System.out.println("\n");
		System.out.println("МАССИВ Х");
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%.5f ", x[i]);
		}
		System.out.println("\n");
		System.out.println("THE MATRIX");
		printMx(b);
	}
	
}

