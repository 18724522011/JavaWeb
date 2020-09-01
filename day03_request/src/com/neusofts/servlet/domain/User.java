package com.neusofts.servlet.domain;

public class User
{
    private Integer id;
    private String username;
    private String password;
    private String gender;

    public User()
    {
    }

    public User(Integer id, String username, String password, String gender)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}
