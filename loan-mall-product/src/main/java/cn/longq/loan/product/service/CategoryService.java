package cn.longq.loan.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.longq.common.utils.PageUtils;
import cn.longq.loan.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author Liuhualong
 * @email lhl@163.com
 * @date 2021-10-31 09:41:40
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

