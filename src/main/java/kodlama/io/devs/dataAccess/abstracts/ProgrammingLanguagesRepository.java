package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entity.concretes.ProgrammingLanguages;

import java.util.List;

public interface ProgrammingLanguagesRepository {
    void save(ProgrammingLanguages programmingLanguages);
    void update(int index, ProgrammingLanguages programmingLanguages);
    void delete(ProgrammingLanguages programmingLanguages);

    List<ProgrammingLanguages> getAll();
    ProgrammingLanguages findById(int id);

}
