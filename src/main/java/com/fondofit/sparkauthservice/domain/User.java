package com.fondofit.sparkauthservice.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.core.userdetails.UserDetails;

@Document
public class User implements UserDetails {
    private @MongoId ObjectId id;
    private String username;
    private String password;
    private Set<UserRole> userRoles;
    public ObjectId getId() {
        return id;
    }

    public static void main(String[] args) {
        User user = new User();
        UserRole userRole = new UserRole();
        Role role = new Role();
        role.setName("ROLE_USER");
        userRole.setRole(role);
        Set<UserRole> userRoles2 = new HashSet<>();
        userRoles2.add(userRole);
        ObjectMapper Obj = new ObjectMapper();
        try {
            // Converting the Java object into a JSON string
            String jsonStr = Obj.writeValueAsString(userRoles2);
            // Displaying Java object into a JSON string
            System.out.println(jsonStr);
        }
        catch (Exception e) {e.printStackTrace();}
//        System.out.println(userRoles2.toString());
//        user.test();
    }
    public void test(){

    }
    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public Set<UserRole> getAuthorities() {
        return this.userRoles;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}