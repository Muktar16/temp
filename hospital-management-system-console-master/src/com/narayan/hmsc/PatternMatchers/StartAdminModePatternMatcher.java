package com.narayan.hmsc.PatternMatchers;

public class StartAdminModePatternMatcher implements MenuPatternMatcher{
    @Override
    public boolean matched(int choice) {
        return (choice==1);
    }

    @Override
    public void response() {
        hmsapp.startAdminMode();
    }
}
