/*
사용법 : getRandom 호출 시 당신이 원하는 수를 넣으세요
		ex) getRandom(5) 를 넣으면 0~4를 반환
*/
function getRandom(num){
	var r=Math.random();
	var n=parseInt(r*num);
	return n;	// 함수 중 return에 값을 명시하여, 호출한 자가 그 값을 반환받고록 처리하는 함수를
				// 리턴값 있는 함수, 반환값이 있는 함수라 한다.
}

// ex) 2,7 --> 2~6까지의 수가 나온다
function getRandomByRange(min, max){
	return parseInt(Math.random()*(max-min))+min;
}


/*
시간 문자열 처리 함수
호출자는 아래의 사항을 숙지하고 쓰세요...
인수로 넘긴 n이 10보다 작으면, 앞에 "0"이라는 문자를 조합해서 결과를 반환해주자.
*/
function getTimeString(n){
	if(n<10){
		n="0"+n;
	}
	return n;
}

/*
	인수 1 : 나 객체
	인수 2 : 상대방 객체
*/
function collisionCheck(me, target) {
	//나의 너비가 상대의 범위에 있는지 체크
	var horizon1=me.x+me.width >= target.x;  //좌측에서 우측으로 접근시
	var horizon2=me.x <= target.x+target.width; //우측에서 좌측으로 접근시
	//나의 높이가 상대의 범위에 있는지 체크
	var vertical1=(me.y+me.height >= target.y);  //위에서 아래로 접근시
	var vertical2=(me.y <= target.y+target.height); //아래에서 위로 접근시

	return (horizon1 && horizon2) && (vertical1 && vertical2);

}

// 배열에서 최대값인 인덱스값을 출력하는 함수
function maxValueIndex(array) {
	var maxIndex=0;
	for(var i=0; i<array.length; i++){
		if(array[maxIndex]<array[i]){
			maxIndex = i;
		}
	}
	return maxIndex;
}
