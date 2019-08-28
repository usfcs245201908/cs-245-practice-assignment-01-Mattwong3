public class Practice01MathIterative implements Practice01Math {

    public Practice01MathIterative(){


    }

    public int fib (int n)throws Exception{
        int fibSeq[] = new int[n+2];

        if(n<0) throw new Exception("Cannot input a negative integer.");
        if(n==0||n==1){
            return n;
        }
        else{
            fibSeq[0] = 0;
            fibSeq[1] = 1;

            for(int i = 2;i<=n;i++){
                fibSeq[i] = fibSeq[i-1] + fibSeq[i-2];

            }

            return fibSeq[n];
        }

    }

    public int fact(int n ) throws Exception{
        if(n<0) throw new Exception("Cannot input a negative integer.");
        if(n==0){
            return 1;
        }else {
            int total = 1;
            for (int i = 1; i <= n; i++) {
                total = total * i;

            }
            return total;
        }
    }
}
