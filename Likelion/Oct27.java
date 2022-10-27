package Likelion;

import java.util.HashMap;
import java.util.Map;

//프로그래머스 완주하지 못한 선수
class Oct27 {
    //해시맵 memo에 Participant를 모두 넣는다.
    //completion에 들어있는 이름을 key로 해시Map에 저장. 있으면 0으로 check
    //memo를 1바퀴 돌며 1인 값 찾기
    //1명인 key return
    //문제점 : 동명이인 처리 불가
    //내가 몰랐던 거 : Map, HashMap 메서드 활용법

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();

        for(int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.put(key, 1);
        }

        for(int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, 0);
        }

        for(String key : memo.keySet()) {
            if (memo.get(key) == 1)
                return key;
        }

        return "";
        }
    }