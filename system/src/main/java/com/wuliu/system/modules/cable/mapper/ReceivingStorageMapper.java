package com.wuliu.system.modules.cable.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuliu.system.modules.cable.entity.ReceivingStorage;
import com.wuliu.system.modules.cable.vo.PlanVo;
import org.apache.ibatis.annotations.Param;

/**
 * 出库/完单表
 */
public interface ReceivingStorageMapper extends BaseMapper<ReceivingStorage> {

    /**
     * 根据id修改出库信息
     */
    void updateDS(@Param("PlanVo") PlanVo planVo);
}
