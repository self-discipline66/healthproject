package com.healthproject.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.StandardException;

import java.io.Serializable;

/**
 * 检查项
 */
@Data
@TableName("t_checkitem")
public class CheckItem implements Serializable {
    @TableId
    private Integer id;//主键
    private String code;//项目编码
    private String name;//项目名称
    private String sex;//适用性别
    private String age;//适用年龄（范围），例如：20-50
    private Float price;//价格
    private String type;//检查项类型，分为检查和检验两种类型
    private String remark;//项目说明
    private String attention;//注意事项
    @TableLogic
    private int isDeleted;//是否被删除 0未删 1已删

}
