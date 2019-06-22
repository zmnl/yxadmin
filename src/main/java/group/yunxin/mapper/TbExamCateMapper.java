package group.yunxin.mapper;

import group.yunxin.pojo.TbExamCate;
import group.yunxin.pojo.TbExamCateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbExamCateMapper {
    int countByExample(TbExamCateExample example);

    int deleteByExample(TbExamCateExample example);

    int insert(TbExamCate record);

    int insertSelective(TbExamCate record);

    List<TbExamCate> selectByExample(TbExamCateExample example);

    int updateByExampleSelective(@Param("record") TbExamCate record, @Param("example") TbExamCateExample example);

    int updateByExample(@Param("record") TbExamCate record, @Param("example") TbExamCateExample example);
}