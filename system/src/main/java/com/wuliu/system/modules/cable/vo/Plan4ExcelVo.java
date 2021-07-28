package com.wuliu.system.modules.cable.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class Plan4ExcelVo implements Serializable {
    private static final long serialVersionUID = 1931889797509480354L;


    // 开始时间
//    @Excel(name = "开始时间", width = 15)
    private String beginTime;

    // 截止时间
//    @Excel(name = "截止时间", width = 15)
    private String endTime;
    // 规格
    @Excel(name = "规格", width = 30)
    private String voltageGrade;
    // 材质
    @Excel(name = "材质", width = 15)
    private String texture;

    // 长度(M)
    @Excel(name = "入库长度(M)", width = 15)
    private String length;

    // 重量(吨)
    @Excel(name = "入库重量(吨)", width = 15)
    private String weight;

    // 出库重量（吨）神州仓库
    @Excel(name = "出库重量（吨）神州仓库", width = 15)
    private String retrievalWeight;

    // 反馈日期
    @Excel(name = "反馈日期", width = 15)
    private String decommissioningDate;

    // 来源
    @Excel(name = "来源", width = 30)
    private String engName;

    // 备注
    @Excel(name = "备注", width = 15)
    private String remark;
}
