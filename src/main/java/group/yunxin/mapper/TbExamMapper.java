package group.yunxin.mapper;

import group.yunxin.pojo.TbExam;
import group.yunxin.pojo.TbExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbExamMapper {
    int countByExample(TbExamExample example);

    int deleteByExample(TbExamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbExam record);

    int insertSelective(TbExam record);

    List<TbExam> selectByExample(TbExamExample example);

    TbExam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbExam record, @Param("example") TbExamExample example);

    int updateByExample(@Param("record") TbExam record, @Param("example") TbExamExample example);

    int updateByPrimaryKeySelective(TbExam record);

    int updateByPrimaryKey(TbExam record);
}