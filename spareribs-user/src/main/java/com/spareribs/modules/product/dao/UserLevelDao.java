package com.spareribs.modules.product.dao;

import com.spareribs.modules.product.entity.UserLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级表
 * 
 * @author gongxin
 * @email 18910026892@gmail.com
 * @date 2022-07-19 21:44:51
 */
@Mapper
public interface UserLevelDao extends BaseMapper<UserLevelEntity> {
	
}
