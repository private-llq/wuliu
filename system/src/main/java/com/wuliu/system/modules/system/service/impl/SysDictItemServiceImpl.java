package com.wuliu.system.modules.system.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuliu.system.modules.system.entity.SysDictItem;
import com.wuliu.system.modules.system.mapper.SysDictItemMapper;
import com.wuliu.system.modules.system.service.ISysDictItemService;
import com.wuliu.system.modules.system.service.ISysDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @Author zhangweijian
 * @since 2018-12-28
 */
@Service
public class SysDictItemServiceImpl extends ServiceImpl<SysDictItemMapper, SysDictItem> implements ISysDictItemService {

    @Autowired
    private SysDictItemMapper sysDictItemMapper;

    @Autowired
    private ISysDictService sysDictService;

    @Override
    public List<SysDictItem> selectItemsByMainId(String mainId) {
        return sysDictItemMapper.selectItemsByMainId(mainId);
    }

    @Override
    public IPage<SysDictItem> selectBYDict(String name, Page<SysDictItem> page) {
        List<SysDictItem> list =baseMapper.selectBYDict(name,page);
        return page.setRecords(list);
    }

    @Override
    public List<SysDictItem> selectType(String type) {
        return sysDictItemMapper.selectType(type);
    }

    @Override
    public Long getBumenId(String dictId) {
        return baseMapper.getBumenId(sysDictService.getDepts());
    }

}
