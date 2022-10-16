
// 원의 반지름 길이 입력하면 넓이를 출력하는 프로그램 만들기

function circle(n) {
    const result = n * n * 3.14;
    return result;
}

const r = prompt ("원의 반지름을 입력하세요.");
console.log(circle(r));

/*
정답에서는 필요한 함수를 먼저 정의하고 이를 prompt와 결합해 사용. 이 코드가 더 효율적이어 보인다.
아래는 내가 짠 코드. 나는 절차지향(?)마냥 썼음..
var length = prompt ("반지름의 길이를 입력해 주세요 (정수값)");
var width = length * length * 3.14;
console.log(width);
*/
