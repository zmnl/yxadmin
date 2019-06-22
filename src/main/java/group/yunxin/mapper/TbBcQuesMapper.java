package group.yunxin.mapper;

import group.yunxin.pojo.TbBcQues;
import group.yunxin.pojo.TbBcQuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBcQuesMapper {
    int countByExample(TbBcQuesExample example);

    int deleteByExample(TbBcQuesExample example);

    int deleteByPrimaryKey(Long quesId);

    int insert(TbBcQues record);

    int insertSelective(TbBcQues record);

    List<TbBcQues> selectByExample(TbBcQuesExample example);

    TbBcQues selectByPrimaryKey(Long quesId);

    int updateByExampleSelective(@Param("record") TbBcQues record, @Param("example") TbBcQuesExample example);

    int updateByExample(@Param("record") TbBcQues record, @Param("example") TbBcQuesExample example);

    int updateByPrimaryKeySelective(TbBcQues record);

    int updateByPrimaryKey(TbBcQues record);
}