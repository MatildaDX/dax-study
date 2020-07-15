package com.atdax.eduservice.controller;

import com.atdax.eduservice.entity.EduTeacher;
import com.atdax.eduservice.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 讲师 前端控制器
 * @author codeDax
 * @since 2020-07-15
 */
@Api(tags = "讲师管理")
@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    // 查询所有讲师方法
    @ApiOperation(value = "所有讲师列表")
    @GetMapping("/findAll")
    public List<EduTeacher> findAll() {
        return eduTeacherService.list(null);
    }

    // 逻辑删除讲师
    @ApiOperation(value = "逻辑删除讲师")
    @DeleteMapping("/delete/{id}")
    public Boolean deleteTeacher(
            @ApiParam(name = "id", value = "讲师ID", required = true)
            @PathVariable String id) {
        boolean flag = eduTeacherService.removeById(id);
        return flag;
    }

}

