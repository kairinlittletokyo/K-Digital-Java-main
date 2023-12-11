package ch09_array;

public class Ex02_ArrayBasic {
    public static void main(String[] args) {

        int[] numbers1 = {10, 20, 30, 40, 50};
        //배열 데이터 출력
        System.out.println("numbers1[0] = " + numbers1[0]);
        System.out.println("numbers1[1] = " + numbers1[1]);
        System.out.println("numbers1[2] = " + numbers1[2]);
        System.out.println("numbers1[3] = " + numbers1[3]);
        System.out.println("numbers1[4] = " + numbers1[4]);

        //배열의 반복문
        // --이 아래가 거의 공식임 + 무조건 0부터, 그리고 그 배열 크기보다 작을 때까지)
//        for (int i = 0; i < numbers1.length; i++) {
//            System.out.println("numbers1 = " + numbers1[i]);

        //내가 한 거 for(int numbers1 = 0; numbers1 > 10; numbers1++){


        //number1에 저장된 모든 데이터의 총합, 평균 계산

        int result = 0;
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("numbers1 = " + numbers1[i]);
            result += numbers1[i];
        }
        System.out.println("총 합은 = " + result + "입니다.");
        System.out.println("총 합의 평균은 = " + result / numbers1.length + " 입니다");   }
}
