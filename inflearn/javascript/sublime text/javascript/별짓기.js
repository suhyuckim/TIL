//별 하나씩 늘리기
for(var star=0; star<=5; star++){
	console.log("*".repeat(star+1));
}

//별 하나씩 줄이기
for(var star=5; star>=1; star--){
	console.log("*".repeat(star));
}

//별 2배씩 늘리기
for(var star=1; star<=16; star *= 2){
	console.log("*".repeat(star));
}

//공백 별짓기
for(var star=5; star>=1; star--){
	console.log(" ".repeat(5-star)+"*".repeat(star));
}

//역삼각형 별짓기
for(var star=9; star>=1; star-=2){
	console.log(" ".repeat((9-star)/2)+"*".repeat(star));
}