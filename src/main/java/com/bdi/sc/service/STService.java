package com.bdi.sc.service;

import java.util.List;

import com.bdi.sc.vo.STVO;

public interface STService {
	public List<STVO> selectSTList(STVO st);
	public STVO selectST(int stnum);
	public int insertST(STVO st);
	public int updateST(STVO st);
	public int deleteST(int stnum);
	public int login(STVO st);
}