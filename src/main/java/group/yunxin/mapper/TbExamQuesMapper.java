package group.yunxin.mapper;

import group.yunxin.pojo.TbExamQues;
import group.yunxin.pojo.TbExamQuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbExamQuesMapper {
    int countByExample(TbExamQuesExample example);

    int deleteByExample(TbExamQuesExample example);

    int insert(TbExamQues record);

    int insertSelective(TbExamQues record);

    List<TbExamQues> selectByExample(TbExamQuesExample example);

    int updateByExampleSelective(@Param("record") TbExamQues record, @Param("example") TbExamQuesExample example);

    int updateByExample(@Param("record") TbExamQues record, @Param("example") TbExamQuesExample example);
}