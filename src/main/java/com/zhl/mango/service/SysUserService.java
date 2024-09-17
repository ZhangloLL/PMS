package com.zhl.mango.service;

import com.zhl.mango.domain.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author CKY-ZHANG
* @description 针对表【sys_user(用户管理)】的数据库操作Service
* @createDate 2024-09-06 20:56:57
*/
public interface SysUserService extends IService<SysUser> {

    /**
     * 查询全部
     * @return
     */
    List<SysUser> findAll();
}
