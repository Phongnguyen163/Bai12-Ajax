package com.example.demo.service;

import com.example.demo.model.SmartPhone;
import com.example.demo.repository.ISmartPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartPhoneService implements ISmartPhoneService{
    @Autowired
    private ISmartPhoneRepository smartphoneRepository;

    @Override
    public Iterable<SmartPhone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Optional<SmartPhone> findById(Long id) {
        return smartphoneRepository.findById(id);
    }

    @Override
    public SmartPhone save(SmartPhone smartPhone) {
        return smartphoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        smartphoneRepository.deleteById(id);
    }
}
