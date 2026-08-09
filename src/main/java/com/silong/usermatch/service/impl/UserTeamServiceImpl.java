package com.silong.usermatch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.silong.usermatch.mapper.UserTeamMapper;
import com.silong.usermatch.model.domain.UserTeam;
import com.silong.usermatch.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
* @author 15214
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2026-08-09 15:21:26
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService {

}




