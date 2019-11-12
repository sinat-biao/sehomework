package com.softwareMethodology.jiangbiao;

import org.junit.Test;
import java.util.LinkedList;

/**
 * @author: MF1933041_江彪
 * @className: LinkedList_add_Object
 * @apiSignature: java.util.LinkedList$public boolean add(E e)
 * @description: Test java api java.util.LinkedList$add(E e)
 * @Map: ArraySlice$ func append(_ newElement: Element)
 * @Map: ContiguousArray$ func append(_ newElement: Element)
 * @Map: Array$ func append(_ newElement: [Element].Element)
*/
public class LinkedList_add_Object {

    /**
     * input: 2
     * class0 class0=new LinkedList<Object>()
     * obj obj="jiangbiao"
     * output: 1
     * ret0  ret0=true(success to add) or false(fail to add)
     */
    @Test
    public void add0() {
        System.out.println("----------------------------------------");
        LinkedList<Object> linkedList = new LinkedList<Object>();
        if (linkedList.isEmpty()) {
            System.out.println("linkedList is empty!");
        }
        Object obj = "jiangbiao";
        boolean isAdd = linkedList.add(obj);
        System.out.println(isAdd);
        if (!linkedList.isEmpty()) {
            for (Object object : linkedList) {
                System.out.println(object);
            }
        }
    }

    /**
     * input: 2
     * class0 class0=new LinkedList<Object>()
     * obj obj=1
     * output: 1
     * ret0  ret0=true(success to add) or false(fail to add)
     */
    @Test
    public void add1() {
        System.out.println("----------------------------------------");
        LinkedList<Object> linkedList = new LinkedList<Object>();
        if (linkedList.isEmpty()) {
            System.out.println("linkedList is empty!");
        }
        Object obj = 1;
        boolean isAdd = linkedList.add(obj);
        System.out.println(obj + " add " + isAdd);
        obj = 2;
        boolean isAdd1 = linkedList.add(obj);
        System.out.println(obj + " add " + isAdd1);
        if (!linkedList.isEmpty()) {
            for (Object object : linkedList) {
                System.out.print(object + " ");
            }
            System.out.println();
        }
    }

}