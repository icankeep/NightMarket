package generator;

import generator.UserStall;
import generator.UserStallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStallDao {
    long countByExample(UserStallExample example);

    int deleteByExample(UserStallExample example);

    int deleteByPrimaryKey(Integer userStallId);

    int insert(UserStall record);

    int insertSelective(UserStall record);

    List<UserStall> selectByExample(UserStallExample example);

    UserStall selectByPrimaryKey(Integer userStallId);

    int updateByExampleSelective(@Param("record") UserStall record, @Param("example") UserStallExample example);

    int updateByExample(@Param("record") UserStall record, @Param("example") UserStallExample example);

    int updateByPrimaryKeySelective(UserStall record);

    int updateByPrimaryKey(UserStall record);
}