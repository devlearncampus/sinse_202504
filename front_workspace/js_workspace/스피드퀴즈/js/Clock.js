// 화면 중앙에서 타이머 표시해주는 이미지 클래스
class Clock{
    constructor(container, seq){
        this.container = container;
        this.seq = seq;

        this.img = document.createElement("img");
        this.img.src= "./img/turn_Off.png";
        this.img.style.transform = "rotate("+seq*3.6+"deg)";
        this.img.style.position = "absolute";
        this.img.style.top=0+"px";
        this.img.style.left=0+"px"
        this.img.style.opacity = 0.5;

        this.container.appendChild(this.img);

    }

    // 불 안들어왔을때
    turnOff(){
        this.img.src= "./img/turn_Off.png";
    }

    // 불 들어왔을떄
    turnOn(){
        this.img.src= "./img/turn_On.png";
    }

}