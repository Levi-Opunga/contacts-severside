package dev.levi.webclient.controller;

import dev.levi.webclient.models.Contact;
import dev.levi.webclient.repositories.ContactRepository;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/api/contacts")
@CrossOrigin("*")
public class ContactsController {
    private final ContactRepository contactRepository;

    public ContactsController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GetMapping("all")
    public Iterable<Contact> getAllContacts(){
 return contactRepository.findAll();
    }

    @DeleteMapping(path = "delete/{id}")
    public DeleteMessage deleteUser(@PathVariable("id") String id){

        contactRepository.deleteById(Integer.parseInt(id));
        return new DeleteMessage("ok",200,"Successfully Deleted");
    }

    @PostMapping("create")
    public Contact create(@RequestBody Contact contact){
        return contactRepository.save(contact);
    }

//    @PostMapping("update/{id}")
//    public Contact update(@RequestBody Contact contact){
//        return contactRepository.update(contact);
//    }
    @PostMapping("update")
    public int update(@RequestBody Contact contact){
      return contactRepository.update(contact.getFirstName(),
              contact.getPhone(),
              contact.getMobile(),
              contact.getEmail(),
              contact.getLastName(),
              contact.getWebsite(),
              contact.getLinkedIn(),
              contact.getFacebook(),contact.getId());
    }


}


