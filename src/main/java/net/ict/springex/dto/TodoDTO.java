package net.ict.springex.dto;


import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

//객체 자료형은 파라미터로 처리하기 위해서는 객체로 생성되고 setXXX() 이용해서 처리
@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {
    private Long tno;

    @NotEmpty
    private String title;

    @Future
    private LocalDate dueDate;
    private boolean finished;

    @NotEmpty
    private String writer;  //작성자를 의미

}
