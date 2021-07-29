package com.wuliu.system.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wuliu.system.modules.oss.entity.OSSFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IOSSFileService extends IService<OSSFile> {

	void upload(MultipartFile multipartFile) throws IOException;

	boolean delete(OSSFile ossFile);

}
