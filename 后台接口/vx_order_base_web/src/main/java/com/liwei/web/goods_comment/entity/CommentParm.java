package com.liwei.web.goods_comment.entity;

import lombok.Data;

@Data
public class CommentParm {
    private Integer currentPage; //当前页
    private Integer pageSize;//每页查询的条数
}
