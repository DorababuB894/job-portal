package com.mine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mine.model.Job;
import com.mine.repository.StdRepo;

@Service
public class Stdservice {
    @Autowired
    private StdRepo repo;

    public void addjob(Job job) {
        repo.addJob(job);
    }

    public List<Job> findAlljobs() {
        return repo.findAll();
    }
}
