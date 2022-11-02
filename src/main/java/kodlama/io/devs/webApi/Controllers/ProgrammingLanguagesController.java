package kodlama.io.devs.webApi.Controllers;

import kodlama.io.devs.business.abstracts.ProgrammingLanguagesService;
import kodlama.io.devs.entity.concretes.ProgrammingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

    private ProgrammingLanguagesService programmingLanguagesService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguagesService programmingLanguagesService) {
        this.programmingLanguagesService = programmingLanguagesService;
    }

    @PostMapping("/add")
    public void add() throws Exception {
        programmingLanguagesService.save(new ProgrammingLanguages(4, "Kotlin"));
    }

    @PutMapping("/update")
    public void update() throws Exception{
        programmingLanguagesService.update(3, new ProgrammingLanguages(10, "Python"));
    }

    @DeleteMapping("/delete")
    public void delete(){
        programmingLanguagesService.delete(new ProgrammingLanguages(10, "Python"));
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguages> getAll(){
        return programmingLanguagesService.getAll();
    }

    @GetMapping("/findbyid")
    public ProgrammingLanguages findById(int id){
        return programmingLanguagesService.findById(id);
    }
}
