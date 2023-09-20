package mechaspiders.controller;

import mechaspiders.model.Mechaspider;
import mechaspiders.repository.MechaspiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MechaspiderController {

    @Autowired
    private MechaspiderRepository mechaspiderRepository;

    @PostMapping("/addMechaspider")
    public void addMechaspider(@RequestBody Mechaspider mechaspider) {
        mechaspiderRepository.save(mechaspider);
    }
}
