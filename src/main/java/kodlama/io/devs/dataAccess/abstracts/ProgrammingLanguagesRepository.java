package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entity.concretes.ProgrammingLanguages;

import java.util.List;

public interface ProgrammingLanguagesRepository {
    void save(ProgrammingLanguages programmingLanguages);
    void update(int index, ProgrammingLanguages programmingLanguages);
    void delete(int id) throws Exception;

    List<ProgrammingLanguages> getAll();
    ProgrammingLanguages findById(int id) throws Exception;

}
