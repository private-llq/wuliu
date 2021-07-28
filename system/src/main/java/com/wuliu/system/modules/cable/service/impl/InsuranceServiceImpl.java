//package com.wuliu.system.modules.cable.service.impl;
//
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.wuliu.system.modules.cable.entity.Insurance;
//import com.wuliu.system.modules.cable.mapper.InsuranceMapper;
//import com.wuliu.system.modules.cable.service.IInsuranceService;
//import com.wuliu.system.modules.cable.vo.InsuranceListVo;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * 车保险表
// */
//@Service
//public class InsuranceServiceImpl extends ServiceImpl<InsuranceMapper, Insurance> implements IInsuranceService {
//
//    @Override
//    public IPage<InsuranceListVo> getInsurancePage(InsuranceListVo insurance, Page<InsuranceListVo> page) {
//        List<InsuranceListVo> list = baseMapper.getInsurancePage(insurance.getLicense(), page);
//        for (InsuranceListVo insuranceListVo : list) {
//            if (insuranceListVo.getInsuranceDateBegin() != null) {
//                insuranceListVo.setInsuranceDate(insuranceListVo.getInsuranceDateBegin() + " 至 ?");
//                if (insuranceListVo.getInsuranceDateEnd() != null) {
//                    insuranceListVo.setInsuranceDate(insuranceListVo.getInsuranceDateBegin() + " 至 " + insuranceListVo.getInsuranceDateEnd());
//                }
//            }
//            if (insuranceListVo.getStrongDateBegin() != null) {
//                insuranceListVo.setStrongDate(insuranceListVo.getStrongDateBegin() + " 至 ?");
//                if (insuranceListVo.getStrongDateEnd() != null) {
//                    insuranceListVo.setStrongDate(insuranceListVo.getStrongDateBegin() + " 至 " + insuranceListVo.getStrongDateEnd());
//                }
//
//            }
//        }
//        return page.setRecords(list);
//    }
//}
