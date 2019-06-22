package group.yunxin.mapper;

import group.yunxin.pojo.TbTkQues;
import group.yunxin.pojo.TbTkQuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTkQuesMapper {
    int countByExample(TbTkQuesExample example);

    int deleteByExample(TbTkQuesExample example);

    int deleteByPrimaryKey(Long quesId);

    int insert(TbTkQues record);

    int insertSelective(TbTkQues record);

    List<TbTkQues> selectByExample(TbTkQuesExample example);

    TbTkQues selectByPrimaryKey(Long quesId);

    int updateByExampleSelective(@Param("record") TbTkQues record, @Param("example") TbTkQuesExample example);

    int updateByExample(@Param("record") TbTkQues record, @Param("example") TbTkQuesExample example);

    int updateByPrimaryKeySelective(TbTkQues record);

    int updateByPrimaryKey(TbTkQues record);
}