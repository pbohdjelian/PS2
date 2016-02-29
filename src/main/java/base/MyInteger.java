package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int x) {
		iValue=x;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0)
			return (true);

		return (false);
	}

	public boolean isOdd() {
		if (iValue % 2 != 0)
			return (true);

		return (false);
	}

	public boolean isPrime() {
		for (int x = 2; x <= iValue / 2; x++) {
			if (iValue % x == 0) {
				return (false);

			}
		}
		return (true);

	}

	public static boolean isEven(int x) {
		if (x % 2 == 0)
			return (true);
		return (false);
	}

	public static boolean isOdd(int x) {
		if (x % 2 != 0)
			return (true);
		return (false);
	}

	public static boolean isPrime(int y) {
		for (int x = 2; x <= y / 2; x++) {
			if (y % x == 0) {
				return (false);

			}
		}
		return (true);
	}

	public static boolean isEven(MyInteger x) {
		if (x.getiValue() % 2 == 0)
			return (true);
		return (false);

	}

	public static boolean isOdd(MyInteger x) {
		if (x.getiValue() % 2 != 0)
			return (true);
		return (false);
	}

	public static boolean isPrime(MyInteger y) {
		for (int x = 2; x <= y.getiValue() / 2; x++) {
			if (y.getiValue() % x == 0) {
				return (false);

			}
		}
		return (true);
	}

	public boolean equals(int x) {
		if (this.iValue == x)
			return (true);
		return (false);
	}

	public boolean equals(MyInteger x) {
		if (this.iValue == x.getiValue())
			return (true);
		return (false);
	}
}