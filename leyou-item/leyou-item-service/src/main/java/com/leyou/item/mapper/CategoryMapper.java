package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * Create By FANZHIBO on 2021/3/9.
 */
public interface CategoryMapper extends Mapper<Category> , SelectByIdListMapper<Category, Long> {
}
