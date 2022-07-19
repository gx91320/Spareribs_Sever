package com.spareribs.modules.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spareribs.common.utils.PageUtils;
import com.spareribs.common.utils.Query;

import com.spareribs.modules.product.dao.UserStatisticsDao;
import com.spareribs.modules.product.entity.UserStatisticsEntity;
import com.spareribs.modules.product.service.UserStatisticsService;


@Service("userStatisticsService")
public class UserStatisticsServiceImpl extends ServiceImpl<UserStatisticsDao, UserStatisticsEntity> implements UserStatisticsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserStatisticsEntity> page = this.page(
                new Query<UserStatisticsEntity>().getPage(params),
                new QueryWrapper<UserStatisticsEntity>()
        );

        return new PageUtils(page);
    }

}