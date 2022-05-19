package com.sist.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sist.music.service.MusicService;
import com.sist.music.vo.MusicVO;

@RestController
public class MusicRestController {
	
	@Autowired
	private MusicService service;
	
	@GetMapping("/detail")
	public MusicVO musicDetailData(String no) {
		int mno = Integer.parseInt(no);
		MusicVO vo = service.musicDetailData(mno);
		return vo;
	}
}
