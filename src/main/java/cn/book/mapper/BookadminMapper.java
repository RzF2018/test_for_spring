package cn.book.mapper;

import cn.book.pojo.Bookadmin;
import cn.book.pojo.BookadminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookadminMapper {
    long countByExample(BookadminExample example);

    int deleteByExample(BookadminExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Bookadmin record);

    int insertSelective(Bookadmin record);

    List<Bookadmin> selectByExample(BookadminExample example);

    Bookadmin selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Bookadmin record, @Param("example") BookadminExample example);

    int updateByExample(@Param("record") Bookadmin record, @Param("example") BookadminExample example);

    int updateByPrimaryKeySelective(Bookadmin record);

    int updateByPrimaryKey(Bookadmin record);
}