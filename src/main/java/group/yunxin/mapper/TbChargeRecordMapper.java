package group.yunxin.mapper;

import group.yunxin.pojo.TbChargeRecord;
import group.yunxin.pojo.TbChargeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbChargeRecordMapper {
    int countByExample(TbChargeRecordExample example);

    int deleteByExample(TbChargeRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbChargeRecord record);

    int insertSelective(TbChargeRecord record);

    List<TbChargeRecord> selectByExample(TbChargeRecordExample example);

    TbChargeRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbChargeRecord record, @Param("example") TbChargeRecordExample example);

    int updateByExample(@Param("record") TbChargeRecord record, @Param("example") TbChargeRecordExample example);

    int updateByPrimaryKeySelective(TbChargeRecord record);

    int updateByPrimaryKey(TbChargeRecord record);
}