package Likelion.Oct;

import java.util.HashMap;
import java.util.Map;

//프로그래머스 완주하지 못한 선수
class Oct27 {
    //해시맵 memo에 Participant를 모두 넣는다.
    //completion에 들어있는 이름을 key로 해시Map에 저장. 있으면 0으로 check
    //memo를 1바퀴 돌며 1인 값 찾기
    //1명인 key return
    //문제점 : 동명이인 처리 불가

    //내가 몰랐던 거 : Map, HashMap 메서드 활용 > 다시 확인하기

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();

        //1. 1차로 put 값 넣기
        for(int i = 0; i < participant.length; i++) {
            String key = participant[i];
            //바로 put을 할 수 없다.(해시 충돌)
            if (!memo.containsKey(key)) { //값 없으면 0으로 초화
                memo.put(key, 0);
            }
            //.get(key)는 key의 value 갖고 옴
            memo.put(key, memo.get(key) + 1); //값 있으면 +1 count
        }

        //2. completion 한 바퀴 돌려서
        for(int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, memo.get(key) - 1); //값이 있으면 다시 -1 count
        }

        for(String key : memo.keySet()) { //key값 순회해서 1인 값 key return
            if (memo.get(key) == 1)
                return key;
        }

        return "";
        }
    }