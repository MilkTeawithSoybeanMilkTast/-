package com.leyou.search.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Create By FANZHIBO on 2021/3/21.
 */
@FeignClient("item-service")
public interface BrandClient extends BrandApi {
}
