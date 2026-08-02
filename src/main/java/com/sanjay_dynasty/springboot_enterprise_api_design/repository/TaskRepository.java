package com.sanjay_dynasty.springboot_enterprise_api_design.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjay_dynasty.springboot_enterprise_api_design.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

    // List<Task> findByStatus(TaskStatus status);

    // List<Task> findByPriority(Priority priority);

    // List<Task> findByUser(User user);

    // List<Task> findByUserEmail(String email);

    // List<Task> findByStatusAndPriority(TaskStatus status, Priority priority);

    // Long countByStatus(TaskStatus status);

    // // Pagination Support
    // Page<Task> findByStatus(TaskStatus status, Pageable pageable);

    // Page<Task> findByPriority(Priority priority, Pageable pageable);

    // Page<Task> findByUser(User user, Pageable pageable);

}
