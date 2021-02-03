package com.sinbxeunha.josechan.service;

import org.springframework.stereotype.Service;

@Service
public class ComputerService implements ServiceInterface{

    public double add(double a, double b){
        return a + b;
    }

    public double mul(double a, double b){
        return a * b;
    }

    public double sub(double a, double b){
        return a - b;
    }

    public double div(double a, double b){
        return a / b;
    }
}
