class Bullet extends GameObject{
    constructor(container, src, x, y, width, height,velX,velY){ 
        super(container, src, x, y,width, height, velX,velY);
    }
    //제거 메서드 
    removeObject(){
        //1) 화면에서 제거 
        //2) 총알이 있던 배열에서도 제거 (제거 안하면 반복문이 계속 총알이 있는 줄 안다)
    }

    tick(){
        this.x+=this.velX;
    }
    render(){
        this.img.style.left=this.x+"px";
    }
}