package com.spareribs.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spareribs.common.utils.PageUtils;
import com.spareribs.modules.product.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author gongxin
 * @email 18910026892@gmail.com
 * @date 2022-07-19 22:02:46
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

