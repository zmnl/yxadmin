package group.yunxin.mapper;

import group.yunxin.pojo.TbOneAnswer;
import group.yunxin.pojo.TbOneAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOneAnswerMapper {
    int countByExample(TbOneAnswerExample example);

    int deleteByExample(TbOneAnswerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbOneAnswer record);

    int insertSelective(TbOneAnswer record);

    List<TbOneAnswer> selectByExample(TbOneAnswerExample example);

    TbOneAnswer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbOneAnswer record, @Param("example") TbOneAnswerExample example);

    int updateByExample(@Param("record") TbOneAnswer record, @Param("example") TbOneAnswerExample example);

    int updateByPrimaryKeySelective(TbOneAnswer record);

    int updateByPrimaryKey(TbOneAnswer record);
}