package ch09_array;

public class Ex07_ArrayEx {
    public static void main(String[] args) {

        int[]num = {3, 2, 1, 5, 4};
        int length = num.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i+1; j < length; j++) {
                //현재 원소가 다음 원소보다 크면 위치 교환
                if (num[j] < num[i]) {
                    int sum = num[j];
                    num[j] = num[i];
                    num[i] = sum;

                }
            }
        }

                        System.out.println("오름차순으로 정렬한 배열 ");
                    for (int i = 0; i < length; i++) {
                        if (i == num.length-1){
                            System.out.println(num[i]);
                        }else {
                        System.out.print(num[i] + ",");
                        }
                    }
    }
}
