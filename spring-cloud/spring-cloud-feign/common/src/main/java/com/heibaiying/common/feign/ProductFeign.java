package com.heibaiying.common.feign;

import com.heibaiying.common.bean.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author : heibaiying
 * @description : 声明式接口调用
 */
public interface ProductFeign {

    @RequestMapping("products")
    List<Product> productList();

    /**
     * 这是需要强调的是使用feign时候@PathVariable一定要用value指明参数，
     * 不然会抛出.IllegalStateException: PathVariable annotation was empty on param 异常
     */
    @RequestMapping("product/{id}")
    Product productDetail(@PathVariable(value = "id") int id);
}
