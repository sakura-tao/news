package com.lzh.dao;

import java.util.List;

import com.lzh.domain.News;
import com.lzh.domain.Page;

public interface NewsDao { 
	public static final String SERVER_NAME="com.lzh.dao.NewsDaoImpl";
	public void insertNews(News news);
	public void deleteNews(int id); 
	public void updateNews(News news);
	public List<News> getNew(int id);
	public List<News> getNews(Page page);
	public News getOne(int id);
	public List<News> getNewsByType(String type);
	public News getMaxByType(String type);
	public List<News> getByRead();
	public List<News> getByDateAndRead();
	public List<News> getByWeekAndRead();
	public List<News> getByMonthAndRead();
}
