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

    public InMemoryProgrammingLanguagesRepository() {
        prList = new ArrayList<>();
        prList.add(new ProgrammingLanguages(1, "java"));
        prList.add(new ProgrammingLanguages(2, "C#"));
        prList.add(new ProgrammingLanguages(3, "Python"));
        prList.add(new ProgrammingLanguages(8, "Golang"));
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
    public void delete(ProgrammingLanguages programmingLanguages) {
        prList.remove(programmingLanguages);
    }

    @Override
    public List<ProgrammingLanguages> getAll() {
        return prList;
    }

    @Override
    public ProgrammingLanguages findById(int id) {
        return prList.get(id);
    }
}
