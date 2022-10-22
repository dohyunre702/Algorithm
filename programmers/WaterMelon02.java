package programmers;

//수박수박수박수? 모범코드2
//삼항연산자 사용

public class WaterMelon02 {
    public String watermelon(int n){
        boolean flag = true;
        String result = "";
        while(n-- > 0){

            result += flag ? "수":"박";
            flag = !flag;
        }
        return result;
    }

    // 실행을 위한 테스트코드입니다
    public static void  main(String[] args){
        WaterMelon02 wm = new WaterMelon02();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}
