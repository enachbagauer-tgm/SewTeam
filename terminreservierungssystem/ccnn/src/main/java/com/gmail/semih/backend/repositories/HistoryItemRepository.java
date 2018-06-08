package com.gmail.semih.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.semih.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
