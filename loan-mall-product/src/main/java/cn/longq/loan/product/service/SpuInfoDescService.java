package cn.longq.loan.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.longq.common.utils.PageUtils;
import cn.longq.loan.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author Liuhualong
 * @email lhl@163.com
 * @date 2021-10-31 09:41:40
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

