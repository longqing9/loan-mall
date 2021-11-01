package cn.longq.loan.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.longq.common.utils.PageUtils;
import cn.longq.loan.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author Liuhualong
 * @email lhl@163.com
 * @date 2021-10-31 09:41:39
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

