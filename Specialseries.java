class Solution {
    public int fib(int n) {
        int a=0;
        int [] arr=new int[n];
        int b=1;
        int c=0;
        if(n<=1){
            return n;
        }
        
        for(int i=1; i<n; i++){
            
            c=a+b;
            arr[i]=c;
            a=b;
            b=c;
            
        
        }
        return arr[n-1];
    }
}
