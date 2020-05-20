package com.moses.service.impl;

import com.moses.config.BaseService;
import com.moses.param.ProductParams;
import com.moses.service.ProductsService;
import com.moses.util.ObjectUtil;
import com.stripe.exception.StripeException;
import com.stripe.model.Product;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Moses
 */
@Service
public class ProductsServiceImpl extends BaseService implements ProductsService {
    @Override
    public String createProduct(ProductParams obj) throws StripeException {
        init();
        Map<String, Object> params = ObjectUtil.beanToMap(obj);
        Product product = Product.create(params);
        return product.getId();
    }
}


