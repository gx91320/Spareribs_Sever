package com.spareribs.modules.product.dao;

import com.spareribs.modules.product.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author gongxin
 * @email 18910026892@gmail.com
 * @date 2022-07-19 21:47:04
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
