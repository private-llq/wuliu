package com.wuliu.system.modules.cable.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wuliu.system.modules.cable.entity.Insurance;
import com.wuliu.system.modules.cable.vo.InsuranceListVo;

/**
 * 车保险表
 */
public interface IInsuranceService extends IService<Insurance> {
    /**
     * 根据车牌号码查询车辆保险信息
     */
    IPage<InsuranceListVo> getInsurancePage(InsuranceListVo insurance, Page<InsuranceListVo> page);

}
