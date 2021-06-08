package com.leyou.goods.client;

import com.leyou.item.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Create By FANZHIBO on 2021/3/21.
 */
@FeignClient("item-service")
public interface SpecificationClient extends SpecificationApi {
}
