package br.com.mhc.paginator;

public class Paginator {

	private Integer currentPage;
	private Integer pages;
	private Integer records;
	private Integer first;
	private Integer interval;

	public Paginator() {
		
	}
	public Paginator(Integer currentPage, Integer pages, Integer records, Integer first, Integer interval) {
		this.currentPage = currentPage;
		this.pages = pages;
		this.records = records;
		this.first = first;
		this.interval = interval;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPages() {
		return this.pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getRecords() {
		return this.records;
	}
	public void setRecords(Integer records) {
		this.records = records;
	}
	public Integer getFirst() {
		return this.first;
	}
	public void setFirst(Integer first) {
		this.first = first;
	}
	public Integer getInterval() {
		return this.interval;
	}
	public void setInterval(Integer interval) {
		this.interval = interval;
	}

}
