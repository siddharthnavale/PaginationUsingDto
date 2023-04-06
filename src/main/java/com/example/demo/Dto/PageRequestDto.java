package com.example.demo.Dto;

import java.util.Objects;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageRequestDto {
	
	private int pageNo=0;
	private int pageSize=1;
	
    public Pageable getPagable(PageRequestDto dto) {
    Integer page= Objects.nonNull(dto.getPageNo()) ? dto.getPageNo():this.pageNo;
    Integer size= Objects.nonNull(dto.getPageSize()) ? dto.getPageSize():this.pageSize;
    
    PageRequest pageReuest = PageRequest.of(page -1 , size);
   
	return pageReuest;

}
	
	

}
