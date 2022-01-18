class main8B {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        Sum s = new Sum();
        int ans = s.sum(arr);
        int avg = s.avg(ans, n);
        System.out.println(ans);
        System.out.println(avg);
    }    
}

class Sum{
    int sum = 0;
    

    int sum(int arr[]){

        for(int i:arr){
            sum+=i;
        }
        return sum; 
    }

    int avg(int sum, int n){
        int ans = sum/n;
        return ans;
    }
    
}