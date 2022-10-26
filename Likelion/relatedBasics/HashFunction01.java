package Likelion.relatedBasics;

import java.util.ArrayList;
import java.util.List;

public class HashFunction01 {
        class Node {
            private String key;
            private Integer value;

            public Node(String key, Integer value) {
                this.key = key;
                this.value = value;
            }
            public String getKey() {
                return key;
            }

            public Integer getValue() {
                return value;
            }
        }

    List<Node>[] table = new ArrayList[1000];

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }

    public void insert(String key, int value) {
        //list
        int hashIdx = hash(key);
        if (this.table[hashIdx] == null) { //null일 때 생성
            this.table[hashIdx] = new ArrayList<>();
        }
        //1.map. 2. object
        this.table[hashIdx].add(new Node(key, value));
    }

    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)]; //리스트 노드 받아오기
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                return node.value;
            }
        }   return null;
    }

        public static void main (String[]args){
            HashFunction01 hf = new HashFunction01();
            hf.hash("Dohyun");
        }
    }
