package com.ndhao.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.ndhao.dto.TestDto;
import com.ndhao.entity.Test;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TestMapper {
	TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);
	
	@Mapping(target = "id", ignore = true)
	Test toEntity(TestDto cmd);
}
