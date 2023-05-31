package com.liwei.web.goods_comment.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liwei.web.goods_comment.entity.CommentParm;
import com.liwei.web.goods_comment.entity.GoodsComment;

import java.util.List;

public interface GoodsCommentService extends IService<GoodsComment> {
    List<GoodsComment> commentList(Long goodsId);
    IPage<GoodsComment> getList(CommentParm parm);
}
