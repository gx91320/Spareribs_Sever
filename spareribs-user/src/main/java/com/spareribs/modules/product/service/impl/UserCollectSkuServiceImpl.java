package com.spareribs.modules.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spareribs.common.utils.PageUtils;
import com.spareribs.common.utils.Query;

import com.spareribs.modules.product.dao.UserCollectSkuDao;
import com.spareribs.modules.product.entity.UserCollectSkuEntity;
import com.spareribs.modules.product.service.UserCollectSkuService;


@Service("userCollectSkuService")
public class UserCollectSkuServiceImpl extends ServiceImpl<UserCollectSkuDao, UserCollectSkuEntity> implements UserCollectSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserCollectSkuEntity> page = this.page(
                new Query<UserCollectSkuEntity>().getPage(params),
                new QueryWrapper<UserCollectSkuEntity>()
        );

        return new PageUtils(page);
    }

}