public class Pascal {

        static void pPascal(int n)
        {

            for (int l= 0; l < n; l++)
            {
                for (int i = 0; i <= l; i++)
                    System.out.print(binomialCoeff
                            (l, i)+" ");

                System.out.println();
            }
        }

        static int binomialCoeff(int n, int k)
        {
            int r = 1;

            if (k > n - k)
                k = n - k;

            for (int i = 0; i < k; ++i)
            {
                r *= (n - i);
                r /= (i + 1);
            }
            return r;
        }

        public static void main(String[] args)
        {
            int n = 7;
            pPascal(n);
        }
    }

