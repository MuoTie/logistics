package com.mba.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mba.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
    List<User> listAll();
}
