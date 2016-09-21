package com.spon.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;

/**
 * Created by myg on 2016/9/21.
 */
public final class CloseUtil {
    private static Logger logger = LoggerFactory.getLogger(CloseUtil.class);

    private CloseUtil() {
        // Empty
    }

    /**
     * 关闭closeable接口下的所有的实现类
     */
    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                logger.info("Unable to close %s", closeable, e);
            }
        }
    }
}
