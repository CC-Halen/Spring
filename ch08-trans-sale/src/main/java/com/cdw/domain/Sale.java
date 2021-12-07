package com.cdw.domain;

/**
 * @author: cdw
 * @date: 2021/11/24 16:00
 * @description:
 */
public class Sale {
    private Integer id;
    private Integer gid;
    private Integer num;


    public Sale() {
    }

    public Sale(Integer id, Integer gid, Integer num) {
        this.id = id;
        this.gid = gid;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", gid=" + gid +
                ", num=" + num +
                '}';
    }
}
