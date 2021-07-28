package com.wuliu.system.modules.cable.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Date;

/**
 * @ClassName InsuranceListVo
 * @Author Xm
 * @Date 2020/5/14 17:31
 */
@Data
public class InsuranceListVo implements Serializable {
    /**车保险表id*/
    private Integer id;
    /**车牌号码*/
    private String license;
    /**车辆id*/
    private Integer vehicleId;
    /**保险公司*/
    private String insuraName;
    /**商业险保单号*/
    private String insurancePolicy;
    /**商业险起始日期*/
    private String insuranceDate;
    /**商业险开始日期*/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date insuranceDateBegin;
    /**商业险结束日期*/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date insuranceDateEnd;
    /**交强险保单号*/
    private String strongPolicy;
    /**交强险起始日期*/
    private String strongDate;
    /**交强险起始日期*/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date strongDateBegin;
    /**交强险结束日期*/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date strongDateEnd;
}
