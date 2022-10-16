
// 알파벳 하나만을 입력하고, 그 알파벳이 대문자이면 yes를 아니면 no를 출력하는 프로그램 만들기


// 내가 쓴 방법 : 정규표현식 + if문
function find (n) {
    if (n.match(/A-Z/g)) {
        return "YES";
    } else {
        return "NO";
    }
}

var alphabet = prompt("알파벳을 입력해주세요.");

console.log(find(alphabet));


// 답안. 대문자와 소문자의 대조로 해결
const data = prompt('알파벳을 입력하세요.');
if (data === data.toUpperase()) {
    console.log('YES');
} else {
    console.log('NO');
}
