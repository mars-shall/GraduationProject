package com.practice.homework.base.system.dictionary.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 人员身份实体信息</b>
 */
@Data
public class IdentityVO extends BaseVO {
	private static final long serialVersionUID = 7229802796791467997L;
	private Integer id;
	private String code;
	private String text;
}
