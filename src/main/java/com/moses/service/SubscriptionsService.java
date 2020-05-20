package com.moses.service;

import com.moses.param.SubscriptionParams;
import com.stripe.exception.StripeException;

/**
 * @author Moses
 * @date 2020/4/27
 */
public interface SubscriptionsService {
    String createSubscription(SubscriptionParams obj) throws StripeException;
}
