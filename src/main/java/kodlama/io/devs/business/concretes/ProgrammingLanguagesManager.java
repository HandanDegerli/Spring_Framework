package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.ProgrammingLanguagesService;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import kodlama.io.devs.entity.concretes.ProgrammingLanguages;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProgrammingLanguagesManager implements ProgrammingLanguagesService {

    private final ProgrammingLanguagesRepository programmingLanguagesRepository;

    public ProgrammingLanguagesManager(ProgrammingLanguagesRepository programmingLanguagesRepository) {
        this.programmingLanguagesRepository = programmingLanguagesRepository;
    }

    @Override
    public void save(ProgrammingLanguages programmingLanguages) throws Exception{

        for(ProgrammingLanguages pL : programmingLanguagesRepository.getAll()){
           if(Objects.equals(pL.getName(), programmingLanguages.getName())){
               throw new Exception("Programming language name can not repeat! Change the name please!");
           }
        }

         if (Objects.equals(programmingLanguages.getName(), " ")) {
             throw new Exception("Programming language name can not be null! Give the name please!");
         }

         programmingLanguagesRepository.save(programmingLanguages);
    }

    @Override
    public void update(int index, ProgrammingLanguages programmingLanguages) throws Exception {
        for(ProgrammingLanguages pL : programmingLanguagesRepository.getAll()){
            if(Objects.equals(pL.getName(), programmingLanguages.getName())){
                throw new Exception("Programming language name can not repeat! Change the name please!");
            }
        }

        if (Objects.equals(programmingLanguages.getName(), " ")) {
            throw new Exception("Programming language name can not be null! Give the name please!");
        }

        programmingLanguagesRepository.update(index, programmingLanguages);

    }

    @Override
    public void delete(int id) throws Exception {
        programmingLanguagesRepository.delete(id);
    }
    @Override
    public List<ProgrammingLanguages> getAll() {
        return programmingLanguagesRepository.getAll();
    }

    @Override
    public ProgrammingLanguages findById(int id) throws Exception{

        return programmingLanguagesRepository.findById(id);
    }
}
