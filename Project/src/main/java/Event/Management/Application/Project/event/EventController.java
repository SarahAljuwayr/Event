package Event.Management.Application.Project.event;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Events")
public class EventController {
//
//  public EventRepository EventRepository;
//
//  @GetMapping
//  public List<Event> getAllEvents() {
//    return EventRepository.findAll();
//  }
//
//  @GetMapping("/{name}")
//  //public Name getNameById(@PathVariable Long id) {
//    return EventRepositry.findById(id).get();
//  }
//
//  @PostMapping
//  public Event createEvent(@RequestBody Event user) {
//    return EventRepository.save(Event);
//  }
//
//  @PutMapping("/{id}")
//  public Event updateUser(@PathVariable Long id, @RequestBody Event event) {
//    Event existingUser = EventRepository.findById(id).get();
//    existingUser.setName(Event.getName());
//    existingUser.setLocation(Event.getLocation());
//    return EventRepository.save(existingUser);
//  }
//
//  @DeleteMapping("/{id}")
//  public String deleteUser(@PathVariable Long id) {
//    try {
//      EventRepository.findById(id).get();
//      EventRepository.deleteById(id);
//      return "User deleted successfully";
//    } catch (Exception e) {
//      return "User not found";
//    }
//  }
}