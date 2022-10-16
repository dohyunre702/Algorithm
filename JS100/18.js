
// 여러 개의 값을 .split 매서드를 활용해 공백 기준으로 나누어 입력.
var scores = prompt("숫자를 입력하세요").split("")

let sum = i
//for 문으로 a, b, c 배열의 합을 차례대로 구하기
    for (var i; i < 3; i ++) {
        sum += parseInt(scores[i], 10);
    }
// 구해진 합계를 n개로 나눔.
console.log( Math.floor(sum/ 3));


/* parseInt(string, radix) 문자열 인자를 파싱해 특정 진수의 정수를 반환
string : 파싱할 값. 문자열이 아닐 경우 Tostring 추상연산을 사용해 문자열로 변환.
radix : string의 진수를 나타내는 2부터 36까지의 정수

참조:https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/parseInt

 */