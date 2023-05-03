package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentservice {
@Autowired
private studentRepo repo;
// all student list get
public List<userstudent> list(){
    return (List<userstudent>) repo.findAll();

}
// save the student in to database.
public void save(userstudent use){
repo.save(use);
}

//get user information
public userstudent get(Integer id) throws UserNotFoundExeption{
    Optional<userstudent> result = repo.findById(id);
    if(result.isPresent()){
        return result.get();
    }
    throw new UserNotFoundExeption("user not find database");
}

public void delete(Integer id) throws UserNotFoundExeption {
    Long count = repo.countById(id);
    if(count == null){
        throw new UserNotFoundExeption("user not find");
    }
    repo.deleteById(id);
}




}
