package generator;

import generator.StallApply;
import generator.StallApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StallApplyDao {
    long countByExample(StallApplyExample example);

    int deleteByExample(StallApplyExample example);

    int deleteByPrimaryKey(Integer applyId);

    int insert(StallApply record);

    int insertSelective(StallApply record);

    List<StallApply> selectByExample(StallApplyExample example);

    StallApply selectByPrimaryKey(Integer applyId);

    int updateByExampleSelective(@Param("record") StallApply record, @Param("example") StallApplyExample example);

    int updateByExample(@Param("record") StallApply record, @Param("example") StallApplyExample example);

    int updateByPrimaryKeySelective(StallApply record);

    int updateByPrimaryKey(StallApply record);
}