package com.xj.dao;

import java.util.List;

import com.xj.vo.FeedBack;

public interface IFeedBack {

	public List<FeedBack> QueryAllFeedBack();

	public FeedBack QueryFeedBackByID(int id);

	public void InsertFeedBack(FeedBack fb);

	public void DeleteFeedBack(int id);

	public void UpdateFeedBack(FeedBack fb);
}
