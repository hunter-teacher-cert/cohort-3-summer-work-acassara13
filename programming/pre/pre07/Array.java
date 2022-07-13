public class Array{

  public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a[] = new double[]{2,4,6,8};
         powArray(a,0);
        for(double value:a){
            System.out.println(value);

        
        }

    }

    public static void powArray(double a[], int index) {
        if (index < a.length) {
            a[index] = Math.pow(a[index], 2.0);
            powArray(a, ++index);
        }
    }

    public static int[] histogram(int[] array, int count){
      int[] counter = new int[count];
      for (int element:array){
         counter[element]++;
      }
      return counter;
      }
    public static int indexOfMax(int[] numbers){
      int index = 0;
      for (int i=1;i<numbers.length;i++){
         if (numbers[i] > numbers[index]){
            index = i;
         }
      }
      return index;
   }
//enhanced loop
   /*public static int indexOfMaxEL(int[] num){
      int count = 0;
      int i = 0;
      for (int num:nums){
         if (nums[i] > nums[count]){
            count = i;
         }
         i++;
      }
      return count;
   }*/  
  public static boolean[] sieve(int n){
      boolean[] result = new boolean[n];
      for (int i=2;i<n;i++)
         result[i] = true;
      for (int number=2;number<=(int)Math.sqrt(n);number++){
         if (result[number] == true){
            for (int listIndex = number*number;listIndex < n;listIndex += number){
               result[listIndex] = false;
            }
         }
      }
      return result;
   }
      }


    
