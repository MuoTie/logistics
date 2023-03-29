package com.mba.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mba.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
    List<User> listAll();

    IPage pageC(IPage<User> page);

    IPage pageCC(Page<User> page, Wrapper wrapper);
}
