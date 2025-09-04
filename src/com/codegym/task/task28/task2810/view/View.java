package com.codegym.task.task28.task2810.view;

import com.codegym.task.task28.task2810.vo.JobPosting;
import com.codegym.task.task28.task2810.Controller;

import java.util.List;

public interface View {
    void update(List<JobPosting> jobPostings);
    void setController(Controller controller);
}
