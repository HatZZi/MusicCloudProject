package com.sist.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import com.sist.music.service.*;
import com.sist.music.vo.*;

@Controller
public class MusicController {
	@Autowired
	private MusicService service;
	
	@GetMapping("/")
	public String musicListData(String page, Model model,String cate) {
		if(page==null)
			page="1";
		int curpage=Integer.parseInt(page);
		if(cate==null)
			cate="1";
		int curcate=Integer.parseInt(cate);
		Map map = new HashMap();
		map.put("cate", curcate);
		int size=20;
		int start=(size*curpage)-size;
		map.put("start", start);
		map.put("size", size);
		List<MusicVO> list = service.musicListData(map);
//		List<MusicVO> topList = service.musicTopList(curcate);
		int totalpage = service.musicTotalPage(curcate);
		model.addAttribute("list",list);
//		model.addAttribute("topList",topList);
		model.addAttribute("curpage",curpage);
		model.addAttribute("totalpage",totalpage);
		return "main";
	}
}
