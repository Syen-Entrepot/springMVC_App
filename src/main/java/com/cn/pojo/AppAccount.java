package com.cn.pojo;

/**
 * @author Syen
 * @date 2019/7/29 0029-下午 12:30
 */
public class AppAccount {

    private Integer id;
    private String no;
    private String description;

    public AppAccount() {

    }

    public AppAccount(Integer id, String no, String description) {
        this.id = id;
        this.no = no;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AppAccount{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
