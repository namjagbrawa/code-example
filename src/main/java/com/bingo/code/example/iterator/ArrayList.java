package com.bingo.code.example.iterator;

public class ArrayList<E> implements Collection<E>{
 
    //先给定一个长度为10的数组
    Object [] objects = new Object[10];
     
    //冗余一个int指数，方便判定是组是否为满和返回集合大小
    int index = 0;
 
    @Override
    //1.动态添加元素
    public void add(E e) {
         
        //1.1先判断数组是否已满
        if(index == objects.length){
            Object [] newObjects = new Object[objects.length*2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;   //数组是引用数据类型
        }
         
        //1.2为新添加的元素指定下标
        objects[index] = e;
         
        //1.3index自加1，以方便返回集合在大小
        index++;
    }
 
    //2.根据下标访问元素
     
    @Override
    //3.返回集合大小
    public int size() {
        return index;
    }
 
    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }
     
    private class ArrayListIterator implements Iterator {
 
        private int currentIndex = 0;
         
        @Override
        public Object next() {
            // 返回最下一个元素
            Object o = objects[currentIndex];
            currentIndex++;
            return o;
        }
 
        @Override
        public boolean hasNext() {
            // 判断是否为最后一个元素
             
            if(currentIndex >= index){
                return false;
            }
            return true;
        }
         
    }
     
}