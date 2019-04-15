package com.example.demo.response;

import java.util.List;

public class UserListResponse {

    private List<UserResponse> userList;
    private Integer totalUsers;
    private Integer limit;
    private Integer offset;

    public List<UserResponse> getUserList() {
        return userList;
    }

    public void setUserList(List<UserResponse> userList) {
        this.userList = userList;
    }

    public Integer getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
