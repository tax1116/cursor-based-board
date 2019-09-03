package kr.flab.ht.project.service;

import kr.flab.ht.project.mapper.UserMapper;
import kr.flab.ht.project.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Mock
    private UserMapper userMapper;
    @InjectMocks
    private UserService userService;

    @Test
    public void userPromotionTargetTest() {
        Mockito.when(userMapper.getUserById(1L)).thenReturn(new User(1L, "Kim", "서울특별시 도봉구"));
        Mockito.when(userMapper.getUserById(2L)).thenReturn(new User(2L, "Park", "경기도 성남시"));

        // Not implemented
        // 선물을 주는 동작이 수행되어야 한다.
        userService.getUser(1L);
        assertEquals("", "");

        // Not implemented
        // 선물을 주는 동작이 수행되어야 한다.
        userService.getUser(2L);
        assertEquals("", "");
    }
}
