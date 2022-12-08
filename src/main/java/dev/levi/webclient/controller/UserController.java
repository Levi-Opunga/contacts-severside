package dev.levi.webclient.controller;

import dev.levi.webclient.constants.C;
import dev.levi.webclient.models.User;
import dev.levi.webclient.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/users")
@CrossOrigin("*")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/one/{id}")
    public @ResponseBody User getOne(@PathVariable("id") User user) {
        return user;
    }

    @PostMapping(path = "/create")
    public User createUser(@RequestBody User user) throws Exception {
        System.out.println(user);
        return userRepository.save(user);
    }

    @PostMapping(path = "multi")
    public void multiUser(@RequestBody List<User> users) throws Exception {
        userRepository.saveAll(users);
    }

    @DeleteMapping(path = "delete/{id}")
    public DeleteMessage deleteUser(@PathVariable("id") String id) throws Exception {

        userRepository.deleteById(Integer.parseInt(id));
        return new DeleteMessage("ok",200,"Successfully Deleted");
    }

    @PostMapping(path = "/validate")
    public List<User> validate(@RequestBody User user) throws Exception {
        System.out.println(user + "vs"+ userRepository.validateUser(user.getName(), C.tripleDes.encrypt(user.getPassword())));

        return userRepository.validateUser(user.getName(), C.tripleDes.encrypt(user.getPassword()));
    }
        @PostMapping("update")
    public int update(@RequestBody User user){
        return userRepository.update(user.getName(),user.isAdmin(),user.getId());
    }



}

record DeleteMessage(String status,
                     int status_code,
                     String message) {

}
