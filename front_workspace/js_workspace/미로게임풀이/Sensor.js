class Sensor extends GameObject{
    constructor(container, hero, x, y, width, height, bg, border, borderColor){
        super(container, x, y, width, height, 0,0,bg, border, borderColor); 

        this.hero=hero; //센서만 보유하고, GameObject 에는 보내지 말자
        
        //충돌체크시에 용도로만 사용할 위치값
        this.fakeX;
        this.fakeY;
        this.setVisible(false);
    }
    setFakeValue(fakeX, fakeY){};

    setVisible(flag){        
        this.div.style.display=(flag)? "block":"none";
    };
}