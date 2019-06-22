package group.yunxin.mapper;

import group.yunxin.pojo.TbBank;
import group.yunxin.pojo.TbBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBankMapper {
    int countByExample(TbBankExample example);

    int deleteByExample(TbBankExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbBank record);

    int insertSelective(TbBank record);

    List<TbBank> selectByExample(TbBankExample example);

    TbBank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbBank record, @Param("example") TbBankExample example);

    int updateByExample(@Param("record") TbBank record, @Param("example") TbBankExample example);

    int updateByPrimaryKeySelective(TbBank record);

    int updateByPrimaryKey(TbBank record);
}