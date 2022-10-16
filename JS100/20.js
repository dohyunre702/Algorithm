

var divide = prompt("숫자를 입력하세요", [value]).split("");


var a = Math.floor(parseInt([0],10) /  parseInt([1], 10));
var b = parseInt([0],10) %  parseInt([1], 10);

console.log(a,b);


/* split 함수 : 문자열을 일정한 구분자로 잘라 배열로 저장하는 함수.
- 약간 엑셀의 데이터 나누기와 비슷한 것 같다.
문법
string.split(separator, limit)
- 문자열을 'separator'로 잘라서, 'limit' 크기 이하의 배열에 잘라진 문자열을 저장하여리턴.
- separator : optional. 문자열을 잘라 줄 구분자 (문자열 또는 정규식). 값이 입력되지 않으면 문자열 전체를 배열에 담아 리턴
- limit : optional. 최대 분할 갯수
 */