package generator;

import generator.Stall;
import generator.StallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StallDao {
    long countByExample(StallExample example);

    int deleteByExample(StallExample example);

    int deleteByPrimaryKey(Integer stallId);

    int insert(Stall record);

    int insertSelective(Stall record);

    List<Stall> selectByExample(StallExample example);

    Stall selectByPrimaryKey(Integer stallId);

    int updateByExampleSelective(@Param("record") Stall record, @Param("example") StallExample example);

    int updateByExample(@Param("record") Stall record, @Param("example") StallExample example);

    int updateByPrimaryKeySelective(Stall record);

    int updateByPrimaryKey(Stall record);
}