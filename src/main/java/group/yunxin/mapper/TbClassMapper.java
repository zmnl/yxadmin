package group.yunxin.mapper;

import group.yunxin.pojo.TbClass;
import group.yunxin.pojo.TbClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbClassMapper {
    int countByExample(TbClassExample example);

    int deleteByExample(TbClassExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbClass record);

    int insertSelective(TbClass record);

    List<TbClass> selectByExample(TbClassExample example);

    TbClass selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbClass record, @Param("example") TbClassExample example);

    int updateByExample(@Param("record") TbClass record, @Param("example") TbClassExample example);

    int updateByPrimaryKeySelective(TbClass record);

    int updateByPrimaryKey(TbClass record);
}