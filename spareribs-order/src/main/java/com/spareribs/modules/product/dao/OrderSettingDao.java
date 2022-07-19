package com.spareribs.modules.product.dao;

import com.spareribs.modules.product.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author gongxin
 * @email 18910026892@gmail.com
 * @date 2022-07-19 22:02:46
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}