package com.spon.algorithm;

/**
 * 有关int类型的一些算法
 * Created by myg on 2016/9/21.
 */
public final class IntegerAlgorithm {

    /**
     * 通过异或找到2n+1个数字中仅仅出现过1次的数字
     * @param arrs
     * @return
     */
    public static int getOnlyOnceNumByXOR(int[] arrs) {
        int res = 0;//初始值
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arrs.length; i++) {
            res ^= arrs[i];
            sb.append(",res:" + res);
        }
        return res;
    }

}
