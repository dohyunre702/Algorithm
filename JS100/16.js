const upsidedown = prompt ("문장을 입력해주세요.");

const reverse_upsidedown = upsidedown.split("").reverse().join("");

console.log(reverse_upsidedown);


/* split("").reverse().join("");
문자열을 거꾸로 하는 함수가 없기 때문에 문자열을 나누고, 뒤집어서, 합쳐야 함.
 */