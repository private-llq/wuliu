package com.wuliu.system.modules.cable.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.wuliu.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车辆表
 */
@Data
@TableName("vehicle")
public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 车辆表id
     */
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "车辆表id")
    private Integer id;
    /**
     * 类型(字典 1 大卡车 2小皮卡)
     */
    @Excel(name = "类型(字典 1 大卡车 2小皮卡)", width = 15)
    @ApiModelProperty(value = "类型(字典 1 大卡车 2小皮卡)")
    @Dict(dicCode = "vehicle_type")
    private Integer type;
    /**
     * 载重 单位：吨
     */
    @Excel(name = "载重 单位：吨", width = 15)
    @ApiModelProperty(value = "载重 单位：吨")
    private String carryingCapacity;
    /**
     * 车牌号码(唯一)
     */
    @Excel(name = "车牌号码(唯一)", width = 15)
    @ApiModelProperty(value = "车牌号码(唯一)")
    private String license;
    /**
     * 发动机号
     */
    @Excel(name = "发动机号", width = 15)
    @ApiModelProperty(value = "发动机号")
    private String engineNumber;
    /**
     * 备注
     */
    @Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
    private String text;
    /**
     * 状态(字典 0正常 1 维修)
     */
    @Excel(name = "状态(字典 0正常 1 维修)", width = 15)
    @ApiModelProperty(value = "状态(字典 0正常 1 维修)")
    @Dict(dicCode = "vehicle_state")
    private Integer state;
    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "创建时间")
    private java.util.Date createTime;
    /**
     * 更新时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "更新时间")
    private java.util.Date updateTime;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private String createBy;
    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    private String updateBy;
    /**
     * backup1
     */
    @Excel(name = "backup1", width = 15)
    @ApiModelProperty(value = "backup1")
    private String backup1;
    /**
     * backup2
     */
    @Excel(name = "backup2", width = 15)
    @ApiModelProperty(value = "backup2")
    private String backup2;
    /**
     * backup3
     */
    @Excel(name = "backup3", width = 15)
    @ApiModelProperty(value = "backup3")
    private String backup3;
    /**
     * backup4
     */
    @Excel(name = "backup4", width = 15)
    @ApiModelProperty(value = "backup4")
    private String backup4;
    /**
     * backup5
     */
    @Excel(name = "backup5", width = 15)
    @ApiModelProperty(value = "backup5")
    private String backup5;
}
