package net.ict.springex.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

//페이지처리는 현재페이지 번호(page),한페이지당 보여주는 데이터수(size) 기본적으로 필요
//
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageRequestDTO {
    @Builder.Default
    @Min(value = 1)
    @Positive
    private int page=1;

    @Builder.Default //페이지나 size의 기본값값
   @Min(value = 10)
    @Max(value = 100)
    @Positive
    private int size=10;

    public int getSkip(){
        return (page-1)*10;
    }

}
