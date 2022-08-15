package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/test")
    public String get() {
        return "Xin chao cac ban";
    }
}
//    pipeline {
//        agent any
//        tools{
//            maven 'maven:3.6'
//        }
//        stages{
//            stage('Build Maven'){
//                steps{
//                    git branch: 'main', credentialsId: 'TEST_CICD', url: 'https://github.com/anhteo21499/CICD_DOCKER.git'
//                    sh "mvn clean install"
//
//                }
//            }
//
//            stage('Build docker'){
//                steps{
//                    sh 'docker build -t demo1-0.0.1-SNAPSHOT .'
//                }
//            }
//        }
//    }
