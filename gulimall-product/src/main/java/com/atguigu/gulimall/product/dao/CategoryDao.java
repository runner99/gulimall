package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author weizhenqiang
 * @email weizhenqiang@gmail.com
 * @date 2022-09-06 21:19:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
