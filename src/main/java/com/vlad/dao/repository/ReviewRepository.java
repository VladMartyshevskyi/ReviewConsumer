package com.vlad.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vlad.dao.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
