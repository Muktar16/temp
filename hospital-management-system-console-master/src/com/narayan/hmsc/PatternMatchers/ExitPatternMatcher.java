package com.narayan.hmsc.PatternMatchers;

public class ExitPatternMatcher implements MenuPatternMatcher{

    @Override
    public boolean matched(int choice) {
        return (choice!=1);
    }

    @Override
    public void response() {
        System.exit(0);
    }
}
