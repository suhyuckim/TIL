var 바디 = document.body;
var 숫자후보;
var 숫자배열;

function 숫자뽑기(){
	숫자후보 = [1,2,3,4,5,6,7,8,9];
	숫자배열 = [];
	for(var i=0; i<4; i++){
	var 뽑은것 =숫자후보.splice(Math.floor(Math.random() * (9-i)), 1)[0];
	숫자배열.push(뽑은것);
	}
}

console.log(숫자배열);

var 결과 = document.createElement("h1");
바디.append(결과);
var 폼 = document.createElement("form");
document.body.append(폼);
var 입력창 = document.createElement("input");
폼.append(입력창);
입력창.maxLength = 4;
var 버튼 = document.createElement("button");
버튼.textContent = "입력";
폼.append(버튼);

var 틀린회수 = 0;
폼.addEventListener("submit", function callback(이벤트){
	이벤트.preventDefault();
	var 답 : = 입력창.value;
	console.log(답);
	if(답 === 숫자배열.join('')){
		결과.textContent = "홈런";
		입력창.value;
		입력창.focus();
		숫자뽑기();
		틀린회수 = 0;
	}else{
		var 답배열 = 답.split();
		var 스트라이크 = 0;
		var 볼 = 0;
		틀린회수 += 1;
		if(틀린회수 > 10) {
			결과.textContent = "10번 넘게 틀리면 실패 답은"+숫자배열.join(',')+"였습니다.";
			입력창.value;
			입력창.focus();
			숫자뽑기();
			틀린회수 = 0;
		}else{
			for(var i=0; i<3; i++){
			if(Number(답배열[i]) === 숫자배열[i]){
				스트라이크++;
			}else if(숫자배열.indexO(Number(답배열[i])) > -1){
				볼++;
			}
		}
		결과.textContent = 스트라이크 + "스트라이크" + 볼 + "볼입니다.";
		입력창.value;
		입력창.focus();
		}
	}
});