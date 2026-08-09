package com.silong.usermatch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.silong.usermatch.mapper.TeamMapper;
import com.silong.usermatch.model.domain.Team;
import com.silong.usermatch.service.TeamService;
import org.springframework.stereotype.Service;

/**
* @author 15214
* @description 针对表【team(队伍)】的数据库操作Service实现
* @createDate 2026-08-09 15:21:20
*/
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team>
    implements TeamService {

}




