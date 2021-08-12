package com.wuliu.system.modules.cable.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wuliu.system.modules.cable.entity.Warehouse;
import com.wuliu.system.modules.cable.vo.InventoryVo;
import com.wuliu.system.modules.cable.vo.KuweiVo;

import java.io.Serializable;
import java.util.List;

/**
 * 仓库表
 */
public interface IWarehouseService extends IService<Warehouse> {

    /**
     * 库存查询
     */
    IPage<InventoryVo> selectPageinventory(InventoryVo inventoryVo, Page<InventoryVo> page);

    /**
     * 库存详情
     */
    IPage<InventoryVo> selectInfo(InventoryVo inventoryVo, Page<InventoryVo> page);

    List<KuweiVo> kewei(String id);

    /**
     * 根据项目编号查询对应的库存库位存储数量
     */
    List<KuweiVo> queryInventory(Serializable projectNo, Serializable materialId);
}
