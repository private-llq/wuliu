package com.wuliu.system.modules.cable.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuliu.system.modules.cable.entity.StorageLocation;
import com.wuliu.system.modules.cable.mapper.StorageLocationMapper;
import com.wuliu.system.modules.cable.service.IStorageLocationService;
import com.wuliu.system.modules.cable.vo.StorageLocationVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 库位表
 */
@Service
public class StorageLocationServiceImpl extends ServiceImpl<StorageLocationMapper, StorageLocation> implements IStorageLocationService {
    @Override
    public List<StorageLocationVo> getAll(Wrapper<?> wrapper) {
        return baseMapper.getAll(wrapper);
    }
}
