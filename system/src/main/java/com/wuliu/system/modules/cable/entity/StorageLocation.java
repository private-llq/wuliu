package com.wuliu.system.modules.cable.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 库位表
 */
@Data
@TableName("storage_location")
public class StorageLocation implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "id")
    private Integer id;
    /**
     * 仓库id
     */
    @Excel(name = "仓库id", width = 15)
    @ApiModelProperty(value = "仓库id")
    private Integer warehouseId;
    /**
     * 库位名称
     */
    @Excel(name = "库位名称", width = 15)
    @ApiModelProperty(value = "库位名称")
    private String storageLocationName;
    /**
     * 库位容积
     */
    @Excel(name = "库位容积", width = 15)
    @ApiModelProperty(value = "库位容积")
    private BigDecimal storageLocationVolume;
    /**
     * 当前容积
     */
    @Excel(name = "当前容积", width = 15)
    @ApiModelProperty(value = "当前容积")
    private BigDecimal theCurrentVolume;
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
