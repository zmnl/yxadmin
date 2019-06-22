package group.yunxin.mapper;

import group.yunxin.pojo.TbQues;
import group.yunxin.pojo.TbQuesBank;
import group.yunxin.pojo.TbQuesBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbQuesBankMapper {
    int countByExample(TbQuesBankExample example);

    int deleteByExample(TbQuesBankExample example);

    int insert(TbQuesBank record);

    int insertSelective(TbQuesBank record);

    List<TbQuesBank> selectByExample(TbQuesBankExample example);

    int updateByExampleSelective(@Param("record") TbQuesBank record, @Param("example") TbQuesBankExample example);

    int updateByExample(@Param("record") TbQuesBank record, @Param("example") TbQuesBankExample example);
    
    TbQues searchQues(Long bank_id,Long ques_id);
    
    int deleteQues(Long bank_id,Long ques_id);
}