package kodlama.io.devs.webApi.Controllers;

import kodlama.io.devs.business.abstracts.ProgrammingLanguagesService;
import kodlama.io.devs.entity.concretes.ProgrammingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
    private final ProgrammingLanguagesService programmingLanguagesService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguagesService programmingLanguagesService) {
        this.programmingLanguagesService = programmingLanguagesService;
    }

    @PostMapping("/add")
    public void add(int id, String name) throws Exception {
        programmingLanguagesService.save(new ProgrammingLanguages(id, name));
    }

    @PutMapping("/update")
    public void update(int index, int id, String name) throws Exception{
        programmingLanguagesService.update(index, new ProgrammingLanguages(id, name));
    }

    @DeleteMapping("/delete")
    public void delete(int id) throws Exception {
        programmingLanguagesService.delete(id);
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguages> getAll(){
        return programmingLanguagesService.getAll();
    }

    @GetMapping("/findbyid")
    public ProgrammingLanguages findById(int id) throws Exception {
        return programmingLanguagesService.findById(id);
    }
}
