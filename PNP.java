public class PNP{
    //generate random array
  public static long[] genRA() {
      long arr[] = new long[1000000];
      for (int i = 0; i < arr.length; i++) {
        long e1 = System.currentTimeMillis() % 10;
        long e2 = System.currentTimeMillis() % 10;
        long e3 = System.currentTimeMillis() % 10;
        long e4 = System.currentTimeMillis() % 10;
        long e5 = System.currentTimeMillis() % 10;
        long e6 = System.currentTimeMillis() % 10;
        long e7 = System.currentTimeMillis() % 10;
        arr[i] = (long) ((1000000 * e1) + (100000 * e2) + (10000 * e3) + (1000 * e4) + (100 * e5) + (10 * e6) + (e7));
        }
      return arr;
    }

  public static boolean Prime(long n) {
		  boolean b=true;
		  for(int i=2;i<n;i++){
			  if(n%i==0){
				  return false;
			}
		}
		return true;
	}
	public static boolean Non_Prime(long n){
		boolean b=false;
		for(int i=2;i<n;i++){
			if(n%i==0){
				return true;
			}
		}
		return false;
	}

  public static int countP(long arr[]) {
    long startTime = System.currentTimeMillis();
      int totalPr= 0;
      int totalNonPr = 0;
      for (int i = 0; i < arr.length; i++) {
        if (Prime(arr[i])) {
          totalPr++;
          } else {
              totalNonPr++;
        }
      }
      long endTime = System.currentTimeMillis();
      System.out.println("Time taken to find primes: " + (endTime - startTime) + " milliseconds");
      return totalPr;
    }

    public static int countNon_P(long arr[]) {
      long startTime = System.currentTimeMillis();
        int totalPr= 0;
        int totalNonPr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Non_Prime(arr[i])) {
                totalNonPr++;
            } else {
                totalPr++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to find non-primes: " + (endTime - startTime) + " milliseconds");
        return totalNonPr;
    }

    public static void main(String[] args) {
        long[] randomArray = genRA();
        int prime_C = countP(randomArray);
        int nonPrime_C = countNon_P(randomArray);
        System.out.println("Total Primes: " + prime_C);
        System.out.println("Total Non-Primes: " + nonPrime_C);
    }
}

