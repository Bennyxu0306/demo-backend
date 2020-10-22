package com.its.demo.controller;

import com.its.demo.domain.RoleDO;
import com.its.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 杨金刚
 * @date 2020/5/9 20:40
 */
@RestController
@RequestMapping(value = "api/v1")
@Api(tags = {"用户角色操作接口"})
public class RoleController {
    @Autowired
    private UserService userService;

//    @GetMapping(value = "/roles")
//    @ApiOperation(value = "获取角色列表", notes = "获取角色列表")
//    @ApiImplicitParam(name = "authorization", value = "令牌", required = true, paramType = "header")
//    public List<RoleDO> listRoles(@RequestHeader String authorization) {
//        return userService.listRoles(authorization);
//    }

}
