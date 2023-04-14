// 끝말잇기 게임(Follow-Up Game)
/**
 * 프로그램 절차 작성시 원칙
 * 1. 프로그램의 절차의 갯수는 정해져 있어야 함
 * 2. 각 절차는 항상 같은 내용이어야 함
 * 3. 모든 가능성을 고려해야 함
 * 4. 예시는 절차를 검증하는데 사용 (가능한 다양한 예시 준비 필요)
 * 
 */

// 1. 게임에 몇 명 참가할지 묻는다
let playerNum = parseInt(prompt("참가할 인원수를 말씀해주세요"));

// 1-1. 해당 게임에는 최소 2명 이상이야만 진행 가능하다
while(playerNum < 2){
    playerNum = parseInt(prompt("게임은 최소 2인 이상부터 시작할 수 있습니다"));
}
// 1.2. 옳은 값이 들어온 경우에만 배열을 생성한다
let playerArray = new Array(playerNum);


// 2. 게임의 시작 순서를 정한다.
let startNum = parseInt(prompt("몇 번째 사람부터 시작하시겠습니까? (현재 인원수 : " + playerNum + ")"));

// 2.1. 게임 시작 순서 범위는 첫 번째 사람부터, 끝까지 사람의 수로 제한되어야 한다
while(startNum <= 0 || startNum > playerNum){
    startNum = parseInt(prompt("정확한 값을 입력해주세요(1 ~ "+ parseInt(playerNum) +")"));
}

// 3. 시작 순서에 따른 순번 배열을 생성한다
let playCountArray = new Array(playerNum);
for(i = 0; i < playerNum; i++){
    if(startNum == playCountArray.length){
        playCountArray[i] = startNum-1;
        startNum = 0;
    }else{
        playCountArray[i] = startNum-1;
    }
    startNum += 1;
}

// 4. 해당 배열순번에 따라 게임이 시작된다

// 4-1. 게임 시작은 사전에 몇번째 부터 시작하는지 정했으므로, playCountArray 배열에서 첫 원소를 가져온다
let count = 0;
playerArray[playCountArray[count]] = prompt("끝말잇기 시작~! " + "현재 순번 : " + (playCountArray[count] + 1))

// 5. 게임은 시작하게 되면 틀리기 전까지 계속 진행된다
while(true){
    // 5-1. 첫 사람이 진행이 끝났으므로 순번을 증가시킨다
    count++;

    // 5-2. 허나 그 순번 증가값이 배열의 범위를 넘어서게 된다면?
    if(count == playerNum){
        // 5-2-1 다시 첫 사람으로 회귀한다
        count = 0
        playerArray[playCountArray[count]] = prompt(playerArray[playCountArray[playerNum-1]] + " 현재 순번 : " + (playCountArray[count] + 1))
        if(playerArray[playCountArray[count]][0] == playerArray[playCountArray[playerNum-1]][(playerArray[playerNum-1].length)-1]){
            alert("정답!");
        }else{
            alert("틀렸습니다..!");
            break;
        }
        // 5-2-2 아니라면 회귀하지 않고 그대로 진행한다
    }else{
        playerArray[playCountArray[count]] = prompt(playerArray[playCountArray[count-1]] + " 현재 순번 : " + (playCountArray[count] + 1))
        if(playerArray[playCountArray[count]][0] == playerArray[playCountArray[count-1]][(playerArray[count-1].length)-1]){
            alert("정답!");
        }else{
            alert("틀렸습니다..!");
            break;
        }
    }
}