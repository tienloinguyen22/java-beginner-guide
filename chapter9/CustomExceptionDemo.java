package chapter9;

class NonIntResultException extends Exception {
  /**
	 *
	 */
	private static final long serialVersionUID = 1L;
  int i, n;

  NonIntResultException(int n, int i) {
    this.i = i;
    this.n = n;
  }

  public String toString() {
    return "Result of " + n + "/" + i + " is not an int";
  }
}

public class CustomExceptionDemo {
  public static void main(String[] args) {
    int[] nums = {4, 8, 15, 32, 64, 127, 256, 512};
    int[] denoms = {2, 0, 4, 4, 0, 8};

    for (int i = 0; i < nums.length; i += 1) {
      try {
        if (nums[i] % 2 != 0) {
          throw new NonIntResultException(nums[i], denoms[i]);
        }

        System.out.println(nums[i] + "/" + denoms[i] + " is: " + nums[i] / denoms[i]);
      } catch (NonIntResultException e) {
        System.out.println(e);
      } catch (ArithmeticException e) {
        System.out.println("Can't divided by zero");
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Index out of bound");
      }
    }
  }
}