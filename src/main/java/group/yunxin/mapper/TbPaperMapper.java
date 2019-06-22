package group.yunxin.mapper;

import group.yunxin.pojo.TbPaper;
import group.yunxin.pojo.TbPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPaperMapper {
    int countByExample(TbPaperExample example);

    int deleteByExample(TbPaperExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbPaper record);

    int insertSelective(TbPaper record);

    List<TbPaper> selectByExample(TbPaperExample example);

    TbPaper selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbPaper record, @Param("example") TbPaperExample example);

    int updateByExample(@Param("record") TbPaper record, @Param("example") TbPaperExample example);

    int updateByPrimaryKeySelective(TbPaper record);

    int updateByPrimaryKey(TbPaper record);
}