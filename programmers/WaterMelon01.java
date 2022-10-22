package programmers;

//수박수박수박수? 모범코드1
//와 어떻게 한줄로 줄이지?????????
public class WaterMelon01 {
    public String watermelon(int n){

        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
        //char[]배열을 생성합니다. 이때는 빈 배열
        //n/2+1 ==> (n/2)+1 // 길이는 1부터 시작
        //"\0" 기본값으로 초기화되어 있는 배열에 "수박" 값을 넣어준다.
        //substring(0,n) : 0부터 n까지 자른다.

        //내 코드랑 다른 점 : char>string으로 바꾸기 어려우니까 아예 처음부터char배열을 만든 것

    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        WaterMelon01 wm = new WaterMelon01();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}

