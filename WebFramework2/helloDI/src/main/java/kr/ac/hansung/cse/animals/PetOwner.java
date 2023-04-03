package kr.ac.hansung.cse.animals;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//@AllArgsConstructor // 생성자
public class PetOwner {

    @Autowired // wiring by type
    @Qualifier("qf_dog")
    public AnimalType animal;

    public void play() {
        animal.sound();
    }
}
