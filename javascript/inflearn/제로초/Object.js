//object 변수에 객체를 저장
var object = {
	name : "John",
	height : 180,
	weight : 70,	
}

//객체안에 함수를 넣을수가 있다.
var object_1 = {
	name : "John", //속성
	eat : function eat(){
		console.log("yummy!");
	},  //함수가 들어있는 속성을 메소드라고 한다.
}