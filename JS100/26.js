
// 행성의 한글 이름을 입력하면 영어 이름을 반환하는 프로그램 만들기
// 객체를 만들고, 입력을 해서, key 값에 접근하면, value값을 반환하면 되지 않을까?
// 접근 방식은 맞았넹! 그런데 구현이 딸리네 ^^...

var name = prompt("행성 이름을 입력해주세요",[vlaue]);

var planets = {
    '수성' : 'Mercury',
    '금성' : 'Venus',
    '지구' : "Earth",
    '화성' : 'Mars',
    '목성' : 'Jupiter',
    '토성' : 'Saturn',
    '천황성' : 'Uranus',
    '해왕성' : 'Neptune'
};

//planets 객체에 name 에 접근(여기서 name은 입력값), 해당하는 값을 출력함.
console.log(planets[name]);