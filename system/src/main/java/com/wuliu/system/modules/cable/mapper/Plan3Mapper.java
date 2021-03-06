package com.wuliu.system.modules.cable.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wuliu.system.modules.cable.dto.Plan3Im;
import com.wuliu.system.modules.cable.entity.Plan3;
import com.wuliu.system.modules.cable.vo.IndexLCTJVo;
import com.wuliu.system.modules.cable.vo.Plan3ExcelVo;
import com.wuliu.system.modules.cable.vo.Plan3Vo;
import com.wuliu.system.modules.cable.vo.SendOrdersVo;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * 计划表3
 */
public interface Plan3Mapper extends BaseMapper<Plan3> {
    /**
     * 计划1批量派单的数据
     */
    List<SendOrdersVo> idsqueryChuList(@Param("ids") List<String> ids);

    /**
     * 查询计划3批量出库完单的数据
     */
    List<Plan3Vo> getPlan3ReceivingStorageList(@Param("ids") List<Serializable> ids);

    /**
     * 查询计划3批量入库完单的数据
     */
    List<Plan3> getPlan3DeliverStorage(@Param("ids") List<Serializable> ids);

    /**
     * 分页展示计划表3数据
     */
    List<Plan3> pageList(@Param("plan3") Plan3 plan3, @Param("page") Page<Plan3> page);

    /**
     * 导出计划表3数据
     */
    List<Plan3Im> exportPlan3(@Param("plan3") Plan3 plan3);

    /**
     * 计划表3新品统计
     */
    List<Plan3Vo> selectNewproducts(@Param("materialDescribe") String materialDescribe, @Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("planType") String planType, @Param("page") Page<Plan3Vo> page);

    /**
     * 导出数据
     */
    List<Plan3ExcelVo> exportPlan2(@Param("plan3ExcelVo") Plan3ExcelVo plan3ExcelVo);

    /**
     * 首页临措统计
     */
    List<IndexLCTJVo> getLCTJList(@Param("vo") IndexLCTJVo vo);
}
