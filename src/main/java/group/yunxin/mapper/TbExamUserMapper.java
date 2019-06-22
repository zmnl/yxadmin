package group.yunxin.mapper;

import group.yunxin.pojo.TbExamUser;
import group.yunxin.pojo.TbExamUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbExamUserMapper {
    int countByExample(TbExamUserExample example);

    int deleteByExample(TbExamUserExample example);

    int insert(TbExamUser record);

    int insertSelective(TbExamUser record);

    List<TbExamUser> selectByExample(TbExamUserExample example);

    int updateByExampleSelective(@Param("record") TbExamUser record, @Param("example") TbExamUserExample example);

    int updateByExample(@Param("record") TbExamUser record, @Param("example") TbExamUserExample example);
}