class LeftSensor extends Sensor{
    constructor(container, hero, x, y, width, height, bg, border, borderColor){        
        super(container, hero, x, y, width, height, bg, border, borderColor); 
    }    

     //@method ovrriding   
    setFakeValue(fakeX, fakeY){        
        this.fakeX= hero.x+fakeX;
        this.fakeY= hero.y+fakeY;

        //주인공과 벽과의 충돌 검사( 벽 배열은 2차원 배열임) 
        for(let i=0;i<brickArray.length;i++){
            for(let a=0;a<brickArray[i].length;a++){
                if(collisionCheckBySensor(this, brickArray[i][a] )){
                    //this.hero.div.style.background="pink";
                    hero.x=brickArray[i][a].x+brickArray[i][a].width+2;
                }
            }
        }
 
    }    
}