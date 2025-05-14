/*모든 새들의 어버이 격인 그냥 새를 정의*/
class Bird{
    constructor(color){
        this.x;
        this.color=color;
        console.log("Bird의 생성자 호출됨");
    }
    eat(){
        console.log("새가 먹이를 먹어요");
    }
    fly(){
        console.log("새가 날아요");
    }
}