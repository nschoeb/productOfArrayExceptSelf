public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        
    }

    public static int[] productExceptSelf(int[] nums) {
        int size=nums.length;
        int[] rightProd = new int[size];
        int[] leftProd = new int[size];
        int[] answer = new int[size];
        int product=1;
        for(int i=0;i<size;i++){
            leftProd[i]=product;
            product*=nums[i];
        }
        product=1;
        for(int i=size-1;i>=0;i--){
            rightProd[i]=product;
            product*=nums[i];
        }
        for(int i=0;i<size;i++){
            answer[i]=leftProd[i]*rightProd[i];
        }
        return answer;




        /*too high time complexity
        try another solution
        int[] answer= new int[nums.length];
        for(int i=0; i<nums.length;i++){
            answer[i]=1;
            for(int j=0;j<nums.length;j++){
                if(i==j)continue;
                answer[i]*=nums[j];
            }

        }return answer;*/

    }
}
