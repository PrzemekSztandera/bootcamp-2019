package com.manchesterdigital;


public class UserService {
    private static User user;
    static {
        user = new User("April");
        user.setId(1L);
    }

    public User retrieveUser(Long id) {

        if( !id.equals(user.getId()) ) {
            throw new UserNotFoundException("User not found matching ID: " + id);
        }
        return user;
    }

    public static void main(String[] args) {

        System.out.println(new UserService().retrieveUser(1L));
    }
}
