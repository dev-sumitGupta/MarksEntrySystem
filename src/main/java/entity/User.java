package entity;

import java.util.Date;//to checkcommit

public class User {
 private short userId;
 private short userName;
 private Date loginDate;

    public short getUserId() {
        return userId;
    }

    public void setUserId(short userId) {
        this.userId = userId;
    }

    public short getUserName() {
        return userName;
    }

    public void setUserName(short userName) {
        this.userName = userName;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}
