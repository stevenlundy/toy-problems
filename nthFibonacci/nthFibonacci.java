public class nthFibonacci {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    System.out.println(getNthFibonacci(n));
  }

  public static int getNthFibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return getNthFibonacci(n - 1) + getNthFibonacci(n - 2);
    }
  }
}
