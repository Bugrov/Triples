package triples;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int result = 0;
        for(int i = 0; i < size - 1; i++){
            if(arr[i] + 1 == arr[i+1]){
                for(int j = i; j < size - 1; j++){
                    if(arr[j] + 1 == arr[j+1]){
                        count++;
                        if(count == 3) {
                            result++;
                            count = 0;
                            break;
                        }
                    }else {
                        count = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
