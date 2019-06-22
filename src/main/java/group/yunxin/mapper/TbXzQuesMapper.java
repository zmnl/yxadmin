package group.yunxin.mapper;

import group.yunxin.pojo.TbXzQues;
import group.yunxin.pojo.TbXzQuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbXzQuesMapper {
    int countByExample(TbXzQuesExample example);

    int deleteByExample(TbXzQuesExample example);

    int deleteByPrimaryKey(Long quesId);

    int insert(TbXzQues record);

    int insertSelective(TbXzQues record);

    List<TbXzQues> selectByExample(TbXzQuesExample example);

    TbXzQues selectByPrimaryKey(Long quesId);

    int updateByExampleSelective(@Param("record") TbXzQues record, @Param("example") TbXzQuesExample example);

    int updateByExample(@Param("record") TbXzQues record, @Param("example") TbXzQuesExample example);

    int updateByPrimaryKeySelective(TbXzQues record);

    int updateByPrimaryKey(TbXzQues record);
}