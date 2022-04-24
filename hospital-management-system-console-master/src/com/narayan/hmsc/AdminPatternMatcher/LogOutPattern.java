package com.narayan.hmsc.AdminPatternMatcher;

public class LogOutPattern implements AdminPatternMatcher{
    @Override
    public boolean matched(int choice) {
        return (choice==7);
    }

    @Override
    public void response() {
        admin.logout();
    }
}
