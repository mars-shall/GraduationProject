package com.practice.homework.base.system.professional.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 专业职务类别实体信息</b>
 */
@Data
public class ProCategoryVO extends BaseVO {
	private static final long serialVersionUID = 3360095505608161612L;
	private Integer id;
	private String code;
	private String text;
}
