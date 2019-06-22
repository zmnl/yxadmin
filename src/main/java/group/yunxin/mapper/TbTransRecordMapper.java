package group.yunxin.mapper;

import group.yunxin.pojo.TbTransRecord;
import group.yunxin.pojo.TbTransRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTransRecordMapper {
    int countByExample(TbTransRecordExample example);

    int deleteByExample(TbTransRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbTransRecord record);

    int insertSelective(TbTransRecord record);

    List<TbTransRecord> selectByExample(TbTransRecordExample example);

    TbTransRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbTransRecord record, @Param("example") TbTransRecordExample example);

    int updateByExample(@Param("record") TbTransRecord record, @Param("example") TbTransRecordExample example);

    int updateByPrimaryKeySelective(TbTransRecord record);

    int updateByPrimaryKey(TbTransRecord record);
}