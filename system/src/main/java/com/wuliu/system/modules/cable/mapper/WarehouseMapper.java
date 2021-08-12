package com.wuliu.system.modules.cable.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wuliu.system.modules.cable.entity.Warehouse;
import com.wuliu.system.modules.cable.vo.InventoryIocationListVo;
import com.wuliu.system.modules.cable.vo.InventoryVo;
import com.wuliu.system.modules.cable.vo.KuweiVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;
import java.util.List;

/**
 * 仓库表
 */
public interface WarehouseMapper extends BaseMapper<Warehouse> {
    List<InventoryIocationListVo> InventoryIocationListVoPage(@Param("inventoryIocationListVo") InventoryIocationListVo inventoryIocationListVo,
                                                              @Param("page") Page<InventoryIocationListVo> page);

    List<KuweiVo> keweiQuery(@Param("id") String id, @Param("type") String type, @Param("warehouseId") String warehouseId);

    List<InventoryVo> selectPageinventory(@Param("inventoryVo") InventoryVo inventoryVo, @Param("page") Page<InventoryVo> page);

    List<InventoryVo> selectInfo(@Param("inventoryVo") InventoryVo inventoryVo, @Param("page") Page<InventoryVo> page);

    List<KuweiVo> kewei(@Param("ids") String[] ids);

    /**
     * 根据项目编号查询对应的库存库位存储数量
     */
    @Select("SELECT " +
            "i.inventory_quantity, " +
            "s.storage_location_name " +
            "FROM " +
            "inventory i " +
            "LEFT JOIN storage_location s ON i.storage_location_id = s.id " +
            "WHERE i.project_no = #{projectNo}" +
            "AND i.material_id = #{materialId}")
    List<KuweiVo> queryInventory(@Param("projectNo") Serializable projectNo, @Param("materialId") Serializable materialId);
}
