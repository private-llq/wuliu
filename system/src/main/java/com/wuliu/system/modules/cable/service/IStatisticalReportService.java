package com.wuliu.system.modules.cable.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wuliu.system.modules.cable.entity.SendOrdersSubtabulation;
import com.wuliu.system.modules.cable.vo.DepartureStatisticsDetailsVo;
import com.wuliu.system.modules.cable.vo.DepartureStatisticsVo;
import com.wuliu.system.modules.cable.vo.PersonnelTaskStatisticsVo;
import com.wuliu.system.modules.system.entity.SysUser;

import java.util.List;

/**
 * 统计报表模块
 */
public interface IStatisticalReportService extends IService<SendOrdersSubtabulation> {

    /**
     * 人员任务统计
     */
    IPage<PersonnelTaskStatisticsVo> getPersonnelTaskStatistics(String taskTime, String realName, Page<PersonnelTaskStatisticsVo> page);

    /**
     * 出车统计
     */
    IPage<DepartureStatisticsVo> getDepartureStatistics(String taskTime, Page<DepartureStatisticsVo> page);

    /**
     * 出车统计详情信息
     */
    IPage<DepartureStatisticsDetailsVo> getDepartureStatisticsDetails(String taskTime, String license, String month, Page<DepartureStatisticsDetailsVo> page);

    List<SysUser> getUsers();
}
