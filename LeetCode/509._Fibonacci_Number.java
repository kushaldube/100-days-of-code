class Solution {
    public int fib(int n) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        if(n==0) {return 0;}
        if(n==1) {return 1;}
        int a=0,b=1,ans;
        arr.add(a);
        arr.add(b);
        for(int i=2; i<n; i++){
            ans=a+b;
            arr.add(ans);
            a=b;
            b=ans;
        }
        
        return arr.get(n-1)+arr.get(n-2);
    }
}