package com.whitecrow.cva.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.whitecrow.cva.model.domain.User;
import com.whitecrow.cva.model.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ListTeamUserMapper extends BaseMapper<TeamMapper> {
    /**
     * 查询到对应每一个队伍的 leader
     *
     * @param userId
     * @return
     */
    @Select("select u.* from team t left join user u on t.userId = u.id where u.id = #{userId}")
    List<UserVO> listTeamLeader(@Param("userId") Long userId);

    /**
     * 查询到对应每一个队伍的成员
     *
     */
    @Select("select u.* from team t left join user_team ut on t.id = ut.teamId left join user u on u.id = ut.userId where ut.teamId = #{teamId} and u.isDelete = 0 and ut.isDelete = 0 and t.isDelete = 0")
    List<UserVO> listTeamUsers(@Param("teamId") Long teamId);

    @Select("Select Count(*) from user_team where teamId=#{teamId}")
    Integer hasJoinNum(@Param("teamId")Long teamId);
}