package kr.flab.ht.project.mapper;

import kr.flab.ht.project.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT id, name, addr FROM user WHERE id=#{value}")
    User getUserById(Long id);

    @Insert("INSERT INTO user(name, addr) VALUES(#{name}, #{addr})")
    void insertUser(User item);
}
