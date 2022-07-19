package com.spareribs.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spareribs.common.utils.PageUtils;
import com.spareribs.modules.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author gongxin
 * @email 18910026892@gmail.com
 * @date 2022-07-19 21:47:04
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

