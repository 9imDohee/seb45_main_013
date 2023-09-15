package shop.petmily.domain.pet.dto;

import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

public class PetPatchDto {

    @Getter
    public static class Request {
        private Long petId;

        public void setPetId(long petId) {
            this.petId = petId;
        }

        private Long memberId;

        public void setMemberId(long memberId) {
            this.memberId = memberId;
        }

        private Integer age;

        private Integer weight;

        private String body;

        private String name;

        private Boolean neutering;

        private MultipartFile file;
    }
}
