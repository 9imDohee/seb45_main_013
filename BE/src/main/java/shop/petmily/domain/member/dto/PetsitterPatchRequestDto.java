package shop.petmily.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import shop.petmily.domain.member.entity.Member;
import shop.petmily.domain.member.entity.Petsitter;

import java.sql.Time;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class PetsitterPatchRequestDto {

    private long petsitterId;

    private Petsitter.PossiblePetType possiblePetType;

    private List<String> possibleLocation;

    private String possibleDay;

    private Time possibleTimeStart;

    private Time possibleTimeEnd;

    public void setPetsitterId(long petsitterId) {
        this.petsitterId = petsitterId;
    }
}
