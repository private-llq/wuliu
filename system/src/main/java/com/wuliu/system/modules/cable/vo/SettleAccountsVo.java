package com.wuliu.system.modules.cable.vo;

import com.wuliu.common.aspect.annotation.Dict;
import lombok.Data;

import java.io.Serializable;

@Data
public class SettleAccountsVo implements Serializable {
    private String planId;
    private String planName;
    private String planType;
    private String projectNo;
    private String projectName;
    private String contact;
    private String phone;
    private String address;
    private String assetNo;
    @Dict(dicCode = "state")
    private String completeState;
    @Dict(dicCode = "settle_accounts_state")
    private String backup1;
}
