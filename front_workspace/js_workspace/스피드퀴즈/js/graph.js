// 그래프 그릴때 사용하는 클래스
class Graph {
    constructor(container, scoreArray, maxWidth, height, group) {
        this.container = container;
        this.scoreArray = scoreArray;
        this.maxWidth = maxWidth;     // 최대 길이
        this.height = height;   // 그래프 높이
        this.group = group; // 몇조인지(인덱스값으로)
        this.top = this.group * this.height + 20*this.group;
        
        // 조 이름 출력
        this.h1 = document.createElement("h3");
        this.h1.innerText = (group+1) + "조";
        this.h1.style.position = "absolute";
        this.h1.style.top = this.top + "px";
        this.h1.style.color="white";
        container.appendChild(this.h1);

        // 그래프 그리기
        this.div = document.createElement("div");
        this.div.style.width = 10 + "px";
        this.div.style.height = this.height + "px";
        this.div.style.float = "left";
        this.div.style.background = "#D9E5FF";
        this.div.style.position = "absolute";
        this.div.style.top = this.top + "px";
        this.div.style.left = 30+"px";
        this.div.style.color = "#363636";
        this.div.style.fontSize = 25+"px";
        this.div.style.paddingLeft = 10+"px";
        this.div.style.overflow="hidden";
        

        container.appendChild(this.div);

    }

    draw(scoreArray) {
        var maxScoreIndex = maxValueIndex(scoreArray);

        if (i == maxScoreIndex && scoreArray[i] != 0) {	// 최고 점수 그래프 그리기
            this.div.style.width = 80 + "%";
            this.div.innerText = scoreArray[i] + "점";
        } else if (scoreArray[i] != 0) {// 점수가 0이 아닐때 동작
            var num = scoreArray[i] / scoreArray[maxScoreIndex] * 80	// 100분율 구함
            this.div.style.width = num + "%";
            this.div.innerText = scoreArray[i] + "점";
        }
    }
}