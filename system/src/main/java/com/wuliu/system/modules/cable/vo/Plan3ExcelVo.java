package com.wuliu.system.modules.cable.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class Plan3ExcelVo implements Serializable {
    private static final long serialVersionUID = 1931889797509480354L;


    // 开始时间
//    @Excel(name = "开始时间", width = 15)
    private String beginTime;

    // 截止时间
//    @Excel(name = "截止时间", width = 15)
    private String endTime;

    // 废旧物料描述
    @Excel(name = "废旧物料描述", width = 30)
    private String materialDescribe;
    // 入库数量/中间库
    @Excel(name = "入库数量/中间库", width = 15)
    private String warehousingNum;

    // 出库数量/神州仓库
    @Excel(name = "出库数量/神州仓库", width = 15)
    private String warehouseOutNum;

    // 单位
    @Excel(name = "单位", width = 15)
    private String itemText;

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
