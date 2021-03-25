package com.wenyu7980.area;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

/**
 *
 * @author wenyu
 */
@Configuration
public class CacheManagerConfig {
    @Primary
    @Bean
    private CacheManager cacheManager(RedisConnectionFactory factory) {
        //缓存配置对象
        return RedisCacheManager.builder(factory).build();
    }
}
