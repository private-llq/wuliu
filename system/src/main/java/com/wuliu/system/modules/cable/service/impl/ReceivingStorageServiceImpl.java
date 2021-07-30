package com.wuliu.system.modules.cable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuliu.system.modules.cable.entity.ReceivingStorage;
import com.wuliu.system.modules.cable.mapper.ReceivingStorageMapper;
import com.wuliu.system.modules.cable.service.IReceivingStorageService;

import org.springframework.stereotype.Service;

/**
 * 出库/完单表
 */
@Service
public class ReceivingStorageServiceImpl extends ServiceImpl<ReceivingStorageMapper, ReceivingStorage> implements IReceivingStorageService {

}
