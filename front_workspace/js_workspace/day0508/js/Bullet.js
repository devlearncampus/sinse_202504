/*총알을 정의한다*/
class Bullet{
    constructor(container, x, y, width, height, velX,velY){
        this.container=container;
        this.div=document.createElement("div");
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.velX=velX;
        this.velY=velY;

        //style 
        this.div.style.background="red";

        this.div.style.position="absolute";
        this.div.style.left=this.x+"px";
        this.div.style.top=this.y+"px";

        this.div.style.width=this.width+"px";
        this.div.style.height=this.height+"px";
        this.div.style.borderRadius=50+"%";
        //총알의 테두리에 블러효과 주기 
        this.div.style.filter="blur(5px)";//퍼짐 정보를 숫자로 표현

        this.container.appendChild(this.div);
    }

    //총알이 날아가는 기능 정의 
    move(){
        this.x+=this.velX;
        this.div.style.left=this.x+"px";
    }
}
