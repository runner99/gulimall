package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 商品库存
 *
 * @author weizhenqiang
 * @email weizhenqiang@gmail.com
 * @date 2022-10-06 23:59:39
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    void addStock(@Param("skuId") Long skuId, @Param("wareId") Long wareId, @Param("skuNum") Integer skuNum);
}
