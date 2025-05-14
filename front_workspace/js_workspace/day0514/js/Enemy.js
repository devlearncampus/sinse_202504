class Enemy extends GameObject{
    constructor(container, src, x, y, width, height,velX,velY){
        super(container, src, x, y, width, height,velX,velY);
    }

    //부모가 물려준, tick(), render()를 나의 상황에 맞게 오버라이딩 해버린다
    tick(){
        this.x+=this.velX;
    }
    render(){
        this.img.style.left=this.x+"px";
    }
}