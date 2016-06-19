package june_1;

public class Ackermann {

	private static int m, n, ack, count = 0;
	private static int[][] value = new int[4][1400];

	public static int[][] setVisited() {
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < 1400; j++) {
				value[i][j] = 0;
			}
		}
		return value;
	}

	private static int Ackerman(int m, int n) {
		count++;
		System.out.println("count = " + count + " M = " + m + " N = " + n);
		if (m == 0) {
			return n + 1;

		} else if (n == 0) {
			return Ackerman(m - 1, 1);
		} else {
			return Ackerman(m - 1, Ackerman(m, n - 1));
		}
	}

	public static void main(String[] arg) {
		Ackermann.setVisited();
		System.out.println(Ackermann.Ackerman(2, 2));
	}

	public static int tableLookUp(int m, int n) {
		count++;
		// System.out.println("value[m][n] = "+ value[m][n]);

		System.out.println("count = " + count + " M = " + m + " N = " + n);
		if (value[m][n] != 0) {
			return value[m][n];
		} else if (m == 0) {
			value[m][n] = n + 1;
			return value[m][n];
		} else if (n == 0) {
			value[m][n] = tableLookUp(m - 1, 1);
			return value[m][n];
		} else {
			value[m][n] = tableLookUp(m - 1, tableLookUp(m, n - 1));
			return value[m][n];
		}

	}
}
