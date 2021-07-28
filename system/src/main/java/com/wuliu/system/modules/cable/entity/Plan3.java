package com.wuliu.system.modules.cable.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.wuliu.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 计划表3
 */
@Data
@TableName("plan3")
public class Plan3 implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 计划表3id
     */
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "计划表3id")
    private Integer id;
    /**
     * 新品类型(计划类型(正常/抢修))
     */
    @Excel(name = "新品类型(计划类型(正常/抢修))", width = 15)
    @ApiModelProperty(value = "新品类型(计划类型(正常/抢修))")
    private String planType;
    /**
     * 工程账号
     */
    @Excel(name = "工程账号", width = 15)
    @ApiModelProperty(value = "工程账号")
    private String projectNo;
    /**
     * 工程名称
     */
    @Excel(name = "工程名称", width = 15)
    @ApiModelProperty(value = "工程名称")
    private String engName;
    /**
     * 采购申请号
     */
    @Excel(name = "采购申请号", width = 15)
    @ApiModelProperty(value = "采购申请号")
    private String proApplyNo;
    /**
     * 采购订单号
     */
    @Excel(name = "采购订单号", width = 15)
    @ApiModelProperty(value = "采购订单号")
    private String proTheorderNo;
    /**
     * 行项目号
     */
    @Excel(name = "行项目号", width = 15)
    @ApiModelProperty(value = "行项目号")
    private String lineitemNo;
    /**
     * 物料代码
     */
    @Excel(name = "物料代码", width = 15)
    @ApiModelProperty(value = "物料代码")
    private String materialCode;
    /**
     * 物料描述
     */
    @Excel(name = "物料描述", width = 15)
    @ApiModelProperty(value = "物料描述")
    private String materialDescribe;
    /**
     * 计量单位(字典)
     */
    @Excel(name = "计量单位(字典)", width = 15)
    @ApiModelProperty(value = "计量单位(字典)")
    @Dict(dicCode = "unit")
    private Integer measuringUnit;
    /**
     * 供应商
     */
    @Excel(name = "供应商", width = 15)
    @ApiModelProperty(value = "供应商")
    private String supplier;
    /**
     * 需求数量
     */
    @Excel(name = "需求数量", width = 15)
    @ApiModelProperty(value = "需求数量")
    private java.math.BigDecimal num;
    /**
     * 项目经理
     */
    @Excel(name = "项目经理", width = 15)
    @ApiModelProperty(value = "项目经理")
    private String projectManager;
    /**
     * 联系方式
     */
    @Excel(name = "联系方式", width = 15)
    @ApiModelProperty(value = "联系方式")
    private String mPhone;
    /**
     * 施工单位名称
     */
    @Excel(name = "施工单位名称", width = 15)
    @ApiModelProperty(value = "施工单位名称")
    private String companyName;
    /**
     * 现场收货人
     */
    @Excel(name = "现场收货人", width = 15)
    @ApiModelProperty(value = "现场收货人")
    private String fieldConsignee;
    /**
     * 具体到货日期
     */
    @Excel(name = "具体到货日期", width = 15)
    @ApiModelProperty(value = "具体到货日期")
    private Date dateOfArrival;
    /**
     * 施工单位名称
     */
    @Excel(name = "施工单位名称", width = 15)
    @ApiModelProperty(value = "施工单位名称")
    private String constructionOrganization;
    /**
     * 总包单位
     */
    @Excel(name = "总包单位", width = 15)
    @ApiModelProperty(value = "总包单位")
    private String mainContractor;
    /**
     * 联系方式
     */
    @Excel(name = "联系方式", width = 15)
    @ApiModelProperty(value = "联系方式")
    private String cPhone;
    /**
     * 送货地点
     */
    @Excel(name = "送货地点", width = 15)
    @ApiModelProperty(value = "送货地点")
    private String address;
    /**
     * 物资调配中心反馈意见(物资供应公司填写)
     */
    @Excel(name = "物资调配中心反馈意见(物资供应公司填写)", width = 15)
    @ApiModelProperty(value = "物资调配中心反馈意见(物资供应公司填写)")
    private String feedback;
    /**
     * 具体施工日期
     */
    @Excel(name = "具体施工日期", width = 15, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "具体施工日期")
    private Date constructionTime;
    /**
     * 要求开始送货日期
     */
    @Excel(name = "要求开始送货日期", width = 15, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "要求开始送货日期")
    private Date startTime;
    /**
     * 要求最终到货日期
     */
    @Excel(name = "要求最终到货日期", width = 15, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "要求最终到货日期")
    private Date stopTime;
    /**
     * 备注
     */
    @Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
    private String note;
    /**
     * 说明
     */
    @Excel(name = "说明", width = 15)
    @ApiModelProperty(value = "说明")
    private String instructions;
    /**
     * 已入库数
     */
    @Excel(name = "已入库数", width = 15)
    @ApiModelProperty(value = "已入库数")
    private java.math.BigDecimal alreadyDeliverStorage;
    /**
     * 已出库数
     */
    @Excel(name = "已出库数", width = 15)
    @ApiModelProperty(value = "已出库数")
    private java.math.BigDecimal alreadyReceivingStorage;
    /**
     * 0未派单/1已派单
     */
    @Excel(name = "0未派单/1已派单", width = 15)
    @ApiModelProperty(value = "0未派单/1已派单")
    private Integer sendOrdersState;
    /**
     * 完成状态(字典)
     */
    @Excel(name = "完成状态(字典)", width = 15)
    @ApiModelProperty(value = "完成状态(字典)")
    @Dict(dicCode = "completeState")
    private Integer completeState;
    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    /**
     * 更新时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
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

    /**
     * 导出时选择计划开始日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(exist = false)  //exist = false 是否为数据库表字段
    private Date beginTime;

    /**
     * 导出时选择计划结束日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(exist = false)  //exist = false  是否为数据库表字段
    private Date endTime;
}
