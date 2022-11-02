package kodlama.io.devs;

import kodlama.io.devs.entity.concretes.ProgrammingLanguages;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
public class FirstTests {

    @Test
    public void firstTest() {
        ProgrammingLanguages programmingLanguages = new ProgrammingLanguages(1, "Eren");
        System.out.println(programmingLanguages.getId());
        System.out.println(programmingLanguages.getName());
        programmingLanguages.setName("Handan");
        System.out.println(programmingLanguages.getName());
    }
}
