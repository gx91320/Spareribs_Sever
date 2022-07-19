package com.spareribs.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spareribs.common.utils.PageUtils;
import com.spareribs.modules.product.entity.IntegrationHistoryEntity;

import java.util.Map;

/**
 * 购物积分记录表
 *
 * @author gongxin
 * @email 18910026892@gmail.com
 * @date 2022-07-19 21:44:51
 */
public interface IntegrationHistoryService extends IService<IntegrationHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
