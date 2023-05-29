package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @Author：tian
 * @Description: 课程查询条件模型类
 * @Date：2023/5/29 16:52
 */
@Data
@ToString
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;

    //课程名称
    private String courseName;

    //发布状态
    private String publishStatus;
}
