package group.yunxin.mapper;

import group.yunxin.pojo.TbLoginRecord;
import group.yunxin.pojo.TbLoginRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLoginRecordMapper {
    int countByExample(TbLoginRecordExample example);

    int deleteByExample(TbLoginRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbLoginRecord record);

    int insertSelective(TbLoginRecord record);

    List<TbLoginRecord> selectByExample(TbLoginRecordExample example);

    TbLoginRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbLoginRecord record, @Param("example") TbLoginRecordExample example);

    int updateByExample(@Param("record") TbLoginRecord record, @Param("example") TbLoginRecordExample example);

    int updateByPrimaryKeySelective(TbLoginRecord record);

    int updateByPrimaryKey(TbLoginRecord record);
}