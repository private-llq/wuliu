package com.wuliu.system.modules.cable.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuliu.system.modules.cable.vo.MaterialStorageLocationVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialStorageLocationVoMapper extends BaseMapper<MaterialStorageLocationVo> {
    List<MaterialStorageLocationVo> queryBySid(@Param("sId") Integer storageLocationId);
}
