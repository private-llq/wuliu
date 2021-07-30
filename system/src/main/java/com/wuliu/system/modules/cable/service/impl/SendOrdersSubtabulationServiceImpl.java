package com.wuliu.system.modules.cable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuliu.system.modules.cable.entity.SendOrdersSubtabulation;
import com.wuliu.system.modules.cable.mapper.SendOrdersSubtabulationMapper;
import com.wuliu.system.modules.cable.service.ISendOrdersSubtabulationService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 派单-车辆-员工关系表
 */
@Service
public class SendOrdersSubtabulationServiceImpl extends ServiceImpl<SendOrdersSubtabulationMapper, SendOrdersSubtabulation> implements ISendOrdersSubtabulationService {

    @Override
    public void saveSendOrdersSubtabulation(Integer sendOrdersId, Integer distributionType, String typeId, Date taskTime) {
        baseMapper.saveSendOrdersSubtabulation(sendOrdersId, distributionType, typeId, taskTime);
    }
}
