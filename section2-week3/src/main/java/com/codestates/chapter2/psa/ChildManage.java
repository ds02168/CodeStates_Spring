package com.codestates.chapter2.psa;

import com.codestates.chapter2.psa.Child;

public class ChildManage {
}

class NewBornBaby extends Child {
    @Override
    protected void smile() {
        System.out.println("신생아는 가끔 웃어요");
    }

    @Override
    protected void cry() {
        System.out.println("신생아는 자주 울어요");
    }

    @Override
    protected void sleep() {
        System.out.println("신생아는 거의 하루 종일 자요");
    }

    @Override
    protected void eat() {
        System.out.println("신생아는 분유만 먹어요");
    }
}

class Infant extends Child {
    @Override
    protected void smile() {
        System.out.println("영아는 많이 웃어요");
    }

    @Override
    protected void cry() {
        System.out.println("영아는 종종 울어요");
    }

    @Override
    protected void sleep() {
        System.out.println("영아부터는 밤에 잠을 자기 시작해요");
    }

    @Override
    protected void eat() {
        System.out.println("영아부터는 이유식을 시작해요");
    }
}

class Toddler extends Child {
    @Override
    protected void smile() {
        System.out.println("유아는 웃길 때 웃어요");
    }

    @Override
    protected void cry() {
        System.out.println("유아는 화가나면 울어요");
    }

    @Override
    protected void sleep() {
        System.out.println("유아는 낮잠을 건너뛰고 밤잠만 자요");
    }

    @Override
    protected void eat() {
        System.out.println("유아는 딱딱한 걸 먹기 시작해요");
    }
}