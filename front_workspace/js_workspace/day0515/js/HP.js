/*체력을 표현하는 HP 정의*/
class HP{
    constructor(container, x, y, width, height, bg, borderColor){
        this.container=container;
        this.div=document.createElement("div");
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.bg=bg;
        this.borderColor=borderColor;

        //스타일 및 조립 
        this.div.style.position="absolute";
        this.div.style.left=this.x+"px";
        this.div.style.top=this.y+"px";

        this.div.style.width=this.width+"px";
        this.div.style.height=this.height+"px";

        this.div.style.background=this.bg;
        this.div.style.border="1px solid "+this.borderColor;

        this.container.appendChild(this.div);
    }
}




