import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumbers {
    public static void Frequent(int[] numbers , int k){
        //sorting the array
        Arrays.sort(numbers);
        
        
    }

    //function to read numbers
    public void read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of elements to store:");
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Eneter element " +(i+1)+": ");
            int[] numbers;
            numbers[i] = scanner.nextInt();
        }
        

        public static void main(String[] args) {
            
        }
    }
    // //function to return mode
    // public int mode(){
    //     int[] frequencies = new int[]; 
    //         for (int mark : marks){
    //         frequencies[mark]++;
    //     }
    //     int mode=0;
    //     int maxFrequency = frequencies[0];
    //     for (int i=1; i<frequencies.length;i++){
    //         if (frequencies[i] > maxFrequency || (frequencies[i] == maxFrequency && i > mode)) {
    //             mode = i;
    //             maxFrequency = frequencies[i];
    //     }
    // }
    // return mode;
    // }
    
    // //function to return frequency of mode
    // public int getFreqAtMode(){
    //     int[] frequencies = new int[];

    //     for (int mark : marks){
    //         frequencies[mark]++;
    //     }
    //     int mode = 0;
    //     int maxFrequency = frequencies[0];

    //     for (int i = 1; i < frequencies.length; i++) {
    //         if (frequencies[i] > maxFrequency || (frequencies[i] == maxFrequency && i > mode)) {
    //             mode = i;
    //             maxFrequency = frequencies[i];
    //         }
    //     }

    //     return maxFrequency;
    // }
}
