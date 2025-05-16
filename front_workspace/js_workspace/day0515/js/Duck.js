class Duck{

    constructor(n){
        this.n=n;
    }
    fly(){
        console.log(this.n," 번째인 저는 날아요");
    }
    findMe(){
        //나는 과연 오리배열집단에서몇번째 존재이냐?
        let index=duckArray.indexOf(this);
        console.log("저는 저의 비밀을 알게되었어요..저는 ",index,"번째 에요");
        duckArray.splice(index, 1);
    }
}