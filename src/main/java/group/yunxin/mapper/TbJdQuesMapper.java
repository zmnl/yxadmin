package group.yunxin.mapper;

import group.yunxin.pojo.TbJdQues;
import group.yunxin.pojo.TbJdQuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbJdQuesMapper {
    int countByExample(TbJdQuesExample example);

    int deleteByExample(TbJdQuesExample example);

    int deleteByPrimaryKey(Long quesId);

    int insert(TbJdQues record);

    int insertSelective(TbJdQues record);

    List<TbJdQues> selectByExample(TbJdQuesExample example);

    TbJdQues selectByPrimaryKey(Long quesId);

    int updateByExampleSelective(@Param("record") TbJdQues record, @Param("example") TbJdQuesExample example);

    int updateByExample(@Param("record") TbJdQues record, @Param("example") TbJdQuesExample example);

    int updateByPrimaryKeySelective(TbJdQues record);

    int updateByPrimaryKey(TbJdQues record);
}