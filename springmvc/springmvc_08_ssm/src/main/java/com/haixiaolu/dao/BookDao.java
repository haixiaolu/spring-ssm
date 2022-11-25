package com.haixiaolu.dao;

import com.haixiaolu.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    // 两种方法都行
    // @Insert("insert into tbl_book values(null, #{type}, #{name}, #{description})")
    @Insert("insert into ssm_db.tbl_book (type, name, description) values( #{type}, #{name}, #{description})")
    public void save(Book book);

    @Update("update ssm_db.tbl_book set type=#{type}, name = #{name}, description = #{description} where id = #{id}")
    public void update(Book book);

    @Delete("delete from ssm_db.tbl_book where id = #{id}")
    public void delete(Integer id);

    @Select("select * from ssm_db.tbl_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from ssm_db.tbl_book")
    public List<Book> getAll();

}
