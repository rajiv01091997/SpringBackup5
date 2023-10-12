package com.glo.payload;

import java.util.List;

public class BookResponse {
	
	private List<BookDto> content;
	private int pageNo;
	private int pageSize;
	private int totalElements;
	private int totalPages;
	private boolean isLast;
	
	
	public BookResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BookResponse(List<BookDto> content, int pageNo, int pageSize, int totalElements, int totalPages, boolean isLast) {
		super();
		this.content = content;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
		this.isLast = isLast;
	}


	public List<BookDto> getContent() {
		return content;
	}


	public void setContent(List<BookDto> dtoList) {
		this.content = dtoList;
	}


	public int getPageNo() {
		return pageNo;
	}


	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public int getTotalElements() {
		return totalElements;
	}


	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}


	public int getTotalPages() {
		return totalPages;
	}


	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}


	public boolean isLast() {
		return isLast;
	}


	public void setLast(boolean isLast) {
		this.isLast = isLast;
	}


	@Override
	public String toString() {
		return "BookResponse [content=" + content + ", pageNo=" + pageNo + ", pageSize=" + pageSize + ", totalElements="
				+ totalElements + ", totalPages=" + totalPages + ", isLast=" + isLast + "]";
	}
	
	
	
	
	

}
