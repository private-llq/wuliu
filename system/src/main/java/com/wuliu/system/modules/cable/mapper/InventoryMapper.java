package com.wuliu.system.modules.cable.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wuliu.system.modules.cable.entity.Inventory;
import com.wuliu.system.modules.cable.vo.InventoryListsVo;
import com.wuliu.system.modules.cable.vo.YikuVo;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


import java.util.List;

/**
 * 库存表
 */
public interface InventoryMapper extends BaseMapper<Inventory> {
    /**
     * 根据仓库id和库位id查当前库位存放的物品（分页）
     */
    List<InventoryListsVo> InsurancePageList(@Param("inventoryVo") InventoryListsVo inventoryVo, @Param("page") Page<InventoryListsVo> page);

    List<InventoryListsVo> InsurancePageList(@Param("storageLocationId") Integer storageLocationId);

    List<YikuVo> yikuVoPage(@Param("yikuVo") YikuVo yikuVo, @Param("page") Page<YikuVo> page);

    void yikuDel(@Param("id") Integer id);

    void yikuAdd(@Param("val") YikuVo yikuVo);
}
