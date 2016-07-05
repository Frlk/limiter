package com.limiter.tokenbucket.service;

import java.util.concurrent.TimeUnit;

/**
 * @author wuhao
 */
public interface TokenBucketService {

    boolean consume(String tokenBucketKey);

    boolean tryConsume(String tokenBucketKey);

    boolean tryConsume(String tokenBucketKey, long time, TimeUnit timeUnit);
}
