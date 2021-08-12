package com.wuliu.system.modules.cable.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuliu.system.modules.cable.entity.Material;
import com.wuliu.system.modules.cable.entity.Warehouse;
import com.wuliu.system.modules.cable.mapper.MaterialMapper;
import com.wuliu.system.modules.cable.mapper.WarehouseMapper;
import com.wuliu.system.modules.cable.service.IWarehouseService;
import com.wuliu.system.modules.cable.vo.InventoryVo;
import com.wuliu.system.modules.cable.vo.KuweiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;


/**
 * 仓库表
 */
@Service
public class WarehouseServiceImpl extends ServiceImpl<WarehouseMapper, Warehouse> implements IWarehouseService {
    @Autowired
    private MaterialMapper materialMapper;

    @Override
    public IPage<InventoryVo> selectPageinventory(InventoryVo inventoryVo, Page<InventoryVo> page) {
        return page.setRecords(baseMapper.selectPageinventory(inventoryVo, page));
    }

    @Override
    public IPage<InventoryVo> selectInfo(InventoryVo inventoryVo, Page<InventoryVo> page) {
        return page.setRecords(baseMapper.selectInfo(inventoryVo, page));
    }

    @Override
    public List<KuweiVo> kewei(String id) {
        return baseMapper.kewei(id.split(","));
    }

    @Override
    public List<KuweiVo> queryInventory(Serializable projectNo,Serializable materialId) {
        Material serial = materialMapper.selectOne(new QueryWrapper<Material>().eq("serial", materialId));
        return baseMapper.queryInventory(projectNo, serial.getId());
    }
}
