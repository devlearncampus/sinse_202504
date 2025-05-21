class Hero extends GameObject{
    constructor(container, x, y, width, height, velX, velY, bg, border, borderColor){
        super(container, x, y, width, height, velX, velY, bg, border, borderColor); 

        this.upSensor=new UpSensor(this.div, this,  4 , 0 , this.width-8 , 3, "blue", 0, ""); 
        this.downSensor=new DownSensor(this.div, this,  4 , this.height-3 , this.width-8 , 3, "blue", 0, ""); 
        this.leftSensor=new LeftSensor(this.div, this,  0 , 3 , 3 , this.height-6, "blue", 0, ""); 
        this.rightSensor=new RightSensor(this.div, this,  this.width-3 , 3 , 3 , this.height-6, "blue", 0, "");
    }

    //센서 보이기 옵션
    showHideSensor(flag){
        this.upSensor.setVisible(flag);
        this.downSensor.setVisible(flag);
        this.leftSensor.setVisible(flag);
        this.rightSensor.setVisible(flag);
    }

    //부모의 메서드 오버라이드 
    tick(){
        this.x+=this.velX;
        this.y+=this.velY;
    }
    
    render(){        
        //센서는 현재 자신의 값에 주인공의 위치값을 더한 값으로 충돌 계산이 이루어져야 함
        this.upSensor.setFakeValue(4, 0);
        this.downSensor.setFakeValue(4 , this.height-3);
        this.leftSensor.setFakeValue(0, 5);
        this.rightSensor.setFakeValue(this.width-3 , 5);
        
        this.div.style.left=this.x+"px";
        this.div.style.top=this.y+"px";
    }
}