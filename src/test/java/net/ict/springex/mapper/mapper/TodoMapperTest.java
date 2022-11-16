package net.ict.springex.mapper.mapper;

import lombok.extern.log4j.Log4j2;
import net.ict.springex.domain.TodoVO;
import net.ict.springex.dto.PageRequestDTO;
import net.ict.springex.dto.PageResponseDTO;
import net.ict.springex.dto.TodoDTO;
import net.ict.springex.mapper.TodoMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoMapperTest {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    @Test
    public void testgettodo(){
        log.info(todoMapper.getTime());
    }

    @Test
    public void testInser(){
        TodoVO todoVO = TodoVO.builder()
                .title("spuring TEST")
                .dueDate(LocalDate.of(2022,11,16))
                .writer("ICT05")
                .build();
            todoMapper.insert(todoVO);

    }

//    @Test
//    public void testSelectAll(){
//        List<TodoVO> voList = todoMapper.selectAll();
//        voList.forEach(vo->log.info(vo));
//    }

    @Test
    public void testdelete(){
        todoMapper.delete(1l);

    }

    @Test
    public void testSelectList(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(1)
                .size(10)
                .build();
        List<TodoVO> voList=todoMapper.selectList(pageRequestDTO);
        voList.forEach(vo->log.info(vo));
    }



}
