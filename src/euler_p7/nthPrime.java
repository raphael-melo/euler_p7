package euler_p7;

import java.util.ArrayList;
import java.util.List;

import Util.Util;

public class nthPrime {

	public static Long nthPrime(int n){
		List<Long> generatedPrimes = new ArrayList<Long>();
		Long nthPrime = 2L;
		generatedPrimes.add(nthPrime);
		for (int i = 2; i <= n; i++) {
			nthPrime = Util.nextPrime(generatedPrimes);
			generatedPrimes.add(nthPrime);
		}
		
		return nthPrime;
	}
	
	public static void main(String[] args) {
		System.out.println(nthPrime(10001));
	}

}
