package cn.longq.loan.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.longq.common.utils.PageUtils;
import cn.longq.loan.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author Liuhualong
 * @email lhl@163.com
 * @date 2021-10-31 09:41:40
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
