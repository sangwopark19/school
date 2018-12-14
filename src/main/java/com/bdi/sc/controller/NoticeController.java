package com.bdi.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sc.service.NoticeService;
import com.bdi.sc.vo.Notice;

@Controller
public class NoticeController {

	@Autowired
	NoticeService ns;
	
	@GetMapping(value="/notice")
	public @ResponseBody List<Notice> selectNoticeList(Notice notice) {
		return ns.selectNoticeList(notice);
	}
	@GetMapping(value="/notice/{noticenum}")
	public @ResponseBody Notice selectNotice(@PathVariable Integer noticenum) {
		return ns.selectNotice(noticenum);
	}
	
	@PostMapping(value="/notice")
	public @ResponseBody int insertNotice(@RequestBody Notice notice) {
		return ns.insertNotice(notice);
	}
	
	@PutMapping(value="/notice")
	public @ResponseBody int updateNotice(@RequestBody Notice notice) {
		return ns.updateNotice(notice);
	}
	
	@DeleteMapping(value="/notice/{noticenum}")
	public @ResponseBody int deleteNotice(@PathVariable Integer noticenum) {
		return ns.deleteNotice(noticenum);
	}
}