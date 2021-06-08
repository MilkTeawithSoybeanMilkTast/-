package com.leyou.search.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Create By FANZHIBO on 2021/3/21.
 */
@FeignClient("item-service")
public interface  GoodsClient extends GoodsApi {
}
