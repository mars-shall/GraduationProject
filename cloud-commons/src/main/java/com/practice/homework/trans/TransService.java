package com.practice.homework.trans;

import com.practice.homework.system.admin.pojo.vo.AdminVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author
 * @Date 2022/1/6
 * @apiNote
 */
@FeignClient(name = "cloud-system-provider")
public interface TransService {

	 @PostMapping("/trans/system/admin/cellphone")
	AdminVO getUserBycellphone(String cellphone) throws Exception;
}
