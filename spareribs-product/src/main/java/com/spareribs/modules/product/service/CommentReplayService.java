package com.spareribs.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spareribs.common.utils.PageUtils;
import com.spareribs.modules.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author gongxin
 * @email 18910026892@gmail.com
 * @date 2022-07-19 21:47:04
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

