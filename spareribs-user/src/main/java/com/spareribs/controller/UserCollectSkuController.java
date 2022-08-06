package com.spareribs.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spareribs.modules.product.entity.UserCollectSkuEntity;
import com.spareribs.modules.product.service.UserCollectSkuService;
import com.spareribs.common.utils.PageUtils;
import com.spareribs.common.utils.R;



/**
 * 关注商品表
 *
 * @author gongxin
 * @email 18910026892@gmail.com
 * @date 2022-07-19 21:44:51
 */
@RestController
@RequestMapping("product/usercollectsku")
public class UserCollectSkuController {
    @Autowired
    private UserCollectSkuService userCollectSkuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userCollectSkuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		UserCollectSkuEntity userCollectSku = userCollectSkuService.getById(id);

        return R.ok().put("userCollectSku", userCollectSku);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserCollectSkuEntity userCollectSku){
		userCollectSkuService.save(userCollectSku);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserCollectSkuEntity userCollectSku){
		userCollectSkuService.updateById(userCollectSku);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		userCollectSkuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
