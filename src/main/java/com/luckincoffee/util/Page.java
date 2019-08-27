package com.luckincoffee.util;

/**
 * @Author: dyz
 * @Date: 2019/8/27 16:04
 * @Description: 专门用于分页的类
 */
public class Page {
    /**
     * 开始页数
     */
    private int start;
    /**
     * 每页显示的个数
     */
    private int count;
    /**
     * 总个数
     */
    private int total;
    /**
     * 参数
     */
    private String param;
    /**
     * 设置默认每页显示5条
     */
    private final static int defaultCount=5;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Page() {
        count=defaultCount;
    }

    public Page(int start, int count) {
        this();
        this.start = start;
        this.count = count;
    }

    /**
     * 是否有上一页
     * @return false 没有上一页
     * @return true 有上一页
     */
    public boolean isHasPreviouse(){
        return start != 0;
    }
    /**
     * 是否有下一页
     * @return false 没有下一页
     * @return true 有下一页
     */
    public boolean isHasNext(){
        return start != getLast();
    }

    /**
     * 总页数
     * @return
     */
    private int getTotalPage() {
        int totalPage;
        //向上取整
        totalPage = (int) Math.ceil((double) total / (double) count);;
        return totalPage;
    }

    /**
     * @return 最后一页的开始数字
     */
    private int getLast() {
        return (getTotalPage()-1)*count;
    }
    @Override
    public String toString() {
        return "Page [start=" + start + ", count=" + count + ", total=" + total + ", getStart()=" + getStart()
                + ", getCount()=" + getCount() + ", isHasPreviouse()=" + isHasPreviouse() + ", isHasNext()="
                + isHasNext() + ", getTotalPage()=" + getTotalPage() + ", getLast()=" + getLast() + "]";
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public String getParam() {
        return param;
    }
    public void setParam(String param) {
        this.param = param;
    }

}
