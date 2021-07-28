package com.wuliu.system.modules.cable.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wuliu.system.modules.cable.entity.StorageLocation;
import com.wuliu.system.modules.cable.vo.StorageLocationVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 库位表
 */
public interface StorageLocationMapper extends BaseMapper<StorageLocation> {
    /**
     * 查询库位信息
     */
    List<StorageLocationVo> getAll(@Param(Constants.WRAPPER) Wrapper<?> wrapper);
}
