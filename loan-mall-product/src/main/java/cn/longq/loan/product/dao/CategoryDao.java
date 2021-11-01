package cn.longq.loan.product.dao;

import cn.longq.loan.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Liuhualong
 * @email lhl@163.com
 * @date 2021-10-31 09:41:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}