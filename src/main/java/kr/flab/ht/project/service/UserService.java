package kr.flab.ht.project.service;

import kr.flab.ht.project.mapper.UserMapper;
import kr.flab.ht.project.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private static final String PROMOTION_AREA = "서울특별시";

    @Autowired
    private UserMapper userMapper;

    public User getUser(Long id) {

        User selectedUser = userMapper.getUserById(id);
        if (selectedUser == null) {
            LOGGER.error("존재하지 않는 유저입니다 : {}", id);
            throw new IllegalArgumentException("존재하지 않는 유저입니다.");
        }

        if (selectedUser.getAddr().startsWith(PROMOTION_AREA)) {
            // 유저에게 선물 지급
        }

        return selectedUser;
    }

    public void signUp(User user) {
        userMapper.insertUser(user);
    }
}
