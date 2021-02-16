package chapter11_hold_the_object;

import java.util.*;

/**
 * 第11章 持有对象
 * 修改 ListFeatures，让它使用Integer而不是Pet，并解释在结果上有何不同
 *
 * @author hy
 * @date 2021-02-14
 */
public class Practice05
{
    public static void main(String[] args)
    {
        Random rand = new Random(47);
        List<Integer> integers1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println("1: " + integers1);
        Integer integer = 9;
        // add 在 list 末尾追加元素
        integers1.add(integer);
        System.out.println("2: " + integers1);
        // contains 查询是否包含某元素
        System.out.println("3: " + integers1.contains(integer));
        // remove 移除某元素
        integers1.remove(integer);
        // get 通过元素 下标精确查找元素
        Integer i1 = integers1.get(2);
        // indexOf 用于某元素查找其下标
        System.out.println("4: " + i1 + " " + integers1.indexOf(i1));
        Integer i2 = 2;
        // indexOf 用于某元素查找其下标
        System.out.println("5: " + integers1.indexOf(i2));
        // remove 移除某元素
        System.out.println("6: " + integers1.remove(i2));
        System.out.println("7: " + integers1.remove(i1));
        System.out.println("8: " + integers1);
        // 指定下标插入元素
        integers1.add(1, i2);
        System.out.println("9: " + integers1);
        // subList 截取列表返回新的列表
        List<Integer> sub = integers1.subList(1, 4);
        System.out.println("subList: " + sub);
        // 判断一个列表是否包含另一个列表
        System.out.println("10: " + integers1.containsAll(sub));
        List<Integer> integers2 = new ArrayList<Integer>(Arrays.asList(4, 2, 5));
        // 列表排序
        Collections.sort(integers2);
        System.out.println("sorted subList: " + integers2);
        // Order is not important in containsAll();
        // 排序过后的 list 并不影响 连个 list 包含比较
        System.out.println("11: " + integers1.containsAll(integers2));
        // Mix it up
        // shuffle 打乱顺序，list, 随机数
        Collections.shuffle(sub, rand);
        System.out.println("shuffled subList: " + sub);
        // shuffle 打乱顺序后 两个list比较是否包含
        System.out.println("12: " + integers1.containsAll(sub));
        // 复制一份相同的 list
        List<Integer> copy = new ArrayList<Integer>(integers1);
        // sub list 重新复制，覆盖原来的元素
        sub = Arrays.asList(integers1.get(1), integers1.get(4));
        System.out.println("sub: " + sub);
        // copy list, retain 保留 sub list 的元素移除原有的元素
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        // get a fresh copy 得到一个新的 copy
        copy = new ArrayList<Integer>(integers1);
        copy.remove(2);
        System.out.println("14: " + copy);
        // removeAll remove 多个元素
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        // Replace by index an element
        copy.set(1, new Integer(4));
        System.out.println("16: " + copy);
        // Add by index an element
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        // if list include elements, include Returns false, include on elements Returns true
        System.out.println("18: " + integers1.isEmpty());
        // Remove all elements
        integers1.clear();
        System.out.println("19: " + integers1);
        System.out.println("20: " + integers1.isEmpty());
        integers1.addAll(Arrays.asList(new Integer(1), new Integer(2), new Integer(4), new Integer(3)));
        System.out.println("21: " + integers1);
        // list to array
        Object[] o = integers1.toArray();
        System.out.println("22: " + o[3]);
        Integer[] integers = integers1.toArray(new Integer[0]);
        System.out.println("23: " + integers[3]);
    }
}
