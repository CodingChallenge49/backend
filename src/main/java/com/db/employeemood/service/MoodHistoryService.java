package com.db.employeemood.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.db.employeemood.model.MoodHistory;
import com.db.employeemood.repository.MoodHistoryRepository;

@Service
public class MoodHistoryService {
	@Autowired
	MoodHistoryRepository moodHistoryRepository;
	
	public MoodHistory saveMoodHistory(MoodHistory moodHistory) {
		moodHistoryRepository.save(moodHistory);
		return moodHistory;
	}

	public List<MoodHistory> getTopHistory(int noHistory){
		Collection<MoodHistory> collection = moodHistoryRepository.findTopHistory(noHistory);
		List<MoodHistory> moodHistory = collection.stream().collect(Collectors.toList());
		return moodHistory;
	}
	
	public List<MoodHistory> getAllHistory(String date){
		Collection<MoodHistory> collection = moodHistoryRepository.findAllHistory(date);
		List<MoodHistory> moodHistory = collection.stream().collect(Collectors.toList());
		return moodHistory;
	}
}
