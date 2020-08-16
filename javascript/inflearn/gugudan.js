//구구단 랜덤
var 숫자1 = Math.ceil(Math.random()*9)+1;
var	숫자2 = Math.ceil(Math.random()*9)+1;
var 결과 = 숫자1 * 숫자2;

var 바디 = document.body;
var 단어 = document.createElement("div");
단어.textContent = String(숫자1) + "곱하기" + String(숫자2) + "는?";
document.body.append(단어);
var 폼 = document.createElement("form");
document.body.append(폼);
var 입력창 = document.createElement("input");
폼.append(입력창);
var 버튼 = document.createElement("button");
버튼.textContent = "입력";
폼.append(버튼);
var 결과창 = document.createElement("div");
document.body.append(결과창);

폼.addEventListener("submit", function callback(이벤트){
	이벤트.preventDefault();
	if(결과 === Number(입력창.value)){
		결과창.textContent = "정답입니다.";
		숫자1 = Math.ceil(Math.random()*9)+1;
		숫자2 = Math.ceil(Math.random()*9)+1;
		결과 = 숫자1 * 숫자2;
		단어.textContent = String(숫자1) + "곱하기" + String(숫자2) + "는?";
		입력창.value="";
		입력창.focus();
	} else {
		결과창.textContent = "틀렸습니다.";
		입력창.value="";
		입력창.focus();
	}
});

/*
while(true){	
	var number_1 = Math.floor(Math.random()*9)+1;
	var number_2 = Math.floor(Math.random()*9)+1;
	var result = number_1*number_2;
	var 조건 = true;
	while(조건){ 
		var answer = prompt(String(number_1)+"*"+String(number_2)+"는?");
		if(result === Number(answer)){
			alert("정답입니다.");
		}else{
			alert("오답입니다.");
		}
	}
}*/