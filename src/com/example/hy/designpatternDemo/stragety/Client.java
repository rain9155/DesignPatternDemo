package com.example.hy.designpatternDemo.stragety;

/**
 * 排序
 * Created by 陈健宇 at 2018/10/6
 */
public class Client {

    private  Sort mSort;

    public static void main(String[] args){
        Client client = new Client();
        //设置策略
        Sort bubbleSort = new BubbleSort();
        client.setmSort(bubbleSort);
        Integer[] a = {1, 2, 3, 4, 5, 6};
        client.show(a);
    }

    public void setmSort(Sort mSort) {
        this.mSort = mSort;
    }

    public void show(Integer[] a){
        mSort.sort(a);
        for(Integer b : a){
            System.out.print(b + " ");
        }
    }

}
