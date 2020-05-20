package com.moses.service.impl;

import com.moses.common.Constant;
import com.moses.config.BaseService;
import com.moses.service.KeysService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Moses
 */
@Service
public class KeysServiceImpl extends BaseService implements KeysService {
    @Override
    public Map<String, Object> publicKey() {
        Map<String, Object> map = new HashMap<>();
        map.put("publishableKey", Constant.STRIPE_PUBLISHABLE_KEY);
        return map;
    }
}


