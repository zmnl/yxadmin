package group.yunxin.mapper;

import group.yunxin.pojo.TbQues;
import group.yunxin.pojo.TbQuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbQuesMapper {
    int countByExample(TbQuesExample example);

    int deleteByExample(TbQuesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbQues record);

    int insertSelective(TbQues record);

    List<TbQues> selectByExample(TbQuesExample example);

    TbQues selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbQues record, @Param("example") TbQuesExample example);

    int updateByExample(@Param("record") TbQues record, @Param("example") TbQuesExample example);

    int updateByPrimaryKeySelective(TbQues record);

    int updateByPrimaryKey(TbQues record);
}