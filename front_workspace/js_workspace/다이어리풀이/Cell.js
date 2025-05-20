class Cell{
    constructor(container, x, y, width, height, bg, borderColor, num){
        //[디자인 관련]
        this.container=container;
        this.div=document.createElement("div"); //셀 자체 
        this.numDiv=document.createElement("div"); //제일 상단 숫자 나올 곳
        this.titleDiv=document.createElement("div"); //숫자 밑에 제목 나올 곳 
        this.iconDiv=document.createElement("div");//아이콘 나올 곳
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.bg=bg;
        this.borderColor=borderColor;
        this.num=num;

        //셀 자체 div style
        this.div.style.position="absolute";
        this.div.style.left=this.x+"px";
        this.div.style.top=this.y+"px";
        this.div.style.width=this.width+"px";
        this.div.style.height=this.height+"px";
        this.div.style.background=this.bg;
        this.div.style.border="1px solid "+this.borderColor;
        this.div.style.boxSizing="border-box";
        this.div.style.borderRadius=5+"px";

        //제일 상단 숫자 div style
        this.numDiv.style.width=100+"%";
        this.numDiv.style.height=25+"px";
        this.numDiv.style.textAlign="right";
        this.numDiv.style.padding="0px 5px 0px 0px";
        this.numDiv.style.boxSizing="border-box";
        //this.numDiv.style.background="gray";

        //글 제목 div style
        this.titleDiv.style.width=100+"%";
        this.titleDiv.style.height=25+"px";
        //this.titleDiv.style.background="pink";

        //아이콘 div style
        this.iconDiv.style.width=100+"%";
        this.iconDiv.style.height=50+"px";
        //this.iconDiv.style.background="yellow";

        this.div.appendChild(this.numDiv);
        this.div.appendChild(this.titleDiv);
        this.div.appendChild(this.iconDiv);
        this.container.appendChild(this.div);

        //[다이어니 내용 관련]
        this.year=0;//작성연도
        this.month=0;//작성월
        this.date=0;//작성일

        //이벤트 연결 
        this.div.addEventListener("click", ()=>{
            openDialog(this, this.x, this.y);
            //title에 내용이 채워진 경우 수정 모드로 열어야 함             
            registFlag=(this.titleDiv.innerText.length>0)? false:true;
        });

        this.div.addEventListener("mouseover", ()=>{
            this.div.style.background="yellow";
        });
        this.div.addEventListener("mouseout", ()=>{
            this.div.style.background=this.bg;
        });

    }

    /*-----------------------------------------------
    날짜 반영
    -----------------------------------------------*/    
    setDate(year, month, date){
        this.year=year;
        this.month=month;
        this.date=date;        

        //화면에 렌더링
        this.numDiv.innerText=date;
    }

    /*-----------------------------------------------
    아이콘 그리기
    -----------------------------------------------*/
    renderIcon(iconSrc, width){
        this.icon=document.createElement("img");
        this.icon.src=iconSrc;
        this.icon.style.position="relative";
        this.icon.style.left=5+"px";
        this.icon.style.top=3+"px";        
        //아이콘의 최대 크기는 25로까지로 제한
        this.icon.style.width=((width>25)? 25:parseInt(width))+"px";
        this.iconDiv.appendChild(this.icon);
    }   
    
}


