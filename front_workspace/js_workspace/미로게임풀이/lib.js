function collisionCheck(me, target) {
    const me_x = parseInt(me.style.left);
    const me_y = parseInt(me.style.top);
    const me_width = parseInt(me.style.width);
    const me_height = parseInt(me.style.height);
  
    const target_x = parseInt(target.style.left);
    const target_y = parseInt(target.style.top);
    const target_width = parseInt(target.style.width);
    const target_height = parseInt(target.style.height);
    
    //모든 4가지 조건이 아닌 경우엔 겹치는 영역이 있는 것이므로 충돌임 
    //충돌의 경우 반환값은 true 
    return !(
      me_x + me_width < target_x ||     // 내 오른쪽이 타겟 왼쪽보다 왼쪽에 있음
      me_x > target_x + target_width || // 내 왼쪽이 타겟 오른쪽보다 오른쪽에 있음
      me_y + me_height < target_y ||    // 내 아래쪽이 타겟 위보다 위에 있음
      me_y > target_y + target_height   // 내 위쪽이 타겟 아래보다 아래에 있음
    );
}

function collisionCheckBySensor(me, target) {
    const me_x = parseInt(me.fakeX);
    const me_y = parseInt(me.fakeY);
    const me_width = parseInt(me.div.style.width);
    const me_height = parseInt(me.div.style.height);
  
    const target_x = parseInt(target.div.style.left);
    const target_y = parseInt(target.div.style.top);
    const target_width = parseInt(target.div.style.width);
    const target_height = parseInt(target.div.style.height);
    
    //모든 4가지 조건이 아닌 경우엔 겹치는 영역이 있는 것이므로 충돌임 
    //충돌의 경우 반환값은 true 
    return !(
      me_x + me_width < target_x ||     // 내 오른쪽이 타겟 왼쪽보다 왼쪽에 있음
      me_x > target_x + target_width || // 내 왼쪽이 타겟 오른쪽보다 오른쪽에 있음
      me_y + me_height < target_y ||    // 내 아래쪽이 타겟 위보다 위에 있음
      me_y > target_y + target_height   // 내 위쪽이 타겟 아래보다 아래에 있음
    );
}