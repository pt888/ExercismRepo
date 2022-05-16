import java.util.*;

class Sieve {
    int limit;
    Sieve(int maxPrime) {
        this.limit=maxPrime;
    }

    List<Integer> getPrimes() {
        int n=this.limit;
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        ArrayList<Integer> primeList=new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                primeList.add(i);
        }
     return primeList;   
    }
}
