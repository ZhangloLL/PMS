package com.zhl.mango.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhl.mango.domain.SysUser;
import com.zhl.mango.service.SysUserService;
import com.zhl.mango.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author CKY-ZHANG
* @description 针对表【sys_user(用户管理)】的数据库操作Service实现
* @createDate 2024-09-06 20:56:57
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}




