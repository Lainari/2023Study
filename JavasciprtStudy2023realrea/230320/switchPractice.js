// 230320 Class Time
let value = 'F';
switch(value){
    case 'A':
        console.log('A');
        break;
    case 'B':
        console.log('B');
        break;
    case 'C':
        console.log('C');
        break;
    default:
        console.log(`아무것도 일치하지 않음`);
}

// 3항 연산자
5 > 0 ? `참입니다` : `거짓입니다`;
// 결과 : 참입니다

// while 무한 반복
while(true){
	console.log('Hello, World!');
}
// 무한 반복

let i = 1;
while(i<=100){
    console.log(`Hello, World!`);
    i++;
}
// 결과 : (100) Hello, World!


// for문 실행순서
for(/*1번, 초기식*/let i = 0; /*2번, 조건식*/i < 100; /*4번, 변화식*/i++){
    /*3번, 실행*/console.log(`Hello, for!`);
}
// 2번이 참이면 2번에서 4번 구간을 반복

// while문과 for문 비교
// 1. while문
let a = 0;
while(a < 100){
    console.log(`Hello, World!`);
    a++;
}

// 2. for문
for(let b = 0; b < 100; b++){
    console.log(`Hellow, World!`);
}

// continue 문으로 코드 실행 건너뛰기
let ii = 0;
while (ii < 10) {
ii++;
if (ii % 2 === 0) {
continue;
}
console.log(ii);
}
// 결과 : 1, 3, 5, 7, 9

// 중첩 반복문 사용하기
for (let i = 0; i < 10; i++) {
    for (let j = 0; j < 10; j++) {
        console.log(i, j);
    }
}
// 삼중 반복문
for (let i = 0; i < 5; i++) {
    if (i % 2 === 0) continue;
    for (let j = 0; j < 5; j++) {
        if (j % 2 === 0) continue;
        for (let k = 0; k < 5; k++) {
            if (k % 2 === 0) continue;
                console.log(i, j, k);
        }
    }
}

// 결과 : 1 1 1, 1 1 3, 1 3 1, 1 3 3, ... , 3 3 1, 3 3 3