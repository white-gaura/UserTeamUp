package com.whitecrow.cva.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.whitecrow.cva.model.domain.UserTeam;
import com.whitecrow.cva.service.UserTeamService;
import com.whitecrow.cva.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
* @author WhiteCrow
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2023-09-22 00:58:38
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




