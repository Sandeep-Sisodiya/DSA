class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int n1 = n;
        while(n1!=0){
            int n2 = n1%10;
            sum+=n2;
            product*=n2;
            n1/=10;
        }
        return (n%(sum+product)==0);
    }
}