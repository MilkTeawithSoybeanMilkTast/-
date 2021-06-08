package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Create By FANZHIBO on 2021/3/21.
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
