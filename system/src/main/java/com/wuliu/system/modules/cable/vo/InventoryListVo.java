package com.wuliu.system.modules.cable.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName InventoryListVo
 * @Author Xm
 * @Date 2020/5/15 10:46
 */
@Data
public class InventoryListVo implements Serializable {

    /**
     * 库存表id
     */
    private Integer id;

    /**
     * 仓库名称
     */
    private String warehouseName;

    /**
     * 项目编码
     */
    private String projectNo;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 物料编号(唯一)
     */
    private String serial;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 库存数
     */
    private Integer inventoryNum;

    /**
     * 单位
     */
    private String unit;

    /**
     * 电缆回收规格
     */
    private String recyclingSpecifications;
    /**
     * 资产编号
     */
    private String assetNo;
}
