public class Friendly {

        static int sumofFactors(int n)
        {

            int res = 1;
            for (int i = 2; i <= Math.sqrt(n); i++) {

                int count = 0, curr_sum = 1;
                int curr_term = 1;
                while (n % i == 0) {
                    count++;

                    n = n / i;

                    curr_term *= i;
                    curr_sum += curr_term;
                }

                res *= curr_sum;
            }

            if (n >= 2)
                res *= (1 + n);

            return res;
        }

        static int gcd(int a, int b)
        {
            if (a == 0)
                return b;

            return gcd(b % a, a);
        }

        static boolean checkFriendly(int n, int m)
        {
            int sumFactors_n = sumofFactors(n);
            int sumFactors_m = sumofFactors(m);

            int gcd_n = gcd(n, sumFactors_n);

            int gcd_m = gcd(m, sumFactors_m);

            return n / gcd_n == m / gcd_m &&
                    sumFactors_n / gcd_n == sumFactors_m / gcd_m;
        }

        public static void main (String[] args)
        {
            int n = 6, m = 28;

            if(checkFriendly(n, m))
                System.out.print("Yes\n");
            else
                System.out.print("No\n");
        }
    }

