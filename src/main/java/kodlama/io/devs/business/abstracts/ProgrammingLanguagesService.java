package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.entity.concretes.ProgrammingLanguages;

import java.util.List;

public interface ProgrammingLanguagesService{

    void save(ProgrammingLanguages programmingLanguages) throws Exception;
    void update(int index, ProgrammingLanguages programmingLanguages) throws Exception;
    void delete(ProgrammingLanguages programmingLanguages);

    List<ProgrammingLanguages> getAll();
    ProgrammingLanguages findById(int id);
}
