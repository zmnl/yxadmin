package group.yunxin.mapper;

import group.yunxin.pojo.TbClassUser;
import group.yunxin.pojo.TbClassUserExample;
import group.yunxin.pojo.TbUser;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbClassUserMapper {
    int countByExample(TbClassUserExample example);

    int deleteByExample(TbClassUserExample example);

    int insert(TbClassUser record);
    
    int insertSelective(TbClassUser record);

    List<TbClassUser> selectByExample(TbClassUserExample example);

    int updateByExampleSelective(@Param("record") TbClassUser record, @Param("example") TbClassUserExample example);

    int updateByExample(@Param("record") TbClassUser record, @Param("example") TbClassUserExample example);
}