package com.washingtin.jeenet.common.filter;

import com.washingtin.jeenet.common.utils.CacheUtils;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.constructs.web.filter.SimplePageCachingFilter;

/**
 * 描述：页面缓存过滤器
 * @author jeenet
 */
public class PageCachingFilter extends SimplePageCachingFilter {
    protected CacheManager getCacheManager() {
        return CacheUtils.getCacheManager();
    }
}
