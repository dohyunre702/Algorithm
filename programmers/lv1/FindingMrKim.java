package programmers.lv1;

//서울에서 김서방 찾기
//.equals() : 문자열 비교하는 방법
public class FindingMrKim {
    public String solution(String[] seoul) {
        int a = 0;
        for(int i =0; i< seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                a = i;
                break;
            }
        }
        return "김서방은 " + a + "에 있다";

    }

    public static void main(String[] args) {
        String [] example = {"Jane", "Kim"};

        FindingMrKim result = new FindingMrKim();
        System.out.println(result.solution(example));
    }
}
