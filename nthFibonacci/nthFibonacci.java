public class nthFibonacci {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    System.out.println(getNthFibonacciIterative(n));
  }

  public static int getNthFibonacciRecursive(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return getNthFibonacciRecursive(n - 1) + getNthFibonacciRecursive(n - 2);
    }
  }

  public static int getNthFibonacciIterative(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }

    int twoBack = 0;
    int oneBack = 1;
    int temp;

    for (int i = 2; i < n; i++) {
      temp = oneBack;
      oneBack = oneBack + twoBack;
      twoBack = temp;
    }

    return oneBack + twoBack;
  }

}
