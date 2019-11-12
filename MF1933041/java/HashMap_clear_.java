package com.softwareMethodology.jiangbiao;

import org.junit.Test;
import java.util.HashMap;

/**
 * @author: MF1933041_江彪
 * @className: HashMap_clear_
 * @apiSignature: java.util.HashMap<K,V>$ public void clear()
 * @description: Test java api java.util.HashMap<K,V>$clear()
 * @Map: ArraySlice$ func append(_ newElement: Element)
 */
public class HashMap_clear_ {

    /**
     * input: 1
     * class0 class0={"jiangbiao":1, "longkun":2, "huangzhiheng":3}
     * output: 0
     */
    @Test
    public void clear0() {
        System.out.println("----------------------------------------");
        // initialization
        HashMap<String, Integer> class0 = new HashMap<String, Integer>() {
            {
                put("jiangbiao", 1);
                put("longkun", 2);
                put("huangzhiheng", 3);
            }
        };
        // 利用 keySet 进行遍历
        for (String key: class0.keySet()) {
            System.out.println(key + ":" + class0.get(key));
        }
        // 清空
        class0.clear();
        if (class0.isEmpty()) {
            System.out.println("class0 has been cleared!");
        }
    }
}