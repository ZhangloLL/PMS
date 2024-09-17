package com.zhl.mango.mapper;

import com.zhl.mango.domain.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author CKY-ZHANG
* @description 针对表【sys_user(用户管理)】的数据库操作Mapper
* @createDate 2024-09-06 20:56:57
* @Entity com.zhl.mango.domain.SysUser
*/
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> findAll();
}




