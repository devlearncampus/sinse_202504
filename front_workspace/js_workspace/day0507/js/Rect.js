/* 현실의 사각형 막대를 정의한다*/
class Rect{
    constructor(container, x, y, width, height,bg){
        this.container=container;
        this.div=document.createElement("div");
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.bg=bg;
        this.a=0.1;
        this.targetH=400;

        //style 부여 
        this.div.style.position="absolute";
        this.div.style.left=this.x+"px";
        this.div.style.top=this.y+"px";

        this.div.style.width=this.width+"px";
        this.div.style.height=height+"px";

        this.div.style.background=this.bg;

        this.container.appendChild(this.div);//부모에 부착 
        
        this.move();//태어나자 마자, 나의 루프를 호출!!
    }   

    move(){
        console.log("move()...");
        //여기서 막대의 크기를 감속도 공식을 적용하여 움직여보자 
        //나의높이는 = 현나높이 + a*(목표높이 - 현나높이)
        this.div.style.height=parseFloat(this.div.style.height) + this.a*(this.targetH-parseFloat(this.div.style.height))+"px";

        setTimeout( ()=>{
            this.move();
        } , 10 );
    }
}