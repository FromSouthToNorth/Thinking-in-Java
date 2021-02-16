package chapter11_hold_the_object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 第11章 持有对象
 * Stack 测试
 *
 * @author hy
 * @date 2021-02-15
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        String s = "+U+nc---+e+r+t---+a-+i-+n+t+y---+-_r+u--+l+e+s---";
        char[] charArray = s.toCharArray();
        List<Character> charList = new ArrayList<Character>();
        for (Character c : charArray) {
            charList.add(c);
        }
        Iterator<Character> iterator = charList.iterator();
        while (iterator.hasNext()) {
            Character character = iterator.next();
            if (character == '+') {
                stack.push(iterator.next());
            }
        }
        System.out.println(stack.toString());
    }

}
