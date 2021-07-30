package com.wuliu.system.modules.cable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuliu.system.modules.cable.entity.Vehicle;
import com.wuliu.system.modules.cable.mapper.VehicleMapper;
import com.wuliu.system.modules.cable.service.IVehicleService;
import org.springframework.stereotype.Service;

/**
 * 车辆表
 */
@Service
public class VehicleServiceImpl extends ServiceImpl<VehicleMapper, Vehicle> implements IVehicleService {

}
