package com.example.example_sqlite;

public class customer {
    private int id,age;
    private String customer_name;
    private boolean active_user;

    public customer(int id, int age, String customer_name, boolean active_user) {
        this.id = id;
        this.age = age;
        this.customer_name = customer_name;
        this.active_user = active_user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public boolean isActive_user() {
        return active_user;
    }

    public void setActive_user(boolean active_user) {
        this.active_user = active_user;
    }

    public customer() {
    }

    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", age=" + age +
                ", customer_name='" + customer_name + '\'' +
                ", active_user=" + active_user +
                '}';
    }
}
