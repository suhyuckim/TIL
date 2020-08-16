var 이미지좌표="0";

var 가위바위보 = { //딕셔너리 자료구조
	바위 : "0",
	가위 : "-1452px",
	보 : "-284px"
};

function 컴퓨터의선택(이미지좌표){
	return Object.entries(가위바위보).find(function(v) {
	return v[1] === 이미지좌표; 
	})[0];
}

var 인터벌;
	function 인터벌메이커() {
		인터벌 = setInterval(function() {
		if(이미지좌표 === 가위바위보.바위){
			이미지좌표=가위바위보.가위;
		} else if(이미지좌표 === 가위바위보.가위){
			이미지좌표=가위바위보.보;
		} else {
			이미지좌표=가위바위보.바위;	
		}
		document.querySelector("#computer").style.background =
		"url(https://en.pimg.jp/023/182/267/1/23182267.jpg)"+이미지좌표+" 0";
	}, 100);
}


/*
	가위 : 1, 바위 : 0, 보 : -1
    나/컴퓨터  가위  바위  보
		 가위  1/1  1/0	 1/1
		 바위  0/1  0/0  0/-1
		   보 -1/1 -1/0 -1/-1 
*/
인터벌메이커();
var 점수표 = {
	가위 : 1,
	바위 : 0,
	보 : -1
};

//querySelectorAll는 for문 아닌 forEach를 지원한다.
document.querySelectorAll(".btn").forEach(function(btn) {
	btn.addEventListener("click", function() {
	clearInterval(인터벌);
	setTimeout(function(){
		인터벌메이커();
	}, 1000);
	var 나의선택 = this.textContent;
	var 나의점수 = 점수표[나의선택];
	var 컴퓨터점수 = 점수표[컴퓨터의선택(이미지좌표)];
	var 점수차 = 나의점수 - 컴퓨터점수;
	//위에 긴 코드를 아래처럼 줄였음	
	/* 
		점수표[나의선택] - 점수표[컴퓨터의선택(이미지좌표)] === -1 || 점수표[나의선택] - 점수표[컴퓨터의선택(이미지좌표)] === 2
		|| 연산자를 배열.includes로 줄일 수 있다.
		[-1,2] 이 위 배열에 들어있는 배열에 점수표 뺀것이 위 배열에 들어있으면 true.
	*/
		if(점수차 === 0) {
			console.log("비겼습니다.");
		}else if([-1,2].includes(점수차)){
			console.log("이겼습니다.");
		}else{
			console.log("졌습니다.");
		}
/*	
		if(나의선택 === "가위"){
			if(컴퓨터의선택(이미지좌표) === "가위"){
				console.log("비겼습니다.");
			}else if(컴퓨터의선택(이미지좌표) === "바위"){
				console.log("졌습니다.");
			}else{
				console.log("이겼습니다.");
			}
		}else if(나의선택 === "바위"){
			if(컴퓨터의선택(이미지좌표) === "가위"){
				console.log("이겼습니다.");
			}else if(컴퓨터의선택(이미지좌표) === "바위"){
				console.log("비겼습니다.");
			}else{
				console.log("졌습니다.");
			}
		}else if(나의선택 === "보"){
			if(컴퓨터의선택(이미지좌표) === "가위"){
				console.log("졌습니다");
			}else if(컴퓨터의선택(이미지좌표) === "바위"){
				console.log("이겼습니다.");
			}else{
				console.log("비겼습니다.");
			}
		}
*/		
	});	
});