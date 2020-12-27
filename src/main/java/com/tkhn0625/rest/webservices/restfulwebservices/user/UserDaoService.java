package com.tkhn0625.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCounts = 3;

    //Setting initial data
    static {
        users.add(new User(1,"take",new Date()));
        users.add(new User(2,"hana",new Date()));
        users.add(new User(3,"ryo",new Date()));
    }

    // findAll()
    public List<User> findAll(){
        return users;
    }

    // save(User user)
    public User save(User user){
        if(user.getId()==null){
            user.setId(++usersCounts);
        }
        users.add(user);
        return user;
    }

    // findOne(int id)
    public User findOne(int id){
        for(User user:users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    // deleteById(int id)
    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}
