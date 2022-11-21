package programmers.lv1;

//서울에서 김서방 찾기
//.equals() : 문자열 비교하는 방법
public class FindingMrKim {
    public String solution(String[] seoul) {
        int a = 0;
        for(int i =0; i< seoul.length; i++) {
            if(seoul[i] == "Kim") {
                a = i;
                break;
            }
        }

        String[] temp = {"김서방은 ", "x", "에 있다"};
        temp[1] = String.valueOf(a);
        String answer = String.join("", temp);
        return answer;
    }

    public static void main(String[] args) {
        String [] example = {"Jane", "Kim"};

        FindingMrKim result = new FindingMrKim();
        System.out.println(result.solution(example));
    }
}
