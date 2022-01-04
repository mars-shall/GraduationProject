package com.practice.homework.base.system.admin.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import com.practice.homework.base.system.dictionary.pojo.vo.EducationVO;
import com.practice.homework.base.system.dictionary.pojo.vo.IdentityVO;
import com.practice.homework.base.system.position.pojo.vo.PositionVO;
import com.practice.homework.base.system.professional.pojo.vo.ProGradeVO;
import com.practice.homework.base.system.professional.pojo.vo.ProfessionVO;
import lombok.Data;

/**
 * @Author
 * @Date 2022/1/4
 * @apiNote
 */
@Data
public class AdminVo extends BaseVO {
	private static final long serialVersionUID = -7029188511855488108L;
	private String id;
	private String no;
	private String name;
	private String cellphone;
	private String password;
	private IdentityVO iden;          //人员系统信息
	private RoleVO role;                  //角色信息
	private PositionVO pos;              //人员职务信息
	private EducationVO educ;             //人员学历信息
	private ProfessionVO prof;      //人员专业职务信息
	private ProGradeVO grade;
}
