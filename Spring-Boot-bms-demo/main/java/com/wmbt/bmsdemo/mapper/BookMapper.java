package com.wmbt.bmsdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.wmbt.bmsdemo.model.Book;

@Mapper
public interface BookMapper {
	
	@Select("select * from v_book order by id;")
	List<Book> getAllBook();

	@Insert("insert into book(id, name, author, publish, shelf, address, state, pic_path, borrow_time, price) values(#{id}, #{name}, #{author}, #{publish}, #{shelf}, #{address}, #{state}, #{pic_path}, #{borrow_time}, #{price})")
    void newBook1(@Param("id") String id, @Param("name") String name, @Param("author") String author, @Param("publish") String publish, @Param("shelf") int shelf, @Param("address") char address, @Param("state") int state, @Param("pic_path") String pic_path, @Param("borrow_time") int borrow_time, @Param("price") double price);

	@Insert("insert into book_type select id type_id, #{id} from type where name like #{type};")
    void newBook2(@Param("id") String id, @Param("type") String type);

	@Delete("DELETE FROM book_type WHERE book_id LIKE #{id};")
	void deleteById1(@Param("id") String id);

    @Delete("DELETE FROM book WHERE id LIKE #{id};")
	void deleteById2(@Param("id") String id);

    @Update("update book set name = #{name}, author = #{author}, publish = #{publish}, shelf = #{shelf}, address = #{address}, state = #{state}, pic_path = #{pic_path}, borrow_time = #{borrow_time}, price = #{price} where id like #{id}")
    void updateById1(@Param("id") String id, @Param("name") String name, @Param("author") String author, @Param("publish") String publish, @Param("shelf") int shelf, @Param("address") char address, @Param("state") int state, @Param("pic_path") String pic_path, @Param("borrow_time") int borrow_time, @Param("price") double price);

    @Update("update book_type set type_id = (select id from type where name like #{type}) where book_id like #{id};")
    void updateById2(@Param("id") String id, @Param("type") String type);

    @Select("select * from v_book where name like concat('%',#{name},'%')")
	List<Book> getBookByName(@Param("name") String name);
}
