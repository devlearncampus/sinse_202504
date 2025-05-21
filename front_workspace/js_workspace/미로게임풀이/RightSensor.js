class RightSensor extends Sensor{
    constructor(container, hero, x, y, width, height, bg, border, borderColor){        
        super(container, hero, x, y, width, height, bg, border, borderColor); 
    }    

     //@method ovrriding   
    //센서는 주인공 내부에 있기 때문에 따로 움직이지 않아도 쫓아 다닌다
    setFakeValue(fakeX, fakeY){        
        //hero 정보를 이용하여 충돌체크용 변수값 계산 
        //this.width-3 , 5
        this.fakeX= hero.x+fakeX;
        this.fakeY= hero.y+fakeY;

        //주인공과 벽과의 충돌 검사( 벽 배열은 2차원 배열임) 
        for(let i=0;i<brickArray.length;i++){
            for(let a=0;a<brickArray[i].length;a++){
                if(collisionCheckBySensor(this, brickArray[i][a] )){
                    //this.hero.div.style.background="pink";
                    hero.x=brickArray[i][a].x - hero.width;
                }
            }
        }
 
    }
}