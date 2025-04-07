package com.restapi.demorestapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.restapi.demorestapi.model.Person;

@Mapper
public interface PersonMapper {

    Object getPersonById = null;

    @Select("SELECT * FROM persontbl")
    public List<Person> getAllPersons();

    @Select("SELECT * FROM persontbl WHERE personId = #{personId}")
    public Person getPersonById(int personId);

    @Insert("INSERT INTO persontbl(personFullname, personAge ) VALUES ( #{personFullname}, #{personAge})")
    @Options(useGeneratedKeys = true, keyProperty = "personId")
    public Person insertPerson(Person person);

    @Update("UPDATE persontbl SET personFullname= #{personFullname}, personAge= #{personAge} "
            + "WHERE personId = #{personId} ")
    public void updatePerson(int personId );

    @Delete("DELETE FROM persontbl WHERE personId =#{personId}")
    public void deletePerson(int personId);

}
