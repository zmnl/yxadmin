package group.yunxin.mapper;

import group.yunxin.pojo.TbPdQues;
import group.yunxin.pojo.TbPdQuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPdQuesMapper
{
	int countByExample(TbPdQuesExample example);

	int deleteByExample(TbPdQuesExample example);

	int deleteByPrimaryKey(Long quesId);

	int insert(TbPdQues record);

	int insertSelective(TbPdQues record);

	List<TbPdQues> selectByExample(TbPdQuesExample example);

	TbPdQues selectByPrimaryKey(Long quesId);

	int updateByExampleSelective(@Param("record") TbPdQues record, @Param("example") TbPdQuesExample example);

	int updateByExample(@Param("record") TbPdQues record, @Param("example") TbPdQuesExample example);

	int updateByPrimaryKeySelective(TbPdQues record);

	int updateByPrimaryKey(TbPdQues record);
}