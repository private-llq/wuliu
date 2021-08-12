package com.wuliu.system.modules.cable.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wuliu.system.modules.cable.vo.Deliver_Receiving_StorageVo;
import com.wuliu.system.modules.cable.vo.PickUpTheTaskVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * WX小程序
 */
@Mapper
public interface IWXService {
    /**
     * 接任务
     */
    IPage<PickUpTheTaskVo> pickUpTheTask(Integer completeState, Page<PickUpTheTaskVo> page);

    /**
     * 入库处置
     */
    Integer deliverStorage(Deliver_Receiving_StorageVo vo);

    /**
     * 出库处置
     */
    Integer receivingStorage(Deliver_Receiving_StorageVo vo);
}
