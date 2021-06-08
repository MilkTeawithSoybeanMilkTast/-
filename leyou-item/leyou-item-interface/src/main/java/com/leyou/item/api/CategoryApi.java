package com.leyou.item.api;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Create By FANZHIBO on 2021/3/9.
 */

@RequestMapping("category")
public interface CategoryApi {

    @GetMapping("names")
    public List<String> queryNamesByIds(@RequestParam("ids") List<Long> ids);
}