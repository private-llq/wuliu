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
 * 仓库表
 */
@Data
@TableName("warehouse")
public class Warehouse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 仓库表id
     */
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "仓库表id")
    private Integer id;
    /**
     * 类型(字典 1自家仓库 2电力公司仓库..)
     */
    @Excel(name = "类型(字典 1自家仓库 2电力公司仓库..)", width = 15)
    @ApiModelProperty(value = "类型(字典 1自家仓库 2电力公司仓库..)")
    @Dict(dicCode = "warehouse_type")
    private Integer type;
    /**
     * 仓库名称
     */
    @Excel(name = "仓库名称", width = 15)
    @ApiModelProperty(value = "仓库名称")
    private String name;
    /**
     * 仓库地址
     */
    @Excel(name = "仓库地址", width = 15)
    @ApiModelProperty(value = "仓库地址")
    private String address;
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
