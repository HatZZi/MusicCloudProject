package com.sist.music.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.music.dao.MusicMapper;
import com.sist.music.vo.MusicVO;

@Service
public class MusicServiceimpl implements MusicService{
	@Autowired
	private MusicMapper mapper;

	@Override
	public List<MusicVO> musicListData(Map map) {
		// TODO Auto-generated method stub
		return mapper.musicListData(map);
	}

	@Override
	public int musicTotalPage(int curcate) {
		// TODO Auto-generated method stub
		return mapper.musicTotalPage(curcate);
	}

	@Override
	public MusicVO musicDetailData(int no) {
		// TODO Auto-generated method stub
		return mapper.musicDetailData(no);
	}

	
	
//	@Override
//	public List<MusicVO> musicTopList(int curcate){
//		return mapper.musicTopList(curcate);
//	}
}
