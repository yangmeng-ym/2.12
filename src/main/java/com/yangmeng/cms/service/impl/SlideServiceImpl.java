package com.yangmeng.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangmeng.cms.dao.SlideDao;
import com.yangmeng.cms.pojo.Slide;
import com.yangmeng.cms.service.SlideService;

@Service
public class SlideServiceImpl implements SlideService{
	@Autowired
	private SlideDao slideDao;
	@Override
	public List<Slide> getAll() {
		return slideDao.select(null);
	}

}
