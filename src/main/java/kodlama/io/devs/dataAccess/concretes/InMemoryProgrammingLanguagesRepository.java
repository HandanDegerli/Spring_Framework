package kodlama.io.devs.dataAccess.concretes;

import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import kodlama.io.devs.entity.concretes.ProgrammingLanguages;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguagesRepository implements ProgrammingLanguagesRepository {

    //CRUD

    List<ProgrammingLanguages> prList;
    ProgrammingLanguages programmingLanguages;

    public InMemoryProgrammingLanguagesRepository() {
        prList = new ArrayList<>();
        prList.add(new ProgrammingLanguages(1, "java"));
        prList.add(new ProgrammingLanguages(2, "C#"));
        prList.add(new ProgrammingLanguages(3, "Python"));
        prList.add(new ProgrammingLanguages(8, "Golang"));
    }

    public InMemoryProgrammingLanguagesRepository(ProgrammingLanguages programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void save(ProgrammingLanguages programmingLanguages) {
        prList.add(programmingLanguages);

    }
    @Override
    public void update(int index, ProgrammingLanguages programmingLanguages) {
       prList.set(index, programmingLanguages);
    }

    @Override
    public void delete(int id) throws Exception{
        ProgrammingLanguages pL = findById(id);
        prList.remove(pL);
    }


    @Override
    public List<ProgrammingLanguages> getAll() {
        return prList;
    }

    @Override
    public ProgrammingLanguages findById(int id) throws Exception {
        for(ProgrammingLanguages pL : prList) {
            if(pL.getId() == id)
                return pL;
        }
        throw new Exception("Entered id could not find!");
    }
}
