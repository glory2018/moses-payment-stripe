package com.moses.controller;

import com.moses.config.BaseController;
import com.moses.config.BaseResponse;
import com.moses.param.ProductParams;
import com.moses.service.ProductsService;
import com.stripe.exception.StripeException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Moses
 */
@RestController
@Api("Products api")
@RequestMapping(value = "/products")
public class ProductsController extends BaseController {
    @Autowired
    ProductsService productsService;

    @PostMapping("/createProduct")
    @ApiOperation(value = "create Product", notes = "Creates a new product object.")
    public BaseResponse createProduct(@RequestBody ProductParams obj) {
        BaseResponse response;
        try {
            String id = productsService.createProduct(obj);
            response = BaseResponse.success(id);
        } catch (StripeException e) {
            response = BaseResponse.fail(e.getMessage());
            e.printStackTrace();
        }
        return response;
    }
}
