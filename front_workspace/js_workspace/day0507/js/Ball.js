/*현실의 공을 정의한다*/
class Ball{
    //이 공이 태어날때 부여하고 싶은 특징들을 여기서 결정(생성자)
    constructor(container, x, y, width, height, velX,velY, bg){
        this.container=container; //이 공을 어디에 붙일지 결정..
        this.div=document.createElement("div");
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.velX=velX; //x축으로의 속도
        this.velY=velY; //y축으로의 속도 
        this.bg=bg; //공의 색상 

        //style 
        this.div.style.position="absolute";
        this.div.style.left=this.x+"px";
        this.div.style.top=this.y+"px";

        this.div.style.width=this.width+"px";
        this.div.style.height=this.height+"px";
        this.div.style.background=this.bg;
        this.div.style.borderRadius=50+"%";

        //넘겨받을 대상 컨테이너가 document.body 일 수도 있고, wrapper 일수도
        //있다, 즉 결정되어 잇지 않음..개발자가 호출 시 결정해야 함
        this.container.appendChild(this.div);
    }   
    
    //현재 이 공의 움직임을 정의한다 (메서드)
    move(){
        this.x+=this.velX;// 지정한 속도만큼 씩  누적
        this.y+=this.velY; //지정한 속도만큼 씩  누적
        //각 4면을 만날때마다, 적절하게 velX, velY를 양수로 부여할지, 음수로 
        //부여할지만 결정하면, 방향을 바꾼다..
        if(this.x<=0 || this.x >=(600-this.width)){
            this.velX=-this.velX;
        }
        if(this.y<=0 || this.y >=(600-this.height) ){ //공의 y축값이 위 또는 아래쪽 경계에 도달하면..
            this.velY=-this.velY;
        }


        this.div.style.left=this.x+"px";
        this.div.style.top=this.y+"px";         
    }
}